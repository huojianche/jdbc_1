package myproject03.src.service;

import myproject03.src.domain.Architect;
import myproject03.src.domain.Designer;
import myproject03.src.domain.Employee;
import myproject03.src.domain.Programmer;


public class TeamService {

    private static int counter = 1;//给memberId赋值使用
    private int MAX_MEMBER = 5;//限制开发团队人数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;//记录开发团队实际人数

    public TeamService() {
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for(int i = 0;i < team.length;i++){
            team[i] =this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException{
//        成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
//        该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//        该员工已在本开发团队中
        if(isExist(e)){
            throw new TeamException("该员工已在开发团队中");
        }
//        该员工已是某团队成员
//        该员正在休假，无法添加
        Programmer p = (Programmer)e;
        if("BUYS".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员已经是某团队成员了");
        }else if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员正在休假，无法添加");
        }
//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员
        int numOfArch = 0;int numOfDes = 0;int numOfPro = 0;
        for(int i = 0; i < total;i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("已有一名架构师。无法添加");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("已有两名设计师。无法添加");
            }
        }else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("已有三名程序员。无法添加");
            }
        }

        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    private boolean isExist(Employee e){
        for(int i = 0;i < total;i++){
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for(;i < total;i++){
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if(i == total){
            throw new TeamException("找不到指定员工的memberId，删除失败");
        }
        for(int j = i;j < total - 1;j++){
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
