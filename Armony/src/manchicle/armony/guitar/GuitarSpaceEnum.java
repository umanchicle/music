package manchicle.armony.guitar;

import manchicle.armony.core.NotaEnum;

public enum GuitarSpaceEnum {
	
	primer(1, new NotaEnum[]{NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.C, NotaEnum.F})
	, segundo(2, new NotaEnum[]{NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.A, NotaEnum.Csos, NotaEnum.Fsos})
	, tercer(3, new NotaEnum[]{NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.Asos, NotaEnum.D, NotaEnum.G})
	, cuarto(4, new NotaEnum[]{NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B, NotaEnum.Dsos, NotaEnum.Gsos})
	, quinto(5, new NotaEnum[]{NotaEnum.A, NotaEnum.D, NotaEnum.G, NotaEnum.C, NotaEnum.E, NotaEnum.A})
	, sexto(6, new NotaEnum[]{NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.F, NotaEnum.Asos})
	, septimo(7, new NotaEnum[]{NotaEnum.B, NotaEnum.E, NotaEnum.A, NotaEnum.D, NotaEnum.Fsos, NotaEnum.B})
	, octavo(8, new NotaEnum[]{NotaEnum.C, NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.G, NotaEnum.C})
	, noveno(9, new NotaEnum[]{NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.Gsos, NotaEnum.Csos})
	, decimo(10, new NotaEnum[]{NotaEnum.D, NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.A, NotaEnum.D})
	, decimoPrimer(11, new NotaEnum[]{NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.Csos, NotaEnum.Fsos, NotaEnum.Asos, NotaEnum.Dsos})
	, decimoSegundo(12, new NotaEnum[]{NotaEnum.E, NotaEnum.A, NotaEnum.D, NotaEnum.G, NotaEnum.B, NotaEnum.E})
	, decimoTercer(13, new NotaEnum[]{NotaEnum.F, NotaEnum.Asos, NotaEnum.Dsos, NotaEnum.Gsos, NotaEnum.C, NotaEnum.F})
	, decimoCuarto(14, new NotaEnum[]{NotaEnum.Fsos, NotaEnum.B, NotaEnum.E, NotaEnum.A, NotaEnum.Csos, NotaEnum.Fsos})
	, decimoQuinto(15, new NotaEnum[]{NotaEnum.G, NotaEnum.C, NotaEnum.F, NotaEnum.Asos, NotaEnum.D, NotaEnum.G});
	;
	
	public NotaEnum[] notas;
	
	public int pos;
	
	private GuitarSpaceEnum(int pos, NotaEnum[] notas) {
		this.notas = notas;
		this.pos = pos;
	}
	
}
