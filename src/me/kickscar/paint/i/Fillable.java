package me.kickscar.paint.i;

public interface Fillable  extends Drawable{
	void allColors(String visablefill, String visableline);
	void fillColors(String visablefill);
	void lineColors(String visableline);//fillColor는 인터페이스로 불가능 draw로 귀결하는게 낫다
}
