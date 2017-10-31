package manchicle.armony.bass;

import manchicle.armony.core.NotaEnum;

public enum BassSpaceEnum {
	
	primer(1, new NotaEnum[]{NotaEnum.C,NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos })
	, segundo(2, new NotaEnum[]{NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.A })
	, tercer(3, new NotaEnum[]{NotaEnum.D, NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.Asos })
	, cuarto(4, new NotaEnum[]{NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B })
	, quinto(5, new NotaEnum[]{NotaEnum.E, NotaEnum.A, NotaEnum.D, NotaEnum.G, NotaEnum.C })
	, sexto(6, new NotaEnum[]{NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.Csos })
	, septimo(7, new NotaEnum[]{NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.A, NotaEnum.D })
	, octavo(8, new NotaEnum[]{NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos })
	, noveno(9, new NotaEnum[]{NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B, NotaEnum.E })
	, decimo(10, new NotaEnum[]{NotaEnum.A, NotaEnum.D, NotaEnum.G, NotaEnum.C, NotaEnum.F })
	, decimoPrimer(11, new NotaEnum[]{NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.Fsos })
	, decimoSegundo(12, new NotaEnum[]{NotaEnum.B, NotaEnum.E, NotaEnum.A, NotaEnum.D, NotaEnum.G })
	, decimoTercer(13, new NotaEnum[]{NotaEnum.C, NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos })
	, decimoCuarto(14, new NotaEnum[]{NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.A })
	, decimoQuinto(15, new NotaEnum[]{NotaEnum.D, NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.Asos });
	;
	
	public NotaEnum[] notas;
	
	public int pos;
	
	private BassSpaceEnum(int pos, NotaEnum[] notas) {
		this.notas = notas;
		this.pos = pos;
	}
	
}
