package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public enum FuncionEnumExt   {
	FMinb9add2("hhh", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.h}, "-b9(add2)", 357)
	,Fb9add2("hhw", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.w}, "b9(add2)", 357)
	,FSusb9911("hhm", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.m}, "(susb9)911", 357)
	,FSusb99Sos11("hhM", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.M}, "(susb9)9#11", 357)
	,FSusb99("hhc", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.c}, "(susb9)9", 357)
	,FSusb99b13("hhC", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.C}, "(susb9)9b13", 357)
	,FSusb9913("hhQ", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.Q}, "(susb9)913", 357)
	,FSusb979("hhx", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.x}, "(susb9)79", 357)
	,FSusb9maj79("hhX", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.X}, "(susb9)maj79", 357)
	,FSusb99_1("hhs", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.s}, "(susb9)9", 357)
	,FSusb9b9add2("hhS", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.S}, "(susb9)b9(add2)", 357)
	,FSusb99add2("hhO", new TonoEnum[]{TonoEnum.h, TonoEnum.h, TonoEnum.O}, "(susb9)9(add2)", 357)
	,FMinb9addMaj3("hwh", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.h}, "-b9(add+3)", 357)
	,FMinb911("hww", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.w}, "-b911", 357)
	,FMinb9Sos11("hwm", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.m}, "-b9#11", 357)
	,FMinb9("hwM", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.M}, "-b9", 357)
	,FMinb9b13("hwc", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.c}, "-b9b13", 357)
	,FMinb913("hwC", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.C}, "-b913", 357)
	,FMin7b9("hwQ", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.Q}, "-7b9", 357)
	,FMinmaj7b9("hwx", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.x}, "-maj7b9", 357)
	,FMinb9_1("hwX", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.X}, "-b9", 357)
	,FMinb9addb2("hws", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.s}, "-b9(addb2)", 357)
	,FMinb9add2_1("hwS", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.S}, "-b9(add2)", 357)
	,FMinb9addMin3("hwO", new TonoEnum[]{TonoEnum.h, TonoEnum.w, TonoEnum.O}, "-b9(add-3)", 357)
	,Fb911("hmh", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.h}, "b911", 357)
	,Fb9Sos11("hmw", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.w}, "b9#11", 357)
	,Fb9("hmm", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.m}, "b9", 357)
	,Fb9b13("hmM", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.M}, "b9b13", 357)
	,Fb913("hmc", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.c}, "b913", 357)
	,F7b9("hmC", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.C}, "7b9", 357)
	,Fmaj7b9("hmQ", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.Q}, "maj7b9", 357)
	,Fb9_1("hmx", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.x}, "b9", 357)
	,Fb9addb2("hmX", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.X}, "b9(addb2)", 357)
	,Fb9add2_1("hms", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.s}, "b9(add2)", 357)
	,FMinb9addMaj3_1("hmS", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.S}, "-b9(add+3)", 357)
	,Fb9addMaj3("hmO", new TonoEnum[]{TonoEnum.h, TonoEnum.m, TonoEnum.O}, "b9(add+3)", 357)
	,FSusb911Sos11("hMh", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.h}, "(susb9)11#11", 357)
	,FSusb911("hMw", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.w}, "(susb9)11", 357)
	,FSusb911b13("hMm", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.m}, "(susb9)11b13", 357)
	,FSusb91113("hMM", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.M}, "(susb9)1113", 357)
	,FSusb9711("hMc", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.c}, "(susb9)711", 357)
	,FSusb9maj711("hMC", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.C}, "(susb9)maj711", 357)
	,FSusb911_1("hMQ", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.Q}, "(susb9)11", 357)
	,FSusb9b911("hMx", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.x}, "(susb9)b911", 357)
	,FSusb9911_1("hMX", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.X}, "(susb9)911", 357)
	,FMinb911_1("hMs", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.s}, "-b911", 357)
	,Fb911_1("hMS", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.S}, "b911", 357)
	,FSusb91111("hMO", new TonoEnum[]{TonoEnum.h, TonoEnum.M, TonoEnum.O}, "(susb9)1111", 357)
	,FSusb9Sos11("hch", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.h}, "(susb9)#11", 357)
	,FSusb9Sos11b13("hcw", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.w}, "(susb9)#11b13", 357)
	,FSusb9Sos1113("hcm", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.m}, "(susb9)#1113", 357)
	,FSusb97Sos11("hcM", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.M}, "(susb9)7#11", 357)
	,FSusb9maj7Sos11("hcc", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.c}, "(susb9)maj7#11", 357)
	,FSusb9Sos11_1("hcC", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.C}, "(susb9)#11", 357)
	,FSusb9b9Sos11("hcQ", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.Q}, "(susb9)b9#11", 357)
	,FSusb99Sos11_1("hcx", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.x}, "(susb9)9#11", 357)
	,FMinb9Sos11_1("hcX", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.X}, "-b9#11", 357)
	,Fb9Sos11_1("hcs", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.s}, "b9#11", 357)
	,FSusb911Sos11_1("hcS", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.S}, "(susb9)11#11", 357)
	,FSusb9Sos11Sos11("hcO", new TonoEnum[]{TonoEnum.h, TonoEnum.c, TonoEnum.O}, "(susb9)#11#11", 357)
	,FSusb9b13("hCh", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.h}, "(susb9)b13", 357)
	,FSusb913("hCw", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.w}, "(susb9)13", 357)
	,FSusb97("hCm", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.m}, "(susb9)7", 357)
	,FSusb9maj7("hCM", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.M}, "(susb9)maj7", 357)
	,FSusb9("hCc", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.c}, "(susb9)", 357)
	,FSusb9b9("hCC", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.C}, "(susb9)b9", 357)
	,FSusb99_2("hCQ", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.Q}, "(susb9)9", 357)
	,FMinb9_2("hCx", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.x}, "-b9", 357)
	,Fb9_2("hCX", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.X}, "b9", 357)
	,FSusb911_2("hCs", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.s}, "(susb9)11", 357)
	,FSusb9Sos11_2("hCS", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.S}, "(susb9)#11", 357)
	,FSusb9_1("hCO", new TonoEnum[]{TonoEnum.h, TonoEnum.C, TonoEnum.O}, "(susb9)", 357)
	,FSusb9b1313("hQh", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.h}, "(susb9)b1313", 357)
	,FSusb97b13("hQw", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.w}, "(susb9)7b13", 357)
	,FSusb9maj7b13("hQm", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.m}, "(susb9)maj7b13", 357)
	,FSusb9b13_1("hQM", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.M}, "(susb9)b13", 357)
	,FSusb9b9b13("hQc", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.c}, "(susb9)b9b13", 357)
	,FSusb99b13_1("hQC", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.C}, "(susb9)9b13", 357)
	,FMinb9b13_1("hQQ", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.Q}, "-b9b13", 357)
	,Fb9b13_1("hQx", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.x}, "b9b13", 357)
	,FSusb911b13_1("hQX", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.X}, "(susb9)11b13", 357)
	,FSusb9Sos11b13_1("hQs", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.s}, "(susb9)#11b13", 357)
	,FSusb9b13_2("hQS", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.S}, "(susb9)b13", 357)
	,FSusb9b13b13("hQO", new TonoEnum[]{TonoEnum.h, TonoEnum.Q, TonoEnum.O}, "(susb9)b13b13", 357)
	,FSusb9713("hxh", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.h}, "(susb9)713", 357)
	,FSusb9maj713("hxw", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.w}, "(susb9)maj713", 357)
	,FSusb913_1("hxm", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.m}, "(susb9)13", 357)
	,FSusb9b913("hxM", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.M}, "(susb9)b913", 357)
	,FSusb9913_1("hxc", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.c}, "(susb9)913", 357)
	,FMinb913_1("hxC", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.C}, "-b913", 357)
	,Fb913_1("hxQ", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.Q}, "b913", 357)
	,FSusb91113_1("hxx", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.x}, "(susb9)1113", 357)
	,FSusb9Sos1113_1("hxX", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.X}, "(susb9)#1113", 357)
	,FSusb913_2("hxs", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.s}, "(susb9)13", 357)
	,FSusb9b1313_1("hxS", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.S}, "(susb9)b1313", 357)
	,FSusb91313("hxO", new TonoEnum[]{TonoEnum.h, TonoEnum.x, TonoEnum.O}, "(susb9)1313", 357)
	,FSusb97addMaj7("hXh", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.h}, "(susb9)7(add+7)", 357)
	,FSusb97_1("hXw", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.w}, "(susb9)7", 357)
	,FSusb97b9("hXm", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.m}, "(susb9)7b9", 357)
	,FSusb979_1("hXM", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.M}, "(susb9)79", 357)
	,FMin7b9_1("hXc", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.c}, "-7b9", 357)
	,F7b9_1("hXC", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.C}, "7b9", 357)
	,FSusb9711_1("hXQ", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.Q}, "(susb9)711", 357)
	,FSusb97Sos11_1("hXx", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.x}, "(susb9)7#11", 357)
	,FSusb97_2("hXX", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.X}, "(susb9)7", 357)
	,FSusb97b13_1("hXs", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.s}, "(susb9)7b13", 357)
	,FSusb9713_1("hXS", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.S}, "(susb9)713", 357)
	,FSusb97add7("hXO", new TonoEnum[]{TonoEnum.h, TonoEnum.X, TonoEnum.O}, "(susb9)7(add7)", 357)
	,FSusb9maj7_1("hsh", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.h}, "(susb9)maj7", 357)
	,FSusb9maj7b9("hsw", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.w}, "(susb9)maj7b9", 357)
	,FSusb9maj79_1("hsm", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.m}, "(susb9)maj79", 357)
	,FMinmaj7b9_1("hsM", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.M}, "-maj7b9", 357)
	,Fmaj7b9_1("hsc", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.c}, "maj7b9", 357)
	,FSusb9maj711_1("hsC", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.C}, "(susb9)maj711", 357)
	,FSusb9maj7Sos11_1("hsQ", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.Q}, "(susb9)maj7#11", 357)
	,FSusb9maj7_2("hsx", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.x}, "(susb9)maj7", 357)
	,FSusb9maj7b13_1("hsX", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.X}, "(susb9)maj7b13", 357)
	,FSusb9maj713_1("hss", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.s}, "(susb9)maj713", 357)
	,FSusb97addMaj7_1("hsS", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.S}, "(susb9)7(add+7)", 357)
	,FSusb9maj7addMaj7("hsO", new TonoEnum[]{TonoEnum.h, TonoEnum.s, TonoEnum.O}, "(susb9)maj7(add+7)", 357)
	,FSusb9b9_1("hSh", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.h}, "(susb9)b9", 357)
	,FSusb99_3("hSw", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.w}, "(susb9)9", 357)
	,FMinb9_3("hSm", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.m}, "-b9", 357)
	,Fb9_3("hSM", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.M}, "b9", 357)
	,FSusb911_3("hSc", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.c}, "(susb9)11", 357)
	,FSusb9Sos11_3("hSC", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.C}, "(susb9)#11", 357)
	,FSusb9_2("hSQ", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.Q}, "(susb9)", 357)
	,FSusb9b13_3("hSx", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.x}, "(susb9)b13", 357)
	,FSusb913_3("hSX", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.X}, "(susb9)13", 357)
	,FSusb97_3("hSs", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.s}, "(susb9)7", 357)
	,FSusb9maj7_3("hSS", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.S}, "(susb9)maj7", 357)
	,FSusb9_3("hSO", new TonoEnum[]{TonoEnum.h, TonoEnum.S, TonoEnum.O}, "(susb9)", 357)
	,FSusb9b9add2_1("hOh", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.h}, "(susb9)b9(add2)", 357)
	,FMinb9addb2_1("hOw", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.w}, "-b9(addb2)", 357)
	,Fb9addb2_1("hOm", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.m}, "b9(addb2)", 357)
	,FSusb9b911_1("hOM", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.M}, "(susb9)b911", 357)
	,FSusb9b9Sos11_1("hOc", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.c}, "(susb9)b9#11", 357)
	,FSusb9b9_2("hOC", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.C}, "(susb9)b9", 357)
	,FSusb9b9b13_1("hOQ", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.Q}, "(susb9)b9b13", 357)
	,FSusb9b913_1("hOx", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.x}, "(susb9)b913", 357)
	,FSusb97b9_1("hOX", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.X}, "(susb9)7b9", 357)
	,FSusb9maj7b9_1("hOs", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.s}, "(susb9)maj7b9", 357)
	,FSusb9b9_3("hOS", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.S}, "(susb9)b9", 357)
	,FSusb9b9addb2("hOO", new TonoEnum[]{TonoEnum.h, TonoEnum.O, TonoEnum.O}, "(susb9)b9(addb2)", 357)
	,FMin9addMaj3("whh", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.h}, "-9(add+3)", 357)
	,FMin911("whw", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.w}, "-911", 357)
	,FMin9Sos11("whm", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.m}, "-9#11", 357)
	,FMin9("whM", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.M}, "-9", 357)
	,FMin9b13("whc", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.c}, "-9b13", 357)
	,FMin913("whC", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.C}, "-913", 357)
	,FMin79("whQ", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.Q}, "-79", 357)
	,FMinmaj79("whx", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.x}, "-maj79", 357)
	,FMin9_1("whX", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.X}, "-9", 357)
	,FMinb9add2_2("whs", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.s}, "-b9(add2)", 357)
	,FMin9add2("whS", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.S}, "-9(add2)", 357)
	,FMin9addMin3("whO", new TonoEnum[]{TonoEnum.w, TonoEnum.h, TonoEnum.O}, "-9(add-3)", 357)
	,F911("wwh", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.h}, "911", 357)
	,F9Sos11("www", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.w}, "9#11", 357)
	,F9("wwm", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.m}, "9", 357)
	,F9b13("wwM", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.M}, "9b13", 357)
	,F913("wwc", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.c}, "913", 357)
	,F79("wwC", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.C}, "79", 357)
	,Fmaj79("wwQ", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.Q}, "maj79", 357)
	,F9_1("wwx", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.x}, "9", 357)
	,Fb9add2_2("wwX", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.X}, "b9(add2)", 357)
	,F9add2("wws", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.s}, "9(add2)", 357)
	,FMin9addMaj3_1("wwS", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.S}, "-9(add+3)", 357)
	,F9addMaj3("wwO", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.O}, "9(add+3)", 357)
	,FSus911Sos11("wmh", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.h}, "(sus9)11#11", 357)
	,FSus911("wmw", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.w}, "(sus9)11", 357)
	,FSus911b13("wmm", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.m}, "(sus9)11b13", 357)
	,FSus91113("wmM", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.M}, "(sus9)1113", 357)
	,FSus9711("wmc", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.c}, "(sus9)711", 357)
	,FSus9maj711("wmC", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.C}, "(sus9)maj711", 357)
	,FSus911_1("wmQ", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.Q}, "(sus9)11", 357)
	,FSusb9911_2("wmx", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.x}, "(susb9)911", 357)
	,FSus9911("wmX", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.X}, "(sus9)911", 357)
	,FMin911_1("wms", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.s}, "-911", 357)
	,F911_1("wmS", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.S}, "911", 357)
	,FSus91111("wmO", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.O}, "(sus9)1111", 357)
	,FSus9Sos11("wMh", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.h}, "(sus9)#11", 357)
	,FSus9Sos11b13("wMw", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.w}, "(sus9)#11b13", 357)
	,FSus9Sos1113("wMm", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.m}, "(sus9)#1113", 357)
	,FSus97Sos11("wMM", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.M}, "(sus9)7#11", 357)
	,FSus9maj7Sos11("wMc", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.c}, "(sus9)maj7#11", 357)
	,FSus9Sos11_1("wMC", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.C}, "(sus9)#11", 357)
	,FSusb99Sos11_2("wMQ", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.Q}, "(susb9)9#11", 357)
	,FSus99Sos11("wMx", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.x}, "(sus9)9#11", 357)
	,FMin9Sos11_1("wMX", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.X}, "-9#11", 357)
	,F9Sos11_1("wMs", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.s}, "9#11", 357)
	,FSus911Sos11_1("wMS", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.S}, "(sus9)11#11", 357)
	,FSus9Sos11Sos11("wMO", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.O}, "(sus9)#11#11", 357)
	,FSus9b13("wch", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.h}, "(sus9)b13", 357)
	,FSus913("wcw", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.w}, "(sus9)13", 357)
	,FSus97("wcm", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.m}, "(sus9)7", 357)
	,FSus9maj7("wcM", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.M}, "(sus9)maj7", 357)
	,FSus9("wcc", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.c}, "(sus9)", 357)
	,FSusb99_4("wcC", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.C}, "(susb9)9", 357)
	,FSus99("wcQ", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.Q}, "(sus9)9", 357)
	,FMin9_2("wcx", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.x}, "-9", 357)
	,F9_2("wcX", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.X}, "9", 357)
	,FSus911_2("wcs", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.s}, "(sus9)11", 357)
	,FSus9Sos11_2("wcS", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.S}, "(sus9)#11", 357)
	,FSus9_1("wcO", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.O}, "(sus9)", 357)
	,FSus9b1313("wCh", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.h}, "(sus9)b1313", 357)
	,FSus97b13("wCw", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.w}, "(sus9)7b13", 357)
	,FSus9maj7b13("wCm", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.m}, "(sus9)maj7b13", 357)
	,FSus9b13_1("wCM", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.M}, "(sus9)b13", 357)
	,FSusb99b13_2("wCc", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.c}, "(susb9)9b13", 357)
	,FSus99b13("wCC", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.C}, "(sus9)9b13", 357)
	,FMin9b13_1("wCQ", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.Q}, "-9b13", 357)
	,F9b13_1("wCx", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.x}, "9b13", 357)
	,FSus911b13_1("wCX", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.X}, "(sus9)11b13", 357)
	,FSus9Sos11b13_1("wCs", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.s}, "(sus9)#11b13", 357)
	,FSus9b13_2("wCS", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.S}, "(sus9)b13", 357)
	,FSus9b13b13("wCO", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.O}, "(sus9)b13b13", 357)
	,FSus9713("wQh", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.h}, "(sus9)713", 357)
	,FSus9maj713("wQw", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.w}, "(sus9)maj713", 357)
	,FSus913_1("wQm", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.m}, "(sus9)13", 357)
	,FSusb9913_2("wQM", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.M}, "(susb9)913", 357)
	,FSus9913("wQc", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.c}, "(sus9)913", 357)
	,FMin913_1("wQC", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.C}, "-913", 357)
	,F913_1("wQQ", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.Q}, "913", 357)
	,FSus91113_1("wQx", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.x}, "(sus9)1113", 357)
	,FSus9Sos1113_1("wQX", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.X}, "(sus9)#1113", 357)
	,FSus913_2("wQs", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.s}, "(sus9)13", 357)
	,FSus9b1313_1("wQS", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.S}, "(sus9)b1313", 357)
	,FSus91313("wQO", new TonoEnum[]{TonoEnum.w, TonoEnum.Q, TonoEnum.O}, "(sus9)1313", 357)
	,FSus97addMaj7("wxh", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.h}, "(sus9)7(add+7)", 357)
	,FSus97_1("wxw", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.w}, "(sus9)7", 357)
	,FSusb979_2("wxm", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.m}, "(susb9)79", 357)
	,FSus979("wxM", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.M}, "(sus9)79", 357)
	,FMin79_1("wxc", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.c}, "-79", 357)
	,F79_1("wxC", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.C}, "79", 357)
	,FSus9711_1("wxQ", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.Q}, "(sus9)711", 357)
	,FSus97Sos11_1("wxx", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.x}, "(sus9)7#11", 357)
	,FSus97_2("wxX", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.X}, "(sus9)7", 357)
	,FSus97b13_1("wxs", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.s}, "(sus9)7b13", 357)
	,FSus9713_1("wxS", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.S}, "(sus9)713", 357)
	,FSus97add7("wxO", new TonoEnum[]{TonoEnum.w, TonoEnum.x, TonoEnum.O}, "(sus9)7(add7)", 357)
	,FSus9maj7_1("wXh", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.h}, "(sus9)maj7", 357)
	,FSusb9maj79_2("wXw", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.w}, "(susb9)maj79", 357)
	,FSus9maj79("wXm", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.m}, "(sus9)maj79", 357)
	,FMinmaj79_1("wXM", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.M}, "-maj79", 357)
	,Fmaj79_1("wXc", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.c}, "maj79", 357)
	,FSus9maj711_1("wXC", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.C}, "(sus9)maj711", 357)
	,FSus9maj7Sos11_1("wXQ", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.Q}, "(sus9)maj7#11", 357)
	,FSus9maj7_2("wXx", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.x}, "(sus9)maj7", 357)
	,FSus9maj7b13_1("wXX", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.X}, "(sus9)maj7b13", 357)
	,FSus9maj713_1("wXs", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.s}, "(sus9)maj713", 357)
	,FSus97addMaj7_1("wXS", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.S}, "(sus9)7(add+7)", 357)
	,FSus9maj7addMaj7("wXO", new TonoEnum[]{TonoEnum.w, TonoEnum.X, TonoEnum.O}, "(sus9)maj7(add+7)", 357)
	,FSusb99_5("wsh", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.h}, "(susb9)9", 357)
	,FSus99_1("wsw", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.w}, "(sus9)9", 357)
	,FMin9_3("wsm", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.m}, "-9", 357)
	,F9_3("wsM", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.M}, "9", 357)
	,FSus911_3("wsc", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.c}, "(sus9)11", 357)
	,FSus9Sos11_3("wsC", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.C}, "(sus9)#11", 357)
	,FSus9_2("wsQ", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.Q}, "(sus9)", 357)
	,FSus9b13_3("wsx", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.x}, "(sus9)b13", 357)
	,FSus913_3("wsX", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.X}, "(sus9)13", 357)
	,FSus97_3("wss", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.s}, "(sus9)7", 357)
	,FSus9maj7_3("wsS", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.S}, "(sus9)maj7", 357)
	,FSus9_3("wsO", new TonoEnum[]{TonoEnum.w, TonoEnum.s, TonoEnum.O}, "(sus9)", 357)
	,FSusb99add2_1("wSh", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.h}, "(susb9)9(add2)", 357)
	,FMinb9add2_3("wSw", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.w}, "-b9(add2)", 357)
	,Fb9add2_3("wSm", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.m}, "b9(add2)", 357)
	,FSusb9911_3("wSM", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.M}, "(susb9)911", 357)
	,FSusb99Sos11_3("wSc", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.c}, "(susb9)9#11", 357)
	,FSusb99_6("wSC", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.C}, "(susb9)9", 357)
	,FSusb99b13_3("wSQ", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.Q}, "(susb9)9b13", 357)
	,FSusb9913_3("wSx", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.x}, "(susb9)913", 357)
	,FSusb979_3("wSX", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.X}, "(susb9)79", 357)
	,FSusb9maj79_3("wSs", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.s}, "(susb9)maj79", 357)
	,FSusb99_7("wSS", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.S}, "(susb9)9", 357)
	,FSusb9b9add2_2("wSO", new TonoEnum[]{TonoEnum.w, TonoEnum.S, TonoEnum.O}, "(susb9)b9(add2)", 357)
	,FMin9add2_1("wOh", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.h}, "-9(add2)", 357)
	,F9add2_1("wOw", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.w}, "9(add2)", 357)
	,FSus9911_1("wOm", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.m}, "(sus9)911", 357)
	,FSus99Sos11_1("wOM", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.M}, "(sus9)9#11", 357)
	,FSus99_2("wOc", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.c}, "(sus9)9", 357)
	,FSus99b13_1("wOC", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.C}, "(sus9)9b13", 357)
	,FSus9913_1("wOQ", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.Q}, "(sus9)913", 357)
	,FSus979_1("wOx", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.x}, "(sus9)79", 357)
	,FSus9maj79_1("wOX", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.X}, "(sus9)maj79", 357)
	,FSus99_3("wOs", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.s}, "(sus9)9", 357)
	,FSusb99add2_2("wOS", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.S}, "(susb9)9(add2)", 357)
	,FSus99add2("wOO", new TonoEnum[]{TonoEnum.w, TonoEnum.O, TonoEnum.O}, "(sus9)9(add2)", 357)
	,FMin11addMaj3("mhh", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.h}, "-11(add+3)", 357)
	,FMinSos11addMaj3("mhw", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.w}, "-#11(add+3)", 357)
	,FMinaddMaj3("mhm", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.m}, "-(add+3)", 357)
	,FMinb13addMaj3("mhM", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.M}, "-b13(add+3)", 357)
	,FMin13addMaj3("mhc", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.c}, "-13(add+3)", 357)
	,FMin7addMaj3("mhC", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.C}, "-7(add+3)", 357)
	,FMinmaj7addMaj3("mhQ", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.Q}, "-maj7(add+3)", 357)
	,FMinaddMaj3_1("mhx", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.x}, "-(add+3)", 357)
	,FMinb9addMaj3_2("mhX", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.X}, "-b9(add+3)", 357)
	,FMin9addMaj3_2("mhs", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.s}, "-9(add+3)", 357)
	,FMinaddMin3addMaj3("mhS", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.S}, "-(add-3)(add+3)", 357)
	,FMinaddMaj3addMaj3("mhO", new TonoEnum[]{TonoEnum.m, TonoEnum.h, TonoEnum.O}, "-(add+3)(add+3)", 357)
	,FMin11Sos11("mwh", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.h}, "-11#11", 357)
	,FMin11("mww", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.w}, "-11", 357)
	,FMin11b13("mwm", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.m}, "-11b13", 357)
	,FMin1113("mwM", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.M}, "-1113", 357)
	,FMin711("mwc", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.c}, "-711", 357)
	,FMinmaj711("mwC", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.C}, "-maj711", 357)
	,FMin11_1("mwQ", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.Q}, "-11", 357)
	,FMinb911_2("mwx", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.x}, "-b911", 357)
	,FMin911_2("mwX", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.X}, "-911", 357)
	,FMin11addMin3("mws", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.s}, "-11(add-3)", 357)
	,FMin11addMaj3_1("mwS", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.S}, "-11(add+3)", 357)
	,FMin1111("mwO", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.O}, "-1111", 357)
	,FMinSos11("mmh", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.h}, "-#11", 357)
	,FMinSos11b13("mmw", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.w}, "-#11b13", 357)
	,FMinSos1113("mmm", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.m}, "-#1113", 357)
	,FMin7Sos11("mmM", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.M}, "-7#11", 357)
	,FMinmaj7Sos11("mmc", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.c}, "-maj7#11", 357)
	,FMinSos11_1("mmC", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.C}, "-#11", 357)
	,FMinb9Sos11_2("mmQ", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.Q}, "-b9#11", 357)
	,FMin9Sos11_2("mmx", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.x}, "-9#11", 357)
	,FMinSos11addMin3("mmX", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.X}, "-#11(add-3)", 357)
	,FMinSos11addMaj3_1("mms", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.s}, "-#11(add+3)", 357)
	,FMin11Sos11_1("mmS", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.S}, "-11#11", 357)
	,FMinSos11Sos11("mmO", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.O}, "-#11#11", 357)
	,FMinb13("mMh", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.h}, "-b13", 357)
	,FMin13("mMw", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.w}, "-13", 307)
	,FMin7("mMm", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.m}, "-7", 307)
	,FMinmaj7("mMM", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.M}, "-maj7", 357)
	,FMin("mMc", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.c}, "-", 300)
	,FMinb9_4("mMC", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.C}, "-b9", 357)
	,FMin9_4("mMQ", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.Q}, "-9", 357)
	,FMinaddMin3("mMx", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.x}, "-(add-3)", 357)
	,FMinaddMaj3_2("mMX", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.X}, "-(add+3)", 357)
	,FMin11_2("mMs", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.s}, "-11", 357)
	,FMinSos11_2("mMS", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.S}, "-#11", 357)
	,FMin_1("mMO", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.O}, "-", 357)
	,FMinb1313("mch", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.h}, "-b1313", 357)
	,FMin7b13("mcw", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.w}, "-7b13", 357)
	,FMinmaj7b13("mcm", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.m}, "-maj7b13", 357)
	,FMinb13_1("mcM", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.M}, "-b13", 357)
	,FMinb9b13_2("mcc", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.c}, "-b9b13", 357)
	,FMin9b13_2("mcC", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.C}, "-9b13", 357)
	,FMinb13addMin3("mcQ", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.Q}, "-b13(add-3)", 357)
	,FMinb13addMaj3_1("mcx", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.x}, "-b13(add+3)", 357)
	,FMin11b13_1("mcX", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.X}, "-11b13", 357)
	,FMinSos11b13_1("mcs", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.s}, "-#11b13", 357)
	,FMinb13_2("mcS", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.S}, "-b13", 357)
	,FMinb13b13("mcO", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.O}, "-b13b13", 357)
	,FMin713("mCh", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.h}, "-713", 357)
	,FMinmaj713("mCw", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.w}, "-maj713", 357)
	,FMin13_1("mCm", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.m}, "-13", 357)
	,FMinb913_2("mCM", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.M}, "-b913", 357)
	,FMin913_2("mCc", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.c}, "-913", 357)
	,FMin13addMin3("mCC", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.C}, "-13(add-3)", 357)
	,FMin13addMaj3_1("mCQ", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.Q}, "-13(add+3)", 357)
	,FMin1113_1("mCx", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.x}, "-1113", 357)
	,FMinSos1113_1("mCX", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.X}, "-#1113", 357)
	,FMin13_2("mCs", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.s}, "-13", 357)
	,FMinb1313_1("mCS", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.S}, "-b1313", 357)
	,FMin1313("mCO", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.O}, "-1313", 357)
	,FMin7addMaj7("mQh", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.h}, "-7(add+7)", 357)
	,FMin7_1("mQw", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.w}, "-7", 357)
	,FMin7b9_2("mQm", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.m}, "-7b9", 357)
	,FMin79_2("mQM", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.M}, "-79", 357)
	,FMin7addMin3("mQc", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.c}, "-7(add-3)", 357)
	,FMin7addMaj3_1("mQC", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.C}, "-7(add+3)", 357)
	,FMin711_1("mQQ", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.Q}, "-711", 357)
	,FMin7Sos11_1("mQx", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.x}, "-7#11", 357)
	,FMin7_2("mQX", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.X}, "-7", 357)
	,FMin7b13_1("mQs", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.s}, "-7b13", 357)
	,FMin713_1("mQS", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.S}, "-713", 357)
	,FMin7add7("mQO", new TonoEnum[]{TonoEnum.m, TonoEnum.Q, TonoEnum.O}, "-7(add7)", 357)
	,FMinmaj7_1("mxh", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.h}, "-maj7", 357)
	,FMinmaj7b9_2("mxw", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.w}, "-maj7b9", 357)
	,FMinmaj79_2("mxm", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.m}, "-maj79", 357)
	,FMinmaj7addMin3("mxM", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.M}, "-maj7(add-3)", 357)
	,FMinmaj7addMaj3_1("mxc", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.c}, "-maj7(add+3)", 357)
	,FMinmaj711_1("mxC", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.C}, "-maj711", 357)
	,FMinmaj7Sos11_1("mxQ", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.Q}, "-maj7#11", 357)
	,FMinmaj7_2("mxx", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.x}, "-maj7", 357)
	,FMinmaj7b13_1("mxX", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.X}, "-maj7b13", 357)
	,FMinmaj713_1("mxs", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.s}, "-maj713", 357)
	,FMin7addMaj7_1("mxS", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.S}, "-7(add+7)", 357)
	,FMinmaj7addMaj7("mxO", new TonoEnum[]{TonoEnum.m, TonoEnum.x, TonoEnum.O}, "-maj7(add+7)", 357)
	,FMinb9_5("mXh", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.h}, "-b9", 357)
	,FMin9_5("mXw", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.w}, "-9", 357)
	,FMinaddMin3_1("mXm", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.m}, "-(add-3)", 357)
	,FMinaddMaj3_3("mXM", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.M}, "-(add+3)", 357)
	,FMin11_3("mXc", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.c}, "-11", 357)
	,FMinSos11_3("mXC", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.C}, "-#11", 357)
	,FMin_2("mXQ", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.Q}, "-", 357)
	,FMinb13_3("mXx", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.x}, "-b13", 357)
	,FMin13_3("mXX", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.X}, "-13", 357)
	,FMin7_3("mXs", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.s}, "-7", 357)
	,FMinmaj7_3("mXS", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.S}, "-maj7", 357)
	,FMin_3("mXO", new TonoEnum[]{TonoEnum.m, TonoEnum.X, TonoEnum.O}, "-", 357)
	,FMinb9add2_4("msh", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.h}, "-b9(add2)", 357)
	,FMinb9addMin3_1("msw", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.w}, "-b9(add-3)", 357)
	,FMinb9addMaj3_3("msm", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.m}, "-b9(add+3)", 357)
	,FMinb911_3("msM", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.M}, "-b911", 357)
	,FMinb9Sos11_3("msc", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.c}, "-b9#11", 357)
	,FMinb9_6("msC", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.C}, "-b9", 357)
	,FMinb9b13_3("msQ", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.Q}, "-b9b13", 357)
	,FMinb913_3("msx", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.x}, "-b913", 357)
	,FMin7b9_3("msX", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.X}, "-7b9", 357)
	,FMinmaj7b9_3("mss", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.s}, "-maj7b9", 357)
	,FMinb9_7("msS", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.S}, "-b9", 357)
	,FMinb9addb2_2("msO", new TonoEnum[]{TonoEnum.m, TonoEnum.s, TonoEnum.O}, "-b9(addb2)", 357)
	,FMin9addMin3_1("mSh", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.h}, "-9(add-3)", 357)
	,FMin9addMaj3_3("mSw", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.w}, "-9(add+3)", 357)
	,FMin911_3("mSm", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.m}, "-911", 357)
	,FMin9Sos11_3("mSM", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.M}, "-9#11", 357)
	,FMin9_6("mSc", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.c}, "-9", 357)
	,FMin9b13_3("mSC", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.C}, "-9b13", 357)
	,FMin913_3("mSQ", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.Q}, "-913", 357)
	,FMin79_3("mSx", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.x}, "-79", 357)
	,FMinmaj79_3("mSX", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.X}, "-maj79", 357)
	,FMin9_7("mSs", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.s}, "-9", 357)
	,FMinb9add2_5("mSS", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.S}, "-b9(add2)", 357)
	,FMin9add2_2("mSO", new TonoEnum[]{TonoEnum.m, TonoEnum.S, TonoEnum.O}, "-9(add2)", 357)
	,FMinaddMin3addMaj3_1("mOh", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.h}, "-(add-3)(add+3)", 357)
	,FMin11addMin3_1("mOw", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.w}, "-11(add-3)", 357)
	,FMinSos11addMin3_1("mOm", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.m}, "-#11(add-3)", 357)
	,FMinaddMin3_2("mOM", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.M}, "-(add-3)", 357)
	,FMinb13addMin3_1("mOc", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.c}, "-b13(add-3)", 357)
	,FMin13addMin3_1("mOC", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.C}, "-13(add-3)", 357)
	,FMin7addMin3_1("mOQ", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.Q}, "-7(add-3)", 357)
	,FMinmaj7addMin3_1("mOx", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.x}, "-maj7(add-3)", 357)
	,FMinaddMin3_3("mOX", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.X}, "-(add-3)", 357)
	,FMinb9addMin3_2("mOs", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.s}, "-b9(add-3)", 357)
	,FMin9addMin3_2("mOS", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.S}, "-9(add-3)", 357)
	,FMinaddMin3addMin3("mOO", new TonoEnum[]{TonoEnum.m, TonoEnum.O, TonoEnum.O}, "-(add-3)(add-3)", 357)
	,F11Sos11("Mhh", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.h}, "11#11", 357)
	,F11("Mhw", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.w}, "11", 357)
	,F11b13("Mhm", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.m}, "11b13", 357)
	,F1113("MhM", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.M}, "1113", 357)
	,F711("Mhc", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.c}, "711", 357)
	,Fmaj711("MhC", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.C}, "maj711", 357)
	,/**Funcion maj11 MhQ	**/F11_1("MhQ", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.Q}, "11", 357)
	,Fb911_2("Mhx", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.x}, "b911", 357)
	,F911_2("MhX", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.X}, "911", 357)
	,FMin11addMaj3_2("Mhs", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.s}, "-11(add+3)", 357)
	,F11addMaj3("MhS", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.S}, "11(add+3)", 357)
	,F1111("MhO", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.O}, "1111", 357)
	,FSos11("Mwh", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.h}, "#11", 357)
	,FSos11b13("Mww", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.w}, "#11b13", 357)
	,FSos1113("Mwm", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.m}, "#1113", 357)
	,F7Sos11("MwM", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.M}, "7#11", 357)
	,Fmaj7Sos11("Mwc", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.c}, "maj7#11", 357)
	,FSos11_1("MwC", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.C}, "#11", 357)
	,Fb9Sos11_2("MwQ", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.Q}, "b9#11", 357)
	,F9Sos11_2("Mwx", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.x}, "9#11", 357)
	,FMinSos11addMaj3_2("MwX", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.X}, "-#11(add+3)", 357)
	,FSos11addMaj3("Mws", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.s}, "#11(add+3)", 357)
	,F11Sos11_1("MwS", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.S}, "11#11", 357)
	,FSos11Sos11("MwO", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.O}, "#11#11", 357)
	,Fb13("Mmh", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.h}, "b13", 357)
	,F13("Mmw", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.w}, "13", 357)
	,F7("Mmm", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.m}, "7", 357)
	,Fmaj7("MmM", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.M}, "maj7", 307)
	,FMaj("Mmc", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.c}, "", 357)
	,Fb9_4("MmC", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.C}, "b9", 357)
	,F9_4("MmQ", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.Q}, "9", 357)
	,FMinaddMaj3_4("Mmx", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.x}, "-(add+3)", 357)
	,FaddMaj3("MmX", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.X}, "(add+3)", 357)
	,F11_2("Mms", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.s}, "11", 357)
	,FSos11_2("MmS", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.S}, "#11", 357)
	,FMaj_1("MmO", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.O}, "", 357)
	,Fb1313("MMh", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.h}, "b1313", 357)
	,F7b13("MMw", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.w}, "7b13", 357)
	,Fmaj7b13("MMm", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.m}, "maj7b13", 357)
	,Fb13_1("MMM", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.M}, "b13", 357)
	,Fb9b13_2("MMc", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.c}, "b9b13", 357)
	,F9b13_2("MMC", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.C}, "9b13", 357)
	,FMinb13addMaj3_2("MMQ", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.Q}, "-b13(add+3)", 357)
	,Fb13addMaj3("MMx", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.x}, "b13(add+3)", 357)
	,F11b13_1("MMX", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.X}, "11b13", 357)
	,FSos11b13_1("MMs", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.s}, "#11b13", 357)
	,Fb13_2("MMS", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.S}, "b13", 357)
	,Fb13b13("MMO", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.O}, "b13b13", 357)
	,F713("Mch", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.h}, "713", 357)
	,Fmaj713("Mcw", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.w}, "maj713", 357)
	,F13_1("Mcm", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.m}, "13", 357)
	,Fb913_2("McM", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.M}, "b913", 357)
	,F913_2("Mcc", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.c}, "913", 357)
	,FMin13addMaj3_2("McC", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.C}, "-13(add+3)", 357)
	,F13addMaj3("McQ", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.Q}, "13(add+3)", 357)
	,F1113_1("Mcx", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.x}, "1113", 357)
	,FSos1113_1("McX", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.X}, "#1113", 357)
	,F13_2("Mcs", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.s}, "13", 357)
	,Fb1313_1("McS", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.S}, "b1313", 357)
	,F1313("McO", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.O}, "1313", 357)
	,F7addMaj7("MCh", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.h}, "7(add+7)", 357)
	,F7_1("MCw", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.w}, "7", 357)
	,F7b9_2("MCm", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.m}, "7b9", 357)
	,F79_2("MCM", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.M}, "79", 357)
	,FMin7addMaj3_2("MCc", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.c}, "-7(add+3)", 357)
	,F7addMaj3("MCC", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.C}, "7(add+3)", 357)
	,F711_1("MCQ", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.Q}, "711", 357)
	,F7Sos11_1("MCx", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.x}, "7#11", 357)
	,F7_2("MCX", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.X}, "7", 357)
	,F7b13_1("MCs", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.s}, "7b13", 357)
	,F713_1("MCS", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.S}, "713", 357)
	,F7add7("MCO", new TonoEnum[]{TonoEnum.M, TonoEnum.C, TonoEnum.O}, "7(add7)", 357)
	,Fmaj7_1("MQh", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.h}, "maj7", 357)
	,Fmaj7b9_2("MQw", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.w}, "maj7b9", 357)
	,Fmaj79_2("MQm", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.m}, "maj79", 357)
	,FMinmaj7addMaj3_2("MQM", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.M}, "-maj7(add+3)", 357)
	,Fmaj7addMaj3("MQc", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.c}, "maj7(add+3)", 357)
	,Fmaj711_1("MQC", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.C}, "maj711", 357)
	,Fmaj7Sos11_1("MQQ", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.Q}, "maj7#11", 357)
	,Fmaj7_2("MQx", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.x}, "maj7", 307)
	,Fmaj7b13_1("MQX", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.X}, "maj7b13", 307)
	,Fmaj713_1("MQs", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.s}, "maj713", 357)
	,F7addMaj7_1("MQS", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.S}, "7(add+7)", 357)
	,Fmaj7addMaj7("MQO", new TonoEnum[]{TonoEnum.M, TonoEnum.Q, TonoEnum.O}, "maj7(add+7)", 357)
	,Fb9_5("Mxh", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.h}, "b9", 357)
	,F9_5("Mxw", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.w}, "9", 357)
	,FMinaddMaj3_5("Mxm", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.m}, "-(add+3)", 357)
	,FaddMaj3_1("MxM", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.M}, "(add+3)", 357)
	,F11_3("Mxc", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.c}, "11", 357)
	,FSos11_3("MxC", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.C}, "#11", 357)
	,FMaj_2("MxQ", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.Q}, "", 357)
	,Fb13_3("Mxx", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.x}, "b13", 357)
	,F13_3("MxX", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.X}, "13", 357)
	,F7_3("Mxs", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.s}, "7", 357)
	,Fmaj7_3("MxS", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.S}, "maj7", 307)
	,FMaj_3("MxO", new TonoEnum[]{TonoEnum.M, TonoEnum.x, TonoEnum.O}, "", 357)
	,Fb9add2_4("MXh", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.h}, "b9(add2)", 357)
	,FMinb9addMaj3_4("MXw", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.w}, "-b9(add+3)", 357)
	,Fb9addMaj3_1("MXm", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.m}, "b9(add+3)", 357)
	,Fb911_3("MXM", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.M}, "b911", 357)
	,Fb9Sos11_3("MXc", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.c}, "b9#11", 357)
	,Fb9_6("MXC", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.C}, "b9", 357)
	,Fb9b13_3("MXQ", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.Q}, "b9b13", 357)
	,Fb913_3("MXx", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.x}, "b913", 357)
	,F7b9_3("MXX", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.X}, "7b9", 357)
	,Fmaj7b9_3("MXs", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.s}, "maj7b9", 357)
	,Fb9_7("MXS", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.S}, "b9", 357)
	,Fb9addb2_2("MXO", new TonoEnum[]{TonoEnum.M, TonoEnum.X, TonoEnum.O}, "b9(addb2)", 357)
	,FMin9addMaj3_4("Msh", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.h}, "-9(add+3)", 357)
	,F9addMaj3_1("Msw", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.w}, "9(add+3)", 357)
	,F911_3("Msm", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.m}, "911", 357)
	,F9Sos11_3("MsM", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.M}, "9#11", 357)
	,F9_6("Msc", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.c}, "9", 357)
	,F9b13_3("MsC", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.C}, "9b13", 357)
	,F913_3("MsQ", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.Q}, "913", 357)
	,F79_3("Msx", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.x}, "79", 357)
	,Fmaj79_3("MsX", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.X}, "maj79", 357)
	,F9_7("Mss", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.s}, "9", 357)
	,Fb9add2_5("MsS", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.S}, "b9(add2)", 357)
	,F9add2_2("MsO", new TonoEnum[]{TonoEnum.M, TonoEnum.s, TonoEnum.O}, "9(add2)", 357)
	,FMinaddMaj3addMaj3_1("MSh", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.h}, "-(add+3)(add+3)", 357)
	,FMin11addMaj3_3("MSw", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.w}, "-11(add+3)", 357)
	,FMinSos11addMaj3_3("MSm", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.m}, "-#11(add+3)", 357)
	,FMinaddMaj3_6("MSM", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.M}, "-(add+3)", 357)
	,FMinb13addMaj3_3("MSc", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.c}, "-b13(add+3)", 357)
	,FMin13addMaj3_3("MSC", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.C}, "-13(add+3)", 357)
	,FMin7addMaj3_3("MSQ", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.Q}, "-7(add+3)", 357)
	,FMinmaj7addMaj3_3("MSx", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.x}, "-maj7(add+3)", 357)
	,FMinaddMaj3_7("MSX", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.X}, "-(add+3)", 357)
	,FMinb9addMaj3_5("MSs", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.s}, "-b9(add+3)", 357)
	,FMin9addMaj3_5("MSS", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.S}, "-9(add+3)", 357)
	,FMinaddMin3addMaj3_2("MSO", new TonoEnum[]{TonoEnum.M, TonoEnum.S, TonoEnum.O}, "-(add-3)(add+3)", 357)
	,F11addMaj3_1("MOh", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.h}, "11(add+3)", 357)
	,FSos11addMaj3_1("MOw", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.w}, "#11(add+3)", 357)
	,FaddMaj3_2("MOm", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.m}, "(add+3)", 357)
	,Fb13addMaj3_1("MOM", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.M}, "b13(add+3)", 357)
	,F13addMaj3_1("MOc", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.c}, "13(add+3)", 357)
	,F7addMaj3_1("MOC", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.C}, "7(add+3)", 357)
	,Fmaj7addMaj3_1("MOQ", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.Q}, "maj7(add+3)", 357)
	,FaddMaj3_3("MOx", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.x}, "(add+3)", 357)
	,Fb9addMaj3_2("MOX", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.X}, "b9(add+3)", 357)
	,F9addMaj3_2("MOs", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.s}, "9(add+3)", 357)
	,FMinaddMaj3addMaj3_2("MOS", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.S}, "-(add+3)(add+3)", 357)
	,FaddMaj3addMaj3("MOO", new TonoEnum[]{TonoEnum.M, TonoEnum.O, TonoEnum.O}, "(add+3)(add+3)", 357)
	,FSus11Sos11("chh", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.h}, "(sus11)#11", 357)
	,FSus11Sos11b13("chw", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.w}, "(sus11)#11b13", 357)
	,FSus11Sos1113("chm", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.m}, "(sus11)#1113", 357)
	,FSus117Sos11("chM", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.M}, "(sus11)7#11", 357)
	,FSus11maj7Sos11("chc", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.c}, "(sus11)maj7#11", 357)
	,FSus11Sos11_1("chC", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.C}, "(sus11)#11", 357)
	,FSusb911Sos11_2("chQ", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.Q}, "(susb9)11#11", 357)
	,FSus911Sos11_2("chx", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.x}, "(sus9)11#11", 357)
	,FMin11Sos11_2("chX", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.X}, "-11#11", 357)
	,F11Sos11_2("chs", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.s}, "11#11", 357)
	,FSus1111Sos11("chS", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.S}, "(sus11)11#11", 357)
	,FSus11Sos11Sos11("chO", new TonoEnum[]{TonoEnum.c, TonoEnum.h, TonoEnum.O}, "(sus11)#11#11", 357)
	,FSus11b13("cwh", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.h}, "(sus11)b13", 357)
	,FSus1113("cww", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.w}, "(sus11)13", 357)
	,FSus117("cwm", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.m}, "(sus11)7", 357)
	,FSus11maj7("cwM", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.M}, "(sus11)maj7", 357)
	,FSus11("cwc", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.c}, "(sus11)", 357)
	,FSusb911_4("cwC", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.C}, "(susb9)11", 357)
	,FSus911_4("cwQ", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.Q}, "(sus9)11", 357)
	,FMin11_4("cwx", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.x}, "-11", 357)
	,F11_4("cwX", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.X}, "11", 357)
	,FSus1111("cws", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.s}, "(sus11)11", 357)
	,FSus11Sos11_2("cwS", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.S}, "(sus11)#11", 357)
	,FSus11_1("cwO", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.O}, "(sus11)", 357)
	,FSus11b1313("cmh", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.h}, "(sus11)b1313", 357)
	,FSus117b13("cmw", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.w}, "(sus11)7b13", 357)
	,FSus11maj7b13("cmm", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.m}, "(sus11)maj7b13", 357)
	,FSus11b13_1("cmM", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.M}, "(sus11)b13", 357)
	,FSusb911b13_2("cmc", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.c}, "(susb9)11b13", 357)
	,FSus911b13_2("cmC", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.C}, "(sus9)11b13", 357)
	,FMin11b13_2("cmQ", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.Q}, "-11b13", 357)
	,F11b13_2("cmx", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.x}, "11b13", 357)
	,FSus1111b13("cmX", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.X}, "(sus11)11b13", 357)
	,FSus11Sos11b13_1("cms", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.s}, "(sus11)#11b13", 357)
	,FSus11b13_2("cmS", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.S}, "(sus11)b13", 357)
	,FSus11b13b13("cmO", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.O}, "(sus11)b13b13", 357)
	,FSus11713("cMh", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.h}, "(sus11)713", 357)
	,FSus11maj713("cMw", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.w}, "(sus11)maj713", 357)
	,FSus1113_1("cMm", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.m}, "(sus11)13", 357)
	,FSusb91113_2("cMM", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.M}, "(susb9)1113", 357)
	,FSus91113_2("cMc", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.c}, "(sus9)1113", 357)
	,FMin1113_2("cMC", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.C}, "-1113", 357)
	,F1113_2("cMQ", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.Q}, "1113", 357)
	,FSus111113("cMx", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.x}, "(sus11)1113", 357)
	,FSus11Sos1113_1("cMX", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.X}, "(sus11)#1113", 357)
	,FSus1113_2("cMs", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.s}, "(sus11)13", 357)
	,FSus11b1313_1("cMS", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.S}, "(sus11)b1313", 357)
	,FSus111313("cMO", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.O}, "(sus11)1313", 357)
	,FSus117addMaj7("cch", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.h}, "(sus11)7(add+7)", 357)
	,FSus117_1("ccw", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.w}, "(sus11)7", 357)
	,FSusb9711_2("ccm", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.m}, "(susb9)711", 357)
	,FSus9711_2("ccM", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.M}, "(sus9)711", 357)
	,FMin711_2("ccc", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.c}, "-711", 357)
	,F711_2("ccC", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.C}, "711", 357)
	,FSus11711("ccQ", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.Q}, "(sus11)711", 357)
	,FSus117Sos11_1("ccx", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.x}, "(sus11)7#11", 357)
	,FSus117_2("ccX", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.X}, "(sus11)7", 357)
	,FSus117b13_1("ccs", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.s}, "(sus11)7b13", 357)
	,FSus11713_1("ccS", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.S}, "(sus11)713", 357)
	,FSus117add7("ccO", new TonoEnum[]{TonoEnum.c, TonoEnum.c, TonoEnum.O}, "(sus11)7(add7)", 357)
	,FSus11maj7_1("cCh", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.h}, "(sus11)maj7", 357)
	,FSusb9maj711_2("cCw", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.w}, "(susb9)maj711", 357)
	,FSus9maj711_2("cCm", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.m}, "(sus9)maj711", 357)
	,FMinmaj711_2("cCM", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.M}, "-maj711", 357)
	,Fmaj711_2("cCc", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.c}, "maj711", 357)
	,FSus11maj711("cCC", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.C}, "(sus11)maj711", 357)
	,FSus11maj7Sos11_1("cCQ", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.Q}, "(sus11)maj7#11", 357)
	,FSus11maj7_2("cCx", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.x}, "(sus11)maj7", 357)
	,FSus11maj7b13_1("cCX", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.X}, "(sus11)maj7b13", 357)
	,FSus11maj713_1("cCs", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.s}, "(sus11)maj713", 357)
	,FSus117addMaj7_1("cCS", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.S}, "(sus11)7(add+7)", 357)
	,FSus11maj7addMaj7("cCO", new TonoEnum[]{TonoEnum.c, TonoEnum.C, TonoEnum.O}, "(sus11)maj7(add+7)", 357)
	,FSusb911_5("cQh", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.h}, "(susb9)11", 357)
	,FSus911_5("cQw", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.w}, "(sus9)11", 357)
	,FMin11_5("cQm", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.m}, "-11", 357)
	,F11_5("cQM", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.M}, "11", 357)
	,FSus1111_1("cQc", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.c}, "(sus11)11", 357)
	,FSus11Sos11_3("cQC", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.C}, "(sus11)#11", 357)
	,FSus11_2("cQQ", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.Q}, "(sus11)", 357)
	,FSus11b13_3("cQx", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.x}, "(sus11)b13", 357)
	,FSus1113_3("cQX", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.X}, "(sus11)13", 357)
	,FSus117_3("cQs", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.s}, "(sus11)7", 357)
	,FSus11maj7_3("cQS", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.S}, "(sus11)maj7", 357)
	,FSus11_3("cQO", new TonoEnum[]{TonoEnum.c, TonoEnum.Q, TonoEnum.O}, "(sus11)", 357)
	,FSusb9911_4("cxh", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.h}, "(susb9)911", 357)
	,FMinb911_4("cxw", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.w}, "-b911", 357)
	,Fb911_4("cxm", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.m}, "b911", 357)
	,FSusb91111_1("cxM", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.M}, "(susb9)1111", 357)
	,FSusb911Sos11_3("cxc", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.c}, "(susb9)11#11", 357)
	,FSusb911_6("cxC", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.C}, "(susb9)11", 357)
	,FSusb911b13_3("cxQ", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.Q}, "(susb9)11b13", 357)
	,FSusb91113_3("cxx", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.x}, "(susb9)1113", 357)
	,FSusb9711_3("cxX", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.X}, "(susb9)711", 357)
	,FSusb9maj711_3("cxs", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.s}, "(susb9)maj711", 357)
	,FSusb911_7("cxS", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.S}, "(susb9)11", 357)
	,FSusb9b911_2("cxO", new TonoEnum[]{TonoEnum.c, TonoEnum.x, TonoEnum.O}, "(susb9)b911", 357)
	,FMin911_4("cXh", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.h}, "-911", 357)
	,F911_4("cXw", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.w}, "911", 357)
	,FSus91111_1("cXm", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.m}, "(sus9)1111", 357)
	,FSus911Sos11_3("cXM", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.M}, "(sus9)11#11", 357)
	,FSus911_6("cXc", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.c}, "(sus9)11", 357)
	,FSus911b13_3("cXC", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.C}, "(sus9)11b13", 357)
	,FSus91113_3("cXQ", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.Q}, "(sus9)1113", 357)
	,FSus9711_3("cXx", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.x}, "(sus9)711", 357)
	,FSus9maj711_3("cXX", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.X}, "(sus9)maj711", 357)
	,FSus911_7("cXs", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.s}, "(sus9)11", 357)
	,FSusb9911_5("cXS", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.S}, "(susb9)911", 357)
	,FSus9911_2("cXO", new TonoEnum[]{TonoEnum.c, TonoEnum.X, TonoEnum.O}, "(sus9)911", 357)
	,FMin11addMaj3_4("csh", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.h}, "-11(add+3)", 357)
	,FMin1111_1("csw", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.w}, "-1111", 357)
	,FMin11Sos11_3("csm", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.m}, "-11#11", 357)
	,FMin11_6("csM", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.M}, "-11", 357)
	,FMin11b13_3("csc", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.c}, "-11b13", 357)
	,FMin1113_3("csC", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.C}, "-1113", 357)
	,FMin711_3("csQ", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.Q}, "-711", 357)
	,FMinmaj711_3("csx", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.x}, "-maj711", 357)
	,FMin11_7("csX", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.X}, "-11", 357)
	,FMinb911_5("css", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.s}, "-b911", 357)
	,FMin911_5("csS", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.S}, "-911", 357)
	,FMin11addMin3_2("csO", new TonoEnum[]{TonoEnum.c, TonoEnum.s, TonoEnum.O}, "-11(add-3)", 357)
	,F1111_1("cSh", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.h}, "1111", 357)
	,F11Sos11_3("cSw", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.w}, "11#11", 357)
	,F11_6("cSm", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.m}, "11", 357)
	,F11b13_3("cSM", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.M}, "11b13", 357)
	,F1113_3("cSc", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.c}, "1113", 357)
	,F711_3("cSC", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.C}, "711", 357)
	,Fmaj711_3("cSQ", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.Q}, "maj711", 357)
	,F11_7("cSx", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.x}, "11", 357)
	,Fb911_5("cSX", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.X}, "b911", 357)
	,F911_5("cSs", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.s}, "911", 357)
	,FMin11addMaj3_5("cSS", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.S}, "-11(add+3)", 357)
	,F11addMaj3_2("cSO", new TonoEnum[]{TonoEnum.c, TonoEnum.S, TonoEnum.O}, "11(add+3)", 357)
	,FSus1111Sos11_1("cOh", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.h}, "(sus11)11#11", 357)
	,FSus1111_2("cOw", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.w}, "(sus11)11", 357)
	,FSus1111b13_1("cOm", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.m}, "(sus11)11b13", 357)
	,FSus111113_1("cOM", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.M}, "(sus11)1113", 357)
	,FSus11711_1("cOc", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.c}, "(sus11)711", 357)
	,FSus11maj711_1("cOC", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.C}, "(sus11)maj711", 357)
	,FSus1111_3("cOQ", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.Q}, "(sus11)11", 357)
	,FSusb91111_2("cOx", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.x}, "(susb9)1111", 357)
	,FSus91111_2("cOX", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.X}, "(sus9)1111", 357)
	,FMin1111_2("cOs", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.s}, "-1111", 357)
	,F1111_2("cOS", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.S}, "1111", 357)
	,FSus111111("cOO", new TonoEnum[]{TonoEnum.c, TonoEnum.O, TonoEnum.O}, "(sus11)1111", 357)
	,FSusSos11b13("Chh", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.h}, "(sus#11)b13", 357)
	,FSusSos1113("Chw", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.w}, "(sus#11)13", 357)
	,FSusSos117("Chm", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.m}, "(sus#11)7", 357)
	,FSusSos11maj7("ChM", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.M}, "(sus#11)maj7", 357)
	,FSusSos11("Chc", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.c}, "(sus#11)", 357)
	,FSusb9Sos11_4("ChC", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.C}, "(susb9)#11", 357)
	,FSus9Sos11_4("ChQ", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.Q}, "(sus9)#11", 357)
	,FMinSos11_4("Chx", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.x}, "-#11", 357)
	,FSos11_4("ChX", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.X}, "#11", 357)
	,FSus11Sos11_4("Chs", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.s}, "(sus11)#11", 357)
	,FSusSos11Sos11("ChS", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.S}, "(sus#11)#11", 357)
	,FSusSos11_1("ChO", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.O}, "(sus#11)", 357)
	,FSusSos11b1313("Cwh", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.h}, "(sus#11)b1313", 357)
	,FSusSos117b13("Cww", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.w}, "(sus#11)7b13", 357)
	,FSusSos11maj7b13("Cwm", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.m}, "(sus#11)maj7b13", 357)
	,FSusSos11b13_1("CwM", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.M}, "(sus#11)b13", 357)
	,FSusb9Sos11b13_2("Cwc", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.c}, "(susb9)#11b13", 357)
	,FSus9Sos11b13_2("CwC", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.C}, "(sus9)#11b13", 357)
	,FMinSos11b13_2("CwQ", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.Q}, "-#11b13", 357)
	,FSos11b13_2("Cwx", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.x}, "#11b13", 357)
	,FSus11Sos11b13_2("CwX", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.X}, "(sus11)#11b13", 357)
	,FSusSos11Sos11b13("Cws", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.s}, "(sus#11)#11b13", 357)
	,FSusSos11b13_2("CwS", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.S}, "(sus#11)b13", 357)
	,FSusSos11b13b13("CwO", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.O}, "(sus#11)b13b13", 357)
	,FSusSos11713("Cmh", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.h}, "(sus#11)713", 357)
	,FSusSos11maj713("Cmw", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.w}, "(sus#11)maj713", 357)
	,FSusSos1113_1("Cmm", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.m}, "(sus#11)13", 357)
	,FSusb9Sos1113_2("CmM", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.M}, "(susb9)#1113", 357)
	,FSus9Sos1113_2("Cmc", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.c}, "(sus9)#1113", 357)
	,FMinSos1113_2("CmC", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.C}, "-#1113", 357)
	,FSos1113_2("CmQ", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.Q}, "#1113", 357)
	,FSus11Sos1113_2("Cmx", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.x}, "(sus11)#1113", 357)
	,FSusSos11Sos1113("CmX", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.X}, "(sus#11)#1113", 357)
	,FSusSos1113_2("Cms", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.s}, "(sus#11)13", 357)
	,FSusSos11b1313_1("CmS", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.S}, "(sus#11)b1313", 357)
	,FSusSos111313("CmO", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.O}, "(sus#11)1313", 357)
	,FSusSos117addMaj7("CMh", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.h}, "(sus#11)7(add+7)", 357)
	,FSusSos117_1("CMw", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.w}, "(sus#11)7", 357)
	,FSusb97Sos11_2("CMm", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.m}, "(susb9)7#11", 357)
	,FSus97Sos11_2("CMM", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.M}, "(sus9)7#11", 357)
	,FMin7Sos11_2("CMc", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.c}, "-7#11", 357)
	,F7Sos11_2("CMC", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.C}, "7#11", 357)
	,FSus117Sos11_2("CMQ", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.Q}, "(sus11)7#11", 357)
	,FSusSos117Sos11("CMx", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.x}, "(sus#11)7#11", 357)
	,FSusSos117_2("CMX", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.X}, "(sus#11)7", 357)
	,FSusSos117b13_1("CMs", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.s}, "(sus#11)7b13", 357)
	,FSusSos11713_1("CMS", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.S}, "(sus#11)713", 357)
	,FSusSos117add7("CMO", new TonoEnum[]{TonoEnum.C, TonoEnum.M, TonoEnum.O}, "(sus#11)7(add7)", 357)
	,FSusSos11maj7_1("Cch", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.h}, "(sus#11)maj7", 357)
	,FSusb9maj7Sos11_2("Ccw", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.w}, "(susb9)maj7#11", 357)
	,FSus9maj7Sos11_2("Ccm", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.m}, "(sus9)maj7#11", 357)
	,FMinmaj7Sos11_2("CcM", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.M}, "-maj7#11", 357)
	,Fmaj7Sos11_2("Ccc", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.c}, "maj7#11", 357)
	,FSus11maj7Sos11_2("CcC", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.C}, "(sus11)maj7#11", 357)
	,FSusSos11maj7Sos11("CcQ", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.Q}, "(sus#11)maj7#11", 357)
	,FSusSos11maj7_2("Ccx", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.x}, "(sus#11)maj7", 357)
	,FSusSos11maj7b13_1("CcX", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.X}, "(sus#11)maj7b13", 357)
	,FSusSos11maj713_1("Ccs", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.s}, "(sus#11)maj713", 357)
	,FSusSos117addMaj7_1("CcS", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.S}, "(sus#11)7(add+7)", 357)
	,FSusSos11maj7addMaj7("CcO", new TonoEnum[]{TonoEnum.C, TonoEnum.c, TonoEnum.O}, "(sus#11)maj7(add+7)", 357)
	,FSusb9Sos11_5("CCh", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.h}, "(susb9)#11", 357)
	,FSus9Sos11_5("CCw", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.w}, "(sus9)#11", 357)
	,FMinSos11_5("CCm", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.m}, "-#11", 357)
	,FSos11_5("CCM", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.M}, "#11", 357)
	,FSus11Sos11_5("CCc", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.c}, "(sus11)#11", 357)
	,FSusSos11Sos11_1("CCC", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.C}, "(sus#11)#11", 357)
	,FSusSos11_2("CCQ", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.Q}, "(sus#11)", 357)
	,FSusSos11b13_3("CCx", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.x}, "(sus#11)b13", 357)
	,FSusSos1113_3("CCX", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.X}, "(sus#11)13", 357)
	,FSusSos117_3("CCs", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.s}, "(sus#11)7", 357)
	,FSusSos11maj7_3("CCS", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.S}, "(sus#11)maj7", 357)
	,FSusSos11_3("CCO", new TonoEnum[]{TonoEnum.C, TonoEnum.C, TonoEnum.O}, "(sus#11)", 357)
	,FSusb99Sos11_4("CQh", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.h}, "(susb9)9#11", 357)
	,FMinb9Sos11_4("CQw", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.w}, "-b9#11", 357)
	,Fb9Sos11_4("CQm", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.m}, "b9#11", 357)
	,FSusb911Sos11_4("CQM", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.M}, "(susb9)11#11", 357)
	,FSusb9Sos11Sos11_1("CQc", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.c}, "(susb9)#11#11", 357)
	,FSusb9Sos11_6("CQC", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.C}, "(susb9)#11", 357)
	,FSusb9Sos11b13_3("CQQ", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.Q}, "(susb9)#11b13", 357)
	,FSusb9Sos1113_3("CQx", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.x}, "(susb9)#1113", 357)
	,FSusb97Sos11_3("CQX", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.X}, "(susb9)7#11", 357)
	,FSusb9maj7Sos11_3("CQs", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.s}, "(susb9)maj7#11", 357)
	,FSusb9Sos11_7("CQS", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.S}, "(susb9)#11", 357)
	,FSusb9b9Sos11_2("CQO", new TonoEnum[]{TonoEnum.C, TonoEnum.Q, TonoEnum.O}, "(susb9)b9#11", 357)
	,FMin9Sos11_4("Cxh", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.h}, "-9#11", 357)
	,F9Sos11_4("Cxw", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.w}, "9#11", 357)
	,FSus911Sos11_4("Cxm", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.m}, "(sus9)11#11", 357)
	,FSus9Sos11Sos11_1("CxM", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.M}, "(sus9)#11#11", 357)
	,FSus9Sos11_6("Cxc", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.c}, "(sus9)#11", 357)
	,FSus9Sos11b13_3("CxC", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.C}, "(sus9)#11b13", 357)
	,FSus9Sos1113_3("CxQ", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.Q}, "(sus9)#1113", 357)
	,FSus97Sos11_3("Cxx", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.x}, "(sus9)7#11", 357)
	,FSus9maj7Sos11_3("CxX", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.X}, "(sus9)maj7#11", 357)
	,FSus9Sos11_7("Cxs", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.s}, "(sus9)#11", 357)
	,FSusb99Sos11_5("CxS", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.S}, "(susb9)9#11", 357)
	,FSus99Sos11_2("CxO", new TonoEnum[]{TonoEnum.C, TonoEnum.x, TonoEnum.O}, "(sus9)9#11", 357)
	,FMinSos11addMaj3_4("CXh", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.h}, "-#11(add+3)", 357)
	,FMin11Sos11_4("CXw", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.w}, "-11#11", 357)
	,FMinSos11Sos11_1("CXm", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.m}, "-#11#11", 357)
	,FMinSos11_6("CXM", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.M}, "-#11", 357)
	,FMinSos11b13_3("CXc", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.c}, "-#11b13", 357)
	,FMinSos1113_3("CXC", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.C}, "-#1113", 357)
	,FMin7Sos11_3("CXQ", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.Q}, "-7#11", 357)
	,FMinmaj7Sos11_3("CXx", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.x}, "-maj7#11", 357)
	,FMinSos11_7("CXX", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.X}, "-#11", 357)
	,FMinb9Sos11_5("CXs", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.s}, "-b9#11", 357)
	,FMin9Sos11_5("CXS", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.S}, "-9#11", 357)
	,FMinSos11addMin3_2("CXO", new TonoEnum[]{TonoEnum.C, TonoEnum.X, TonoEnum.O}, "-#11(add-3)", 357)
	,F11Sos11_4("Csh", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.h}, "11#11", 357)
	,FSos11Sos11_1("Csw", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.w}, "#11#11", 357)
	,FSos11_6("Csm", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.m}, "#11", 357)
	,FSos11b13_3("CsM", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.M}, "#11b13", 357)
	,FSos1113_3("Csc", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.c}, "#1113", 357)
	,F7Sos11_3("CsC", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.C}, "7#11", 357)
	,Fmaj7Sos11_3("CsQ", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.Q}, "maj7#11", 357)
	,FSos11_7("Csx", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.x}, "#11", 357)
	,Fb9Sos11_5("CsX", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.X}, "b9#11", 357)
	,F9Sos11_5("Css", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.s}, "9#11", 357)
	,FMinSos11addMaj3_5("CsS", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.S}, "-#11(add+3)", 357)
	,FSos11addMaj3_2("CsO", new TonoEnum[]{TonoEnum.C, TonoEnum.s, TonoEnum.O}, "#11(add+3)", 357)
	,FSus11Sos11Sos11_1("CSh", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.h}, "(sus11)#11#11", 357)
	,FSus11Sos11_6("CSw", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.w}, "(sus11)#11", 357)
	,FSus11Sos11b13_3("CSm", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.m}, "(sus11)#11b13", 357)
	,FSus11Sos1113_3("CSM", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.M}, "(sus11)#1113", 357)
	,FSus117Sos11_3("CSc", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.c}, "(sus11)7#11", 357)
	,FSus11maj7Sos11_3("CSC", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.C}, "(sus11)maj7#11", 357)
	,FSus11Sos11_7("CSQ", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.Q}, "(sus11)#11", 357)
	,FSusb911Sos11_5("CSx", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.x}, "(susb9)11#11", 357)
	,FSus911Sos11_5("CSX", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.X}, "(sus9)11#11", 357)
	,FMin11Sos11_5("CSs", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.s}, "-11#11", 357)
	,F11Sos11_5("CSS", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.S}, "11#11", 357)
	,FSus1111Sos11_2("CSO", new TonoEnum[]{TonoEnum.C, TonoEnum.S, TonoEnum.O}, "(sus11)11#11", 357)
	,FSusSos11Sos11_2("COh", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.h}, "(sus#11)#11", 357)
	,FSusSos11Sos11b13_1("COw", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.w}, "(sus#11)#11b13", 357)
	,FSusSos11Sos1113_1("COm", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.m}, "(sus#11)#1113", 357)
	,FSusSos117Sos11_1("COM", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.M}, "(sus#11)7#11", 357)
	,FSusSos11maj7Sos11_1("COc", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.c}, "(sus#11)maj7#11", 357)
	,FSusSos11Sos11_3("COC", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.C}, "(sus#11)#11", 357)
	,FSusb9Sos11Sos11_2("COQ", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.Q}, "(susb9)#11#11", 357)
	,FSus9Sos11Sos11_2("COx", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.x}, "(sus9)#11#11", 357)
	,FMinSos11Sos11_2("COX", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.X}, "-#11#11", 357)
	,FSos11Sos11_2("COs", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.s}, "#11#11", 357)
	,FSus11Sos11Sos11_2("COS", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.S}, "(sus11)#11#11", 357)
	,FSusSos11Sos11Sos11("COO", new TonoEnum[]{TonoEnum.C, TonoEnum.O, TonoEnum.O}, "(sus#11)#11#11", 357)
	,FOmmit3b1313("Qhh", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.h}, "(ommit3)b1313", 357)
	,FOmmit37b13("Qhw", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.w}, "(ommit3)7b13", 357)
	,FOmmit3maj7b13("Qhm", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.m}, "(ommit3)maj7b13", 357)
	,FOmmit3b13("QhM", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.M}, "(ommit3)b13", 357)
	,FSusb9b13_4("Qhc", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.c}, "(susb9)b13", 357)
	,FSus9b13_4("QhC", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.C}, "(sus9)b13", 357)
	,FMinb13_4("QhQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.Q}, "-b13", 357)
	,Fb13_4("Qhx", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.x}, "b13", 357)
	,FSus11b13_4("QhX", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.X}, "(sus11)b13", 357)
	,FSusSos11b13_4("Qhs", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.s}, "(sus#11)b13", 357)
	,FOmmit3b13_1("QhS", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.S}, "(ommit3)b13", 357)
	,FOmmit3b13b13("QhO", new TonoEnum[]{TonoEnum.Q, TonoEnum.h, TonoEnum.O}, "(ommit3)b13b13", 357)
	,FOmmit3713("Qwh", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.h}, "(ommit3)713", 357)
	,FOmmit3maj713("Qww", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.w}, "(ommit3)maj713", 357)
	,FOmmit313("Qwm", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.m}, "(ommit3)13", 357)
	,FSusb913_4("QwM", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.M}, "(susb9)13", 357)
	,FSus913_4("Qwc", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.c}, "(sus9)13", 357)
	,FMin13_4("QwC", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.C}, "-13", 357)
	,F13_4("QwQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.Q}, "13", 357)
	,FSus1113_4("Qwx", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.x}, "(sus11)13", 357)
	,FSusSos1113_4("QwX", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.X}, "(sus#11)13", 357)
	,FOmmit313_1("Qws", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.s}, "(ommit3)13", 357)
	,FOmmit3b1313_1("QwS", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.S}, "(ommit3)b1313", 357)
	,FOmmit31313("QwO", new TonoEnum[]{TonoEnum.Q, TonoEnum.w, TonoEnum.O}, "(ommit3)1313", 357)
	,FOmmit37("Qmh", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.h}, "(ommit3)7", 357)
	,FOmmit37_1("Qmw", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.w}, "(ommit3)7", 357)
	,FSusb97_4("Qmm", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.m}, "(susb9)7", 357)
	,FSus97_4("QmM", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.M}, "(sus9)7", 357)
	,FMin7_4("Qmc", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.c}, "-7", 357)
	,F7_4("QmC", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.C}, "7", 357)
	,FSus117_4("QmQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.Q}, "(sus11)7", 357)
	,FSusSos117_4("Qmx", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.x}, "(sus#11)7", 357)
	,FOmmit37_2("QmX", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.X}, "(ommit3)7", 357)
	,FOmmit37b13_1("Qms", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.s}, "(ommit3)7b13", 357)
	,FOmmit3713_1("QmS", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.S}, "(ommit3)713", 357)
	,FOmmit37_3("QmO", new TonoEnum[]{TonoEnum.Q, TonoEnum.m, TonoEnum.O}, "(ommit3)7", 357)
	,FOmmit3maj7("QMh", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.h}, "(ommit3)maj7", 357)
	,FSusb9maj7_4("QMw", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.w}, "(susb9)maj7", 357)
	,FSus9maj7_4("QMm", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.m}, "(sus9)maj7", 357)
	,FMinmaj7_4("QMM", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.M}, "-maj7", 357)
	,Fmaj7_4("QMc", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.c}, "maj7", 307)
	,FSus11maj7_4("QMC", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.C}, "(sus11)maj7", 357)
	,FSusSos11maj7_4("QMQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.Q}, "(sus#11)maj7", 357)
	,FOmmit3maj7_1("QMx", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.x}, "(ommit3)maj7", 357)
	,FOmmit3maj7b13_1("QMX", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.X}, "(ommit3)maj7b13", 357)
	,FOmmit3maj713_1("QMs", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.s}, "(ommit3)maj713", 357)
	,FOmmit37_4("QMS", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.S}, "(ommit3)7", 357)
	,FOmmit3maj7_2("QMO", new TonoEnum[]{TonoEnum.Q, TonoEnum.M, TonoEnum.O}, "(ommit3)maj7", 357)
	,FSusb9_4("Qch", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.h}, "(susb9)", 357)
	,FSus9_4("Qcw", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.w}, "(sus9)", 357)
	,FMin_4("Qcm", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.m}, "-", 357)
	,FMaj_4("QcM", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.M}, "", 357)
	,FSus11_4("Qcc", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.c}, "(sus11)", 357)
	,FSusSos11_4("QcC", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.C}, "(sus#11)", 357)
	,FOmmit3("QcQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.Q}, "(ommit3)", 357)
	,FOmmit3b13_2("Qcx", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.x}, "(ommit3)b13", 357)
	,FOmmit313_2("QcX", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.X}, "(ommit3)13", 357)
	,FOmmit37_5("Qcs", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.s}, "(ommit3)7", 357)
	,FOmmit3maj7_3("QcS", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.S}, "(ommit3)maj7", 357)
	,FOmmit3_1("QcO", new TonoEnum[]{TonoEnum.Q, TonoEnum.c, TonoEnum.O}, "(ommit3)", 357)
	,FSusb99_8("QCh", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.h}, "(susb9)9", 357)
	,FMinb9_8("QCw", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.w}, "-b9", 357)
	,Fb9_8("QCm", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.m}, "b9", 357)
	,FSusb911_8("QCM", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.M}, "(susb9)11", 357)
	,FSusb9Sos11_8("QCc", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.c}, "(susb9)#11", 357)
	,FSusb9_5("QCC", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.C}, "(susb9)", 357)
	,FSusb9b13_5("QCQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.Q}, "(susb9)b13", 357)
	,FSusb913_5("QCx", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.x}, "(susb9)13", 357)
	,FSusb97_5("QCX", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.X}, "(susb9)7", 357)
	,FSusb9maj7_5("QCs", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.s}, "(susb9)maj7", 357)
	,FSusb9_6("QCS", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.S}, "(susb9)", 357)
	,FSusb9b9_4("QCO", new TonoEnum[]{TonoEnum.Q, TonoEnum.C, TonoEnum.O}, "(susb9)b9", 357)
	,FMin9_8("QQh", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.h}, "-9", 357)
	,F9_8("QQw", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.w}, "9", 357)
	,FSus911_8("QQm", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.m}, "(sus9)11", 357)
	,FSus9Sos11_8("QQM", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.M}, "(sus9)#11", 357)
	,FSus9_5("QQc", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.c}, "(sus9)", 357)
	,FSus9b13_5("QQC", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.C}, "(sus9)b13", 357)
	,FSus913_5("QQQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.Q}, "(sus9)13", 357)
	,FSus97_5("QQx", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.x}, "(sus9)7", 357)
	,FSus9maj7_5("QQX", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.X}, "(sus9)maj7", 357)
	,FSus9_6("QQs", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.s}, "(sus9)", 357)
	,FSusb99_9("QQS", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.S}, "(susb9)9", 357)
	,FSus99_4("QQO", new TonoEnum[]{TonoEnum.Q, TonoEnum.Q, TonoEnum.O}, "(sus9)9", 357)
	,FMinaddMaj3_8("Qxh", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.h}, "-(add+3)", 357)
	,FMin11_8("Qxw", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.w}, "-11", 357)
	,FMinSos11_8("Qxm", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.m}, "-#11", 357)
	,FMin_5("QxM", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.M}, "-", 357)
	,FMinb13_5("Qxc", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.c}, "-b13", 357)
	,FMin13_5("QxC", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.C}, "-13", 357)
	,FMin7_5("QxQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.Q}, "-7", 357)
	,FMinmaj7_5("Qxx", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.x}, "-maj7", 357)
	,FMin_6("QxX", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.X}, "-", 357)
	,FMinb9_9("Qxs", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.s}, "-b9", 357)
	,FMin9_9("QxS", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.S}, "-9", 357)
	,FMinaddMin3_4("QxO", new TonoEnum[]{TonoEnum.Q, TonoEnum.x, TonoEnum.O}, "-(add-3)", 357)
	,F11_8("QXh", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.h}, "11", 357)
	,FSos11_8("QXw", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.w}, "#11", 357)
	,FMaj_5("QXm", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.m}, "", 357)
	,Fb13_5("QXM", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.M}, "b13", 357)
	,F13_5("QXc", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.c}, "13", 357)
	,F7_5("QXC", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.C}, "7", 357)
	,Fmaj7_5("QXQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.Q}, "maj7", 357)
	,FMaj_6("QXx", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.x}, "", 357)
	,Fb9_9("QXX", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.X}, "b9", 357)
	,F9_9("QXs", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.s}, "9", 357)
	,FMinaddMaj3_9("QXS", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.S}, "-(add+3)", 357)
	,FaddMaj3_4("QXO", new TonoEnum[]{TonoEnum.Q, TonoEnum.X, TonoEnum.O}, "(add+3)", 357)
	,FSus11Sos11_8("Qsh", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.h}, "(sus11)#11", 357)
	,FSus11_5("Qsw", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.w}, "(sus11)", 357)
	,FSus11b13_5("Qsm", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.m}, "(sus11)b13", 357)
	,FSus1113_5("QsM", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.M}, "(sus11)13", 357)
	,FSus117_5("Qsc", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.c}, "(sus11)7", 357)
	,FSus11maj7_5("QsC", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.C}, "(sus11)maj7", 357)
	,FSus11_6("QsQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.Q}, "(sus11)", 357)
	,FSusb911_9("Qsx", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.x}, "(susb9)11", 357)
	,FSus911_9("QsX", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.X}, "(sus9)11", 357)
	,FMin11_9("Qss", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.s}, "-11", 357)
	,F11_9("QsS", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.S}, "11", 357)
	,FSus1111_4("QsO", new TonoEnum[]{TonoEnum.Q, TonoEnum.s, TonoEnum.O}, "(sus11)11", 357)
	,FSusSos11_5("QSh", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.h}, "(sus#11)", 357)
	,FSusSos11b13_5("QSw", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.w}, "(sus#11)b13", 357)
	,FSusSos1113_5("QSm", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.m}, "(sus#11)13", 357)
	,FSusSos117_5("QSM", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.M}, "(sus#11)7", 357)
	,FSusSos11maj7_5("QSc", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.c}, "(sus#11)maj7", 357)
	,FSusSos11_6("QSC", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.C}, "(sus#11)", 357)
	,FSusb9Sos11_9("QSQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.Q}, "(susb9)#11", 357)
	,FSus9Sos11_9("QSx", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.x}, "(sus9)#11", 357)
	,FMinSos11_9("QSX", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.X}, "-#11", 357)
	,FSos11_9("QSs", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.s}, "#11", 357)
	,FSus11Sos11_9("QSS", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.S}, "(sus11)#11", 357)
	

	;
	
	protected String caption;
	protected TonoEnum[] tonos;
	protected String nomenclatura;
	protected int representativa; 
	
	public int getRepresentativa() {
		return representativa;
	}
	
	public String getNomenclatura() {
		return nomenclatura;
	}
	
	//TODO refactorizar y revisar toda las posibilidades
	public static String getName(ArrayList<NotaEnum> values) {
		
		StringBuffer name = new StringBuffer("C");
		
		NotaEnum auxNota;
			
			if ((auxNota = evaluateTercera(values) )!= null) { 
				
				name.append(auxNota.tono.name);
				
				if ((auxNota = evaluateSeptima(values)) != null) {
					
					name.append(auxNota.tono.name);
					
					if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateQuinta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
						} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
							
							name.append("(add");
							
							name.append(auxNota.tono.name2);
							
							name.append(")");
							
						} 
					}
				}else if ( (auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null   || 	(auxNota = evaluateSexta(values)) != null)  {
					
					name.append(auxNota.tono.name);
					
					if ((auxNota = evaluateQuinta(values)) != null) {
						
						name.append(auxNota.tono.name);
						
					} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
						
						name.append("(add");
						
						name.append(auxNota.tono.name2);
						
						name.append(")");
						
					} 
					
				}else if ((auxNota = evaluateQuinta(values)) != null) {
					
					name.append(auxNota.tono.name);
					
				} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
					
					name.append("(add");
					
					name.append(auxNota.tono.name2);
					
					name.append(")");
					
				} 
				
			}else{
				if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null) {
					
					name.append("(sus");
					
					name.append(auxNota.tono.name);
					
					name.append(")");
					
					if ((auxNota = evaluateSeptima(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
							}
						}
					}else if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
								
							} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
								
								name.append("(add");
								
								name.append(auxNota.tono.name2);
								
								name.append(")");
								
							} 
						}	
				
				}else{
					name.append("(ommit3)");
					
					if ((auxNota = evaluateSeptima(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
								
							} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
								
								name.append("(add");
								
								name.append(auxNota.tono.name2);
								
								name.append(")");
								
							} 
						}
								
					}else if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateQuinta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
						} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
							
							name.append("(add");
							
							name.append(auxNota.tono.name2);
							
							name.append(")");
							
						} 
					}	
				}
			}
			
			if (values.isEmpty()) return name.toString();
				
			
			if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
				
				name.append(auxNota.tono.name);
				
				if ((auxNota = evaluateQuinta(values)) != null) {
					
					name.append(auxNota.tono.name);
					
				} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
					
					name.append("(add");
					
					name.append(auxNota.tono.name2);
					
					name.append(")");
					
				}
			}else if ((auxNota = evaluateQuinta(values)) != null) {
				
				name.append(auxNota.tono.name);
				
			} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
				
				name.append("(add");
				
				name.append(auxNota.tono.name2);
				
				name.append(")");
				
			} 
		
		return name.toString();
			
	}
	
	private static NotaEnum evaluateQuinta(Collection<NotaEnum> values) {
		
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.G) ){
				values.remove(NotaEnum.G);
				out = NotaEnum.G;
		}
		
		return out;
	}
	
	private static NotaEnum evaluateTercera(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Dsos) ||  values.contains(NotaEnum.E) ){
			if (values.contains(NotaEnum.Dsos)) {
				values.remove(NotaEnum.Dsos);
				out =  NotaEnum.Dsos;
			}else {
				values.remove(NotaEnum.E);
				out = NotaEnum.E;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateSegunda(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Csos) ||  values.contains(NotaEnum.D) ){
			if (values.contains(NotaEnum.Csos)) {
				values.remove(NotaEnum.Csos);
				out =   NotaEnum.Csos;
			}else {
				values.remove(NotaEnum.D);
				out =  NotaEnum.D;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateCuarta(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.F) ||  values.contains(NotaEnum.Fsos) ){
			if (values.contains(NotaEnum.F)) {
				values.remove(NotaEnum.F);
				out =  NotaEnum.F;
			}else {
				values.remove(NotaEnum.Fsos);
				out = NotaEnum.Fsos;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateSeptima(Collection<NotaEnum> values) {
		
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Asos) ||  values.contains(NotaEnum.B) ){
			if (values.contains(NotaEnum.Asos)) {
				values.remove(NotaEnum.Asos);
				out =  NotaEnum.Asos;
			}else {
				values.remove(NotaEnum.B);
				out = NotaEnum.B;
			}
		}
		
		return out;
	}
	
	
	
	private static NotaEnum evaluateSexta(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Gsos) ||  values.contains(NotaEnum.A) ){
			if (values.contains(NotaEnum.Gsos)) {
				values.remove(NotaEnum.Gsos);
				out =   NotaEnum.Gsos;
			}else{
				values.remove(NotaEnum.A);
				out =  NotaEnum.A;
			}
		}
		
		return out;
	}

	private FuncionEnumExt(String value, TonoEnum[] tono, String name, int representativa) {
		
		this.caption = value;
		
		this.tonos = tono;
		
		this.nomenclatura = name;
		
		this.representativa = representativa;
	}
	
	public boolean isFunction(TonoEnum[] tonos) {

		boolean out = true;
		
		for (int i = 0; i < tonos.length; i++) {
			if (!this.tonos[i].equals(tonos[i])){
				out = false;
			}
		}
		
		return out;
	}

	public static boolean isFunction(FuncionEnum function, TonoEnum[] tonos) {

		boolean out = true;
		
		for (int i = 0; i < tonos.length; i++) {
			if (!function.tonos[i].equals(tonos[i])){
				out = false;
			}
		}
		
		return out;
	}

	public static FuncionEnumExt getFunction(TonoEnum[] tonos) {

		boolean out = true;
		
		FuncionEnumExt outFuncion;
		
		int j = 0;
		while (j < FuncionEnumExt.values().length) {
			out = true;
			outFuncion = FuncionEnumExt.values()[j]; 
			
			for (int i = 0; i < tonos.length; i++) {
					
				if (tonos[i] != null) {
				
					if (!outFuncion.tonos[i].equals(tonos[i]) ){
						out = false;
					}
					
				}else {
					if (String.valueOf(outFuncion.getRepresentativa()).split("")[i].equals("0") )
						continue;
					else out = false;
				}
				
			}
			
			if (out) {
				return outFuncion;
			}
			
			j++;
		}
		
		return null;
	}

	
	public static void main(String[] args) {
		
		ArrayList<NotaEnum> notas = new ArrayList<NotaEnum>();
		
		notas.add(NotaEnum.C);
		notas.add(NotaEnum.Asos);
	notas.add(NotaEnum.E);
		notas.add(NotaEnum.B);
		
		System.out.println(Arrays.asList(notas) + FuncionEnum.getName(notas));
		
		
		TonoEnum[] tonos = new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.C};
		
		/*
		 * Test getFuncion
		 */
		
		System.out.println(FuncionEnum.getFunction(tonos).name());
		

		/**
		 * dado  3 tonos obtener funcion que corresponde
		 */
		
		
//		for (int i = 0; i < FuncionEnum.values().length; i++) {
//			
//			if (FuncionEnum.values()[i].isFunction(tonos)) {
//				System.out.println(FuncionEnum.values()[i].name());
//				break;
//			}
//			
//		}
		
		
		/**
		 * evaluacion si es funcion de
		 */
		
		
//		if (FuncionEnum.menor.isFunction(tonos)){
//			System.out.println(true);
//			
//		}else{
//			System.out.println(false);
//			
//		}
		
		/* 30/05/2016
		
		List<TonoEnum> tonos = Arrays.asList(FuncionEnum.major.tonos);
		
		System.out.println(FuncionEnum.major.caption + ":" + tonos );
		
		for (TonoEnum tono : tonos) {
			
			obtainName()
			
			System.out.println(tono.peso + tono.name());
			
		}
		
		FuncionEnum function = FuncionEnum.valueOf("major");
		
		System.out.println(function.caption + function.name());
		
		*/
		
	}



}
