package com.day09.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 삭제
	public boolean removeMember(int memberId) {
//		Iterator<Member> it = arrayList.iterator();
//		while(it.hasNext()) {
//			Member m = it.next();
//			if (m.getMemberId() == memberId) {
//				it.remove();
//				return true;
//			}
//		}
//		
		
		for (Member m : arrayList) {
			if (m.getMemberId() == memberId) {
				arrayList.remove(m);
				return true;
			}
		}
		return false;
	}

	public void showAllMember() {
		for (Member m : arrayList) {
			System.out.println(m);
		}
		
		System.out.println();
	}

}

