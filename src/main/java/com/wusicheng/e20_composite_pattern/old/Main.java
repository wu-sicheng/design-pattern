package com.wusicheng.e20_composite_pattern.old;

import java.util.List;

/**
 * @author wsc
 * @date 2018/7/6
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Department infoDep = new Department("信息部门");
        Department devDep = new Department("研发部门");
        Department opsDep = new Department("运维部门");

        infoDep.addDepartment(devDep);
        infoDep.addDepartment(opsDep);

        Staff ccc = new Staff("ccc");
        Staff ddd = new Staff("ddd");
        devDep.addStaff(ccc);
        devDep.addStaff(ddd);

        Staff eee = new Staff("eee");
        Staff fff = new Staff("fff");
        opsDep.addStaff(eee);
        opsDep.addStaff(fff);

        new Main().info(infoDep);
    }

    public void info(Department department) {
        department.info();
        for (Staff staff : department.staffList) {
            staff.info();
        }
        for(Department department1 : department.departmentList) {
            info(department1);
        }
        /**
         * 信息部门
         * 研发部门
         * ccc
         * ddd
         * 运维部门
         * eee
         * fff
         */
    }
}
