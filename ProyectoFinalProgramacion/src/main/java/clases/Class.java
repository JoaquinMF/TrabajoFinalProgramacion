package clases;

import java.util.ArrayList;

public class Class extends NamedEntity{
	
	private String classDescription;
	private ArrayList<Skill> skillTree;
	
	public Class(String name, String classDescription, ArrayList<Skill> skillTree) {
		super(name);
		this.classDescription = classDescription;
		this.skillTree = skillTree;
	}

	public String getClassDescription() {
		return classDescription;
	}

	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	public ArrayList<Skill> getSkillTree() {
		return skillTree;
	}

	public void setSkillTree(ArrayList<Skill> skillTree) {
		this.skillTree = skillTree;
	}
	
	Class clawbringer=new Class("Clawbringer","Hit hard, punch harder",null);
	Class stabbomancer=new Class("Stabbomancer","Shanking never felt so good",null);
	

}
