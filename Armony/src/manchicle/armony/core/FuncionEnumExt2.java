package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public enum FuncionEnumExt2 {
	
	FSusSos11Sos11_4("QSO", new TonoEnum[]{TonoEnum.Q, TonoEnum.S, TonoEnum.O}, "(sus#11)#11", 357)
	,FOmmit3b13_3("QOh", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.h}, "(ommit3)b13", 357)
	,FOmmit313_3("QOw", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.w}, "(ommit3)13", 357)
	,FOmmit37_6("QOm", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.m}, "(ommit3)7", 357)
	,FOmmit3maj7_4("QOM", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.M}, "(ommit3)maj7", 357)
	,FOmmit3_2("QOc", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.c}, "(ommit3)", 357)
	,FSusb9_7("QOC", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.C}, "(susb9)", 357)
	,FSus9_7("QOQ", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.Q}, "(sus9)", 357)
	,FMin_7("QOx", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.x}, "-", 357)
	,FMaj_7("QOX", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.X}, "", 357)
	,FSus11_7("QOs", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.s}, "(sus11)", 357)
	,FSusSos11_7("QOS", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.S}, "(sus#11)", 357)
	,FOmmit3_3("QOO", new TonoEnum[]{TonoEnum.Q, TonoEnum.O, TonoEnum.O}, "(ommit3)", 357)
	,FOmmit37b1313("xhh", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.h}, "(ommit3)7b1313", 357)
	,FOmmit3maj7b1313("xhw", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.w}, "(ommit3)maj7b1313", 357)
	,FOmmit3b1313_2("xhm", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.m}, "(ommit3)b1313", 357)
	,FSusb9b1313_2("xhM", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.M}, "(susb9)b1313", 357)
	,FSus9b1313_2("xhc", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.c}, "(sus9)b1313", 357)
	,FMinb1313_2("xhC", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.C}, "-b1313", 357)
	,Fb1313_2("xhQ", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.Q}, "b1313", 357)
	,FSus11b1313_2("xhx", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.x}, "(sus11)b1313", 357)
	,FSusSos11b1313_2("xhX", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.X}, "(sus#11)b1313", 357)
	,FOmmit3b1313_3("xhs", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.s}, "(ommit3)b1313", 357)
	,FOmmit3b13b13_1("xhS", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.S}, "(ommit3)b13b13", 357)
	,FOmmit3b1313_4("xhO", new TonoEnum[]{TonoEnum.x, TonoEnum.h, TonoEnum.O}, "(ommit3)b1313", 357)
	,FOmmit37b13addMaj7("xwh", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.h}, "(ommit3)7b13(add+7)", 357)
	,FOmmit37b13_2("xww", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.w}, "(ommit3)7b13", 357)
	,FSusb97b13_2("xwm", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.m}, "(susb9)7b13", 357)
	,FSus97b13_2("xwM", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.M}, "(sus9)7b13", 357)
	,FMin7b13_2("xwc", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.c}, "-7b13", 357)
	,F7b13_2("xwC", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.C}, "7b13", 357)
	,FSus117b13_2("xwQ", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.Q}, "(sus11)7b13", 357)
	,FSusSos117b13_2("xwx", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.x}, "(sus#11)7b13", 357)
	,FOmmit37b13_3("xwX", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.X}, "(ommit3)7b13", 357)
	,FOmmit37b13b13("xws", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.s}, "(ommit3)7b13b13", 357)
	,FOmmit37b1313_1("xwS", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.S}, "(ommit3)7b1313", 357)
	,FOmmit37b13add7("xwO", new TonoEnum[]{TonoEnum.x, TonoEnum.w, TonoEnum.O}, "(ommit3)7b13(add7)", 357)
	,FOmmit3maj7b13_2("xmh", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.h}, "(ommit3)maj7b13", 357)
	,FSusb9maj7b13_2("xmw", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.w}, "(susb9)maj7b13", 357)
	,FSus9maj7b13_2("xmm", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.m}, "(sus9)maj7b13", 357)
	,FMinmaj7b13_2("xmM", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.M}, "-maj7b13", 357)
	,Fmaj7b13_2("xmc", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.c}, "maj7b13", 357)
	,FSus11maj7b13_2("xmC", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.C}, "(sus11)maj7b13", 357)
	,FSusSos11maj7b13_2("xmQ", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.Q}, "(sus#11)maj7b13", 357)
	,FOmmit3maj7b13_3("xmx", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.x}, "(ommit3)maj7b13", 357)
	,FOmmit3maj7b13b13("xmX", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.X}, "(ommit3)maj7b13b13", 357)
	,FOmmit3maj7b1313_1("xms", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.s}, "(ommit3)maj7b1313", 357)
	,FOmmit37b13addMaj7_1("xmS", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.S}, "(ommit3)7b13(add+7)", 357)
	,FOmmit3maj7b13addMaj7("xmO", new TonoEnum[]{TonoEnum.x, TonoEnum.m, TonoEnum.O}, "(ommit3)maj7b13(add+7)", 357)
	,FSusb9b13_6("xMh", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.h}, "(susb9)b13", 357)
	,FSus9b13_6("xMw", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.w}, "(sus9)b13", 357)
	,FMinb13_6("xMm", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.m}, "-b13", 357)
	,Fb13_6("xMM", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.M}, "b13", 357)
	,FSus11b13_6("xMc", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.c}, "(sus11)b13", 357)
	,FSusSos11b13_6("xMC", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.C}, "(sus#11)b13", 357)
	,FOmmit3b13_4("xMQ", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.Q}, "(ommit3)b13", 357)
	,FOmmit3b13b13_2("xMx", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.x}, "(ommit3)b13b13", 357)
	,FOmmit3b1313_5("xMX", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.X}, "(ommit3)b1313", 357)
	,FOmmit37b13_4("xMs", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.s}, "(ommit3)7b13", 357)
	,FOmmit3maj7b13_4("xMS", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.S}, "(ommit3)maj7b13", 357)
	,FOmmit3b13_5("xMO", new TonoEnum[]{TonoEnum.x, TonoEnum.M, TonoEnum.O}, "(ommit3)b13", 357)
	,FSusb99b13_4("xch", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.h}, "(susb9)9b13", 357)
	,FMinb9b13_4("xcw", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.w}, "-b9b13", 357)
	,Fb9b13_4("xcm", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.m}, "b9b13", 357)
	,FSusb911b13_4("xcM", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.M}, "(susb9)11b13", 357)
	,FSusb9Sos11b13_4("xcc", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.c}, "(susb9)#11b13", 357)
	,FSusb9b13_7("xcC", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.C}, "(susb9)b13", 357)
	,FSusb9b13b13_1("xcQ", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.Q}, "(susb9)b13b13", 357)
	,FSusb9b1313_3("xcx", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.x}, "(susb9)b1313", 357)
	,FSusb97b13_3("xcX", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.X}, "(susb9)7b13", 357)
	,FSusb9maj7b13_3("xcs", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.s}, "(susb9)maj7b13", 357)
	,FSusb9b13_8("xcS", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.S}, "(susb9)b13", 357)
	,FSusb9b9b13_2("xcO", new TonoEnum[]{TonoEnum.x, TonoEnum.c, TonoEnum.O}, "(susb9)b9b13", 357)
	,FMin9b13_4("xCh", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.h}, "-9b13", 357)
	,F9b13_4("xCw", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.w}, "9b13", 357)
	,FSus911b13_4("xCm", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.m}, "(sus9)11b13", 357)
	,FSus9Sos11b13_4("xCM", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.M}, "(sus9)#11b13", 357)
	,FSus9b13_7("xCc", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.c}, "(sus9)b13", 357)
	,FSus9b13b13_1("xCC", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.C}, "(sus9)b13b13", 357)
	,FSus9b1313_3("xCQ", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.Q}, "(sus9)b1313", 357)
	,FSus97b13_3("xCx", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.x}, "(sus9)7b13", 357)
	,FSus9maj7b13_3("xCX", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.X}, "(sus9)maj7b13", 357)
	,FSus9b13_8("xCs", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.s}, "(sus9)b13", 357)
	,FSusb99b13_5("xCS", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.S}, "(susb9)9b13", 357)
	,FSus99b13_2("xCO", new TonoEnum[]{TonoEnum.x, TonoEnum.C, TonoEnum.O}, "(sus9)9b13", 357)
	,FMinb13addMaj3_4("xQh", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.h}, "-b13(add+3)", 357)
	,FMin11b13_4("xQw", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.w}, "-11b13", 357)
	,FMinSos11b13_4("xQm", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.m}, "-#11b13", 357)
	,FMinb13_7("xQM", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.M}, "-b13", 357)
	,FMinb13b13_1("xQc", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.c}, "-b13b13", 357)
	,FMinb1313_3("xQC", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.C}, "-b1313", 357)
	,FMin7b13_3("xQQ", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.Q}, "-7b13", 357)
	,FMinmaj7b13_3("xQx", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.x}, "-maj7b13", 357)
	,FMinb13_8("xQX", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.X}, "-b13", 357)
	,FMinb9b13_5("xQs", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.s}, "-b9b13", 357)
	,FMin9b13_5("xQS", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.S}, "-9b13", 357)
	,FMinb13addMin3_2("xQO", new TonoEnum[]{TonoEnum.x, TonoEnum.Q, TonoEnum.O}, "-b13(add-3)", 357)
	,F11b13_4("xxh", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.h}, "11b13", 357)
	,FSos11b13_4("xxw", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.w}, "#11b13", 357)
	,Fb13_7("xxm", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.m}, "b13", 357)
	,Fb13b13_1("xxM", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.M}, "b13b13", 357)
	,Fb1313_3("xxc", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.c}, "b1313", 357)
	,F7b13_3("xxC", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.C}, "7b13", 357)
	,Fmaj7b13_3("xxQ", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.Q}, "maj7b13", 357)
	,Fb13_8("xxx", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.x}, "b13", 357)
	,Fb9b13_5("xxX", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.X}, "b9b13", 357)
	,F9b13_5("xxs", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.s}, "9b13", 357)
	,FMinb13addMaj3_5("xxS", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.S}, "-b13(add+3)", 357)
	,Fb13addMaj3_2("xxO", new TonoEnum[]{TonoEnum.x, TonoEnum.x, TonoEnum.O}, "b13(add+3)", 357)
	,FSus11Sos11b13_4("xXh", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.h}, "(sus11)#11b13", 357)
	,FSus11b13_7("xXw", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.w}, "(sus11)b13", 357)
	,FSus11b13b13_1("xXm", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.m}, "(sus11)b13b13", 357)
	,FSus11b1313_3("xXM", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.M}, "(sus11)b1313", 357)
	,FSus117b13_3("xXc", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.c}, "(sus11)7b13", 357)
	,FSus11maj7b13_3("xXC", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.C}, "(sus11)maj7b13", 357)
	,FSus11b13_8("xXQ", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.Q}, "(sus11)b13", 357)
	,FSusb911b13_5("xXx", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.x}, "(susb9)11b13", 357)
	,FSus911b13_5("xXX", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.X}, "(sus9)11b13", 357)
	,FMin11b13_5("xXs", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.s}, "-11b13", 357)
	,F11b13_5("xXS", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.S}, "11b13", 357)
	,FSus1111b13_2("xXO", new TonoEnum[]{TonoEnum.x, TonoEnum.X, TonoEnum.O}, "(sus11)11b13", 357)
	,FSusSos11b13_7("xsh", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.h}, "(sus#11)b13", 357)
	,FSusSos11b13b13_1("xsw", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.w}, "(sus#11)b13b13", 357)
	,FSusSos11b1313_3("xsm", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.m}, "(sus#11)b1313", 357)
	,FSusSos117b13_3("xsM", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.M}, "(sus#11)7b13", 357)
	,FSusSos11maj7b13_3("xsc", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.c}, "(sus#11)maj7b13", 357)
	,FSusSos11b13_8("xsC", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.C}, "(sus#11)b13", 357)
	,FSusb9Sos11b13_5("xsQ", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.Q}, "(susb9)#11b13", 357)
	,FSus9Sos11b13_5("xsx", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.x}, "(sus9)#11b13", 357)
	,FMinSos11b13_5("xsX", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.X}, "-#11b13", 357)
	,FSos11b13_5("xss", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.s}, "#11b13", 357)
	,FSus11Sos11b13_5("xsS", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.S}, "(sus11)#11b13", 357)
	,FSusSos11Sos11b13_2("xsO", new TonoEnum[]{TonoEnum.x, TonoEnum.s, TonoEnum.O}, "(sus#11)#11b13", 357)
	,FOmmit3b13b13_3("xSh", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.h}, "(ommit3)b13b13", 357)
	,FOmmit3b1313_6("xSw", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.w}, "(ommit3)b1313", 357)
	,FOmmit37b13_5("xSm", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.m}, "(ommit3)7b13", 357)
	,FOmmit3maj7b13_5("xSM", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.M}, "(ommit3)maj7b13", 357)
	,FOmmit3b13_6("xSc", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.c}, "(ommit3)b13", 357)
	,FSusb9b13_9("xSC", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.C}, "(susb9)b13", 357)
	,FSus9b13_9("xSQ", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.Q}, "(sus9)b13", 357)
	,FMinb13_9("xSx", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.x}, "-b13", 357)
	,Fb13_9("xSX", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.X}, "b13", 357)
	,FSus11b13_9("xSs", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.s}, "(sus11)b13", 357)
	,FSusSos11b13_9("xSS", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.S}, "(sus#11)b13", 357)
	,FOmmit3b13_7("xSO", new TonoEnum[]{TonoEnum.x, TonoEnum.S, TonoEnum.O}, "(ommit3)b13", 357)
	,FOmmit3b13b13_4("xOh", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.h}, "(ommit3)b13b13", 357)
	,FOmmit37b13b13_1("xOw", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.w}, "(ommit3)7b13b13", 357)
	,FOmmit3maj7b13b13_1("xOm", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.m}, "(ommit3)maj7b13b13", 357)
	,FOmmit3b13b13_5("xOM", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.M}, "(ommit3)b13b13", 357)
	,FSusb9b13b13_2("xOc", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.c}, "(susb9)b13b13", 357)
	,FSus9b13b13_2("xOC", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.C}, "(sus9)b13b13", 357)
	,FMinb13b13_2("xOQ", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.Q}, "-b13b13", 357)
	,Fb13b13_2("xOx", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.x}, "b13b13", 357)
	,FSus11b13b13_2("xOX", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.X}, "(sus11)b13b13", 357)
	,FSusSos11b13b13_2("xOs", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.s}, "(sus#11)b13b13", 357)
	,FOmmit3b13b13_6("xOS", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.S}, "(ommit3)b13b13", 357)
	,FOmmit3b13b13_7("xOO", new TonoEnum[]{TonoEnum.x, TonoEnum.O, TonoEnum.O}, "(ommit3)b13b13", 357)
	,FOmmit3713addMaj7("Xhh", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.h}, "(ommit3)713(add+7)", 357)
	,FOmmit3713_2("Xhw", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.w}, "(ommit3)713", 357)
	,FSusb9713_2("Xhm", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.m}, "(susb9)713", 357)
	,FSus9713_2("XhM", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.M}, "(sus9)713", 357)
	,FMin713_2("Xhc", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.c}, "-713", 357)
	,F713_2("XhC", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.C}, "713", 357)
	,FSus11713_2("XhQ", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.Q}, "(sus11)713", 357)
	,FSusSos11713_2("Xhx", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.x}, "(sus#11)713", 357)
	,FOmmit3713_3("XhX", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.X}, "(ommit3)713", 357)
	,FOmmit37b1313_2("Xhs", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.s}, "(ommit3)7b1313", 357)
	,FOmmit371313("XhS", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.S}, "(ommit3)71313", 357)
	,FOmmit3713add7("XhO", new TonoEnum[]{TonoEnum.X, TonoEnum.h, TonoEnum.O}, "(ommit3)713(add7)", 357)
	,FOmmit3maj713_2("Xwh", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.h}, "(ommit3)maj713", 357)
	,FSusb9maj713_2("Xww", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.w}, "(susb9)maj713", 357)
	,FSus9maj713_2("Xwm", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.m}, "(sus9)maj713", 357)
	,FMinmaj713_2("XwM", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.M}, "-maj713", 357)
	,Fmaj713_2("Xwc", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.c}, "maj713", 357)
	,FSus11maj713_2("XwC", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.C}, "(sus11)maj713", 357)
	,FSusSos11maj713_2("XwQ", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.Q}, "(sus#11)maj713", 357)
	,FOmmit3maj713_3("Xwx", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.x}, "(ommit3)maj713", 357)
	,FOmmit3maj7b1313_2("XwX", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.X}, "(ommit3)maj7b1313", 357)
	,FOmmit3maj71313("Xws", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.s}, "(ommit3)maj71313", 357)
	,FOmmit3713addMaj7_1("XwS", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.S}, "(ommit3)713(add+7)", 357)
	,FOmmit3maj713addMaj7("XwO", new TonoEnum[]{TonoEnum.X, TonoEnum.w, TonoEnum.O}, "(ommit3)maj713(add+7)", 357)
	,FSusb913_6("Xmh", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.h}, "(susb9)13", 357)
	,FSus913_6("Xmw", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.w}, "(sus9)13", 357)
	,FMin13_6("Xmm", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.m}, "-13", 357)
	,F13_6("XmM", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.M}, "13", 357)
	,FSus1113_6("Xmc", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.c}, "(sus11)13", 357)
	,FSusSos1113_6("XmC", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.C}, "(sus#11)13", 357)
	,FOmmit313_4("XmQ", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.Q}, "(ommit3)13", 357)
	,FOmmit3b1313_7("Xmx", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.x}, "(ommit3)b1313", 357)
	,FOmmit31313_1("XmX", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.X}, "(ommit3)1313", 357)
	,FOmmit3713_4("Xms", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.s}, "(ommit3)713", 357)
	,FOmmit3maj713_4("XmS", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.S}, "(ommit3)maj713", 357)
	,FOmmit313_5("XmO", new TonoEnum[]{TonoEnum.X, TonoEnum.m, TonoEnum.O}, "(ommit3)13", 357)
	,FSusb9913_4("XMh", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.h}, "(susb9)913", 357)
	,FMinb913_4("XMw", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.w}, "-b913", 357)
	,Fb913_4("XMm", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.m}, "b913", 357)
	,FSusb91113_4("XMM", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.M}, "(susb9)1113", 357)
	,FSusb9Sos1113_4("XMc", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.c}, "(susb9)#1113", 357)
	,FSusb913_7("XMC", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.C}, "(susb9)13", 357)
	,FSusb9b1313_4("XMQ", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.Q}, "(susb9)b1313", 357)
	,FSusb91313_1("XMx", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.x}, "(susb9)1313", 357)
	,FSusb9713_3("XMX", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.X}, "(susb9)713", 357)
	,FSusb9maj713_3("XMs", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.s}, "(susb9)maj713", 357)
	,FSusb913_8("XMS", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.S}, "(susb9)13", 357)
	,FSusb9b913_2("XMO", new TonoEnum[]{TonoEnum.X, TonoEnum.M, TonoEnum.O}, "(susb9)b913", 357)
	,FMin913_4("Xch", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.h}, "-913", 357)
	,F913_4("Xcw", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.w}, "913", 357)
	,FSus91113_4("Xcm", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.m}, "(sus9)1113", 357)
	,FSus9Sos1113_4("XcM", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.M}, "(sus9)#1113", 357)
	,FSus913_7("Xcc", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.c}, "(sus9)13", 357)
	,FSus9b1313_4("XcC", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.C}, "(sus9)b1313", 357)
	,FSus91313_1("XcQ", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.Q}, "(sus9)1313", 357)
	,FSus9713_3("Xcx", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.x}, "(sus9)713", 357)
	,FSus9maj713_3("XcX", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.X}, "(sus9)maj713", 357)
	,FSus913_8("Xcs", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.s}, "(sus9)13", 357)
	,FSusb9913_5("XcS", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.S}, "(susb9)913", 357)
	,FSus9913_2("XcO", new TonoEnum[]{TonoEnum.X, TonoEnum.c, TonoEnum.O}, "(sus9)913", 357)
	,FMin13addMaj3_4("XCh", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.h}, "-13(add+3)", 357)
	,FMin1113_4("XCw", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.w}, "-1113", 357)
	,FMinSos1113_4("XCm", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.m}, "-#1113", 357)
	,FMin13_7("XCM", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.M}, "-13", 357)
	,FMinb1313_4("XCc", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.c}, "-b1313", 357)
	,FMin1313_1("XCC", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.C}, "-1313", 357)
	,FMin713_3("XCQ", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.Q}, "-713", 357)
	,FMinmaj713_3("XCx", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.x}, "-maj713", 357)
	,FMin13_8("XCX", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.X}, "-13", 357)
	,FMinb913_5("XCs", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.s}, "-b913", 357)
	,FMin913_5("XCS", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.S}, "-913", 357)
	,FMin13addMin3_2("XCO", new TonoEnum[]{TonoEnum.X, TonoEnum.C, TonoEnum.O}, "-13(add-3)", 357)
	,F1113_4("XQh", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.h}, "1113", 357)
	,FSos1113_4("XQw", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.w}, "#1113", 357)
	,F13_7("XQm", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.m}, "13", 357)
	,Fb1313_4("XQM", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.M}, "b1313", 357)
	,F1313_1("XQc", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.c}, "1313", 357)
	,F713_3("XQC", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.C}, "713", 357)
	,Fmaj713_3("XQQ", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.Q}, "maj713", 357)
	,F13_8("XQx", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.x}, "13", 357)
	,Fb913_5("XQX", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.X}, "b913", 357)
	,F913_5("XQs", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.s}, "913", 357)
	,FMin13addMaj3_5("XQS", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.S}, "-13(add+3)", 357)
	,F13addMaj3_2("XQO", new TonoEnum[]{TonoEnum.X, TonoEnum.Q, TonoEnum.O}, "13(add+3)", 357)
	,FSus11Sos1113_4("Xxh", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.h}, "(sus11)#1113", 357)
	,FSus1113_7("Xxw", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.w}, "(sus11)13", 357)
	,FSus11b1313_4("Xxm", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.m}, "(sus11)b1313", 357)
	,FSus111313_1("XxM", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.M}, "(sus11)1313", 357)
	,FSus11713_3("Xxc", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.c}, "(sus11)713", 357)
	,FSus11maj713_3("XxC", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.C}, "(sus11)maj713", 357)
	,FSus1113_8("XxQ", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.Q}, "(sus11)13", 357)
	,FSusb91113_5("Xxx", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.x}, "(susb9)1113", 357)
	,FSus91113_5("XxX", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.X}, "(sus9)1113", 357)
	,FMin1113_5("Xxs", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.s}, "-1113", 357)
	,F1113_5("XxS", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.S}, "1113", 357)
	,FSus111113_2("XxO", new TonoEnum[]{TonoEnum.X, TonoEnum.x, TonoEnum.O}, "(sus11)1113", 357)
	,FSusSos1113_7("XXh", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.h}, "(sus#11)13", 357)
	,FSusSos11b1313_4("XXw", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.w}, "(sus#11)b1313", 357)
	,FSusSos111313_1("XXm", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.m}, "(sus#11)1313", 357)
	,FSusSos11713_3("XXM", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.M}, "(sus#11)713", 357)
	,FSusSos11maj713_3("XXc", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.c}, "(sus#11)maj713", 357)
	,FSusSos1113_8("XXC", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.C}, "(sus#11)13", 357)
	,FSusb9Sos1113_5("XXQ", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.Q}, "(susb9)#1113", 357)
	,FSus9Sos1113_5("XXx", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.x}, "(sus9)#1113", 357)
	,FMinSos1113_5("XXX", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.X}, "-#1113", 357)
	,FSos1113_5("XXs", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.s}, "#1113", 357)
	,FSus11Sos1113_5("XXS", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.S}, "(sus11)#1113", 357)
	,FSusSos11Sos1113_2("XXO", new TonoEnum[]{TonoEnum.X, TonoEnum.X, TonoEnum.O}, "(sus#11)#1113", 357)
	,FOmmit3b1313_8("Xsh", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.h}, "(ommit3)b1313", 357)
	,FOmmit31313_2("Xsw", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.w}, "(ommit3)1313", 357)
	,FOmmit3713_5("Xsm", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.m}, "(ommit3)713", 357)
	,FOmmit3maj713_5("XsM", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.M}, "(ommit3)maj713", 357)
	,FOmmit313_6("Xsc", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.c}, "(ommit3)13", 357)
	,FSusb913_9("XsC", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.C}, "(susb9)13", 357)
	,FSus913_9("XsQ", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.Q}, "(sus9)13", 357)
	,FMin13_9("Xsx", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.x}, "-13", 357)
	,F13_9("XsX", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.X}, "13", 357)
	,FSus1113_9("Xss", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.s}, "(sus11)13", 357)
	,FSusSos1113_9("XsS", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.S}, "(sus#11)13", 357)
	,FOmmit313_7("XsO", new TonoEnum[]{TonoEnum.X, TonoEnum.s, TonoEnum.O}, "(ommit3)13", 357)
	,FOmmit3b1313_9("XSh", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.h}, "(ommit3)b1313", 357)
	,FOmmit37b1313_3("XSw", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.w}, "(ommit3)7b1313", 357)
	,FOmmit3maj7b1313_3("XSm", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.m}, "(ommit3)maj7b1313", 357)
	,FOmmit3b1313_10("XSM", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.M}, "(ommit3)b1313", 357)
	,FSusb9b1313_5("XSc", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.c}, "(susb9)b1313", 357)
	,FSus9b1313_5("XSC", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.C}, "(sus9)b1313", 357)
	,FMinb1313_5("XSQ", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.Q}, "-b1313", 357)
	,Fb1313_5("XSx", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.x}, "b1313", 357)
	,FSus11b1313_5("XSX", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.X}, "(sus11)b1313", 357)
	,FSusSos11b1313_5("XSs", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.s}, "(sus#11)b1313", 357)
	,FOmmit3b1313_11("XSS", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.S}, "(ommit3)b1313", 357)
	,FOmmit3b13b13_8("XSO", new TonoEnum[]{TonoEnum.X, TonoEnum.S, TonoEnum.O}, "(ommit3)b13b13", 357)
	,FOmmit371313_1("XOh", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.h}, "(ommit3)71313", 357)
	,FOmmit3maj71313_1("XOw", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.w}, "(ommit3)maj71313", 357)
	,FOmmit31313_3("XOm", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.m}, "(ommit3)1313", 357)
	,FSusb91313_2("XOM", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.M}, "(susb9)1313", 357)
	,FSus91313_2("XOc", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.c}, "(sus9)1313", 357)
	,FMin1313_2("XOC", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.C}, "-1313", 357)
	,F1313_2("XOQ", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.Q}, "1313", 357)
	,FSus111313_2("XOx", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.x}, "(sus11)1313", 357)
	,FSusSos111313_2("XOX", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.X}, "(sus#11)1313", 357)
	,FOmmit31313_4("XOs", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.s}, "(ommit3)1313", 357)
	,FOmmit3b1313_12("XOS", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.S}, "(ommit3)b1313", 357)
	,FOmmit31313_5("XOO", new TonoEnum[]{TonoEnum.X, TonoEnum.O, TonoEnum.O}, "(ommit3)1313", 357)
	,FOmmit37addMaj7("shh", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.h}, "(ommit3)7(add+7)", 357)
	,FSusb97addMaj7_2("shw", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.w}, "(susb9)7(add+7)", 357)
	,FSus97addMaj7_2("shm", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.m}, "(sus9)7(add+7)", 357)
	,FMin7addMaj7_2("shM", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.M}, "-7(add+7)", 357)
	,F7addMaj7_2("shc", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.c}, "7(add+7)", 357)
	,FSus117addMaj7_2("shC", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.C}, "(sus11)7(add+7)", 357)
	,FSusSos117addMaj7_2("shQ", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.Q}, "(sus#11)7(add+7)", 357)
	,FOmmit37_7("shx", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.x}, "(ommit3)7", 357)
	,FOmmit37b13addMaj7_2("shX", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.X}, "(ommit3)7b13(add+7)", 357)
	,FOmmit3713addMaj7_2("shs", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.s}, "(ommit3)713(add+7)", 357)
	,FOmmit37add7("shS", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.S}, "(ommit3)7(add7)", 357)
	,FOmmit37addMaj7_1("shO", new TonoEnum[]{TonoEnum.s, TonoEnum.h, TonoEnum.O}, "(ommit3)7(add+7)", 357)
	,FSusb97_6("swh", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.h}, "(susb9)7", 357)
	,FSus97_6("sww", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.w}, "(sus9)7", 357)
	,FMin7_6("swm", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.m}, "-7", 357)
	,F7_6("swM", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.M}, "7", 357)
	,FSus117_6("swc", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.c}, "(sus11)7", 357)
	,FSusSos117_6("swC", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.C}, "(sus#11)7", 357)
	,FOmmit37_8("swQ", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.Q}, "(ommit3)7", 357)
	,FOmmit37b13_6("swx", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.x}, "(ommit3)7b13", 357)
	,FOmmit3713_6("swX", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.X}, "(ommit3)713", 357)
	,FOmmit37add7_1("sws", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.s}, "(ommit3)7(add7)", 357)
	,FOmmit37addMaj7_2("swS", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.S}, "(ommit3)7(add+7)", 357)
	,FOmmit37_9("swO", new TonoEnum[]{TonoEnum.s, TonoEnum.w, TonoEnum.O}, "(ommit3)7", 357)
	,FSusb979_4("smh", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.h}, "(susb9)79", 357)
	,FMin7b9_4("smw", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.w}, "-7b9", 357)
	,F7b9_4("smm", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.m}, "7b9", 357)
	,FSusb9711_4("smM", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.M}, "(susb9)711", 357)
	,FSusb97Sos11_4("smc", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.c}, "(susb9)7#11", 357)
	,FSusb97_7("smC", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.C}, "(susb9)7", 357)
	,FSusb97b13_4("smQ", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.Q}, "(susb9)7b13", 357)
	,FSusb9713_4("smx", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.x}, "(susb9)713", 357)
	,FSusb97add7_1("smX", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.X}, "(susb9)7(add7)", 357)
	,FSusb97addMaj7_3("sms", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.s}, "(susb9)7(add+7)", 357)
	,FSusb97_8("smS", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.S}, "(susb9)7", 357)
	,FSusb97b9_2("smO", new TonoEnum[]{TonoEnum.s, TonoEnum.m, TonoEnum.O}, "(susb9)7b9", 357)
	,FMin79_4("sMh", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.h}, "-79", 357)
	,F79_4("sMw", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.w}, "79", 357)
	,FSus9711_4("sMm", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.m}, "(sus9)711", 357)
	,FSus97Sos11_4("sMM", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.M}, "(sus9)7#11", 357)
	,FSus97_7("sMc", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.c}, "(sus9)7", 357)
	,FSus97b13_4("sMC", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.C}, "(sus9)7b13", 357)
	,FSus9713_4("sMQ", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.Q}, "(sus9)713", 357)
	,FSus97add7_1("sMx", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.x}, "(sus9)7(add7)", 357)
	,FSus97addMaj7_3("sMX", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.X}, "(sus9)7(add+7)", 357)
	,FSus97_8("sMs", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.s}, "(sus9)7", 357)
	,FSusb979_5("sMS", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.S}, "(susb9)79", 357)
	,FSus979_2("sMO", new TonoEnum[]{TonoEnum.s, TonoEnum.M, TonoEnum.O}, "(sus9)79", 357)
	,FMin7addMaj3_4("sch", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.h}, "-7(add+3)", 357)
	,FMin711_4("scw", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.w}, "-711", 357)
	,FMin7Sos11_4("scm", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.m}, "-7#11", 357)
	,FMin7_7("scM", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.M}, "-7", 357)
	,FMin7b13_4("scc", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.c}, "-7b13", 357)
	,FMin713_4("scC", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.C}, "-713", 357)
	,FMin7add7_1("scQ", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.Q}, "-7(add7)", 357)
	,FMin7addMaj7_3("scx", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.x}, "-7(add+7)", 357)
	,FMin7_8("scX", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.X}, "-7", 357)
	,FMin7b9_5("scs", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.s}, "-7b9", 357)
	,FMin79_5("scS", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.S}, "-79", 357)
	,FMin7addMin3_2("scO", new TonoEnum[]{TonoEnum.s, TonoEnum.c, TonoEnum.O}, "-7(add-3)", 357)
	,F711_4("sCh", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.h}, "711", 357)
	,F7Sos11_4("sCw", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.w}, "7#11", 357)
	,F7_7("sCm", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.m}, "7", 357)
	,F7b13_4("sCM", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.M}, "7b13", 357)
	,F713_4("sCc", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.c}, "713", 357)
	,F7add7_1("sCC", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.C}, "7(add7)", 357)
	,F7addMaj7_3("sCQ", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.Q}, "7(add+7)", 357)
	,F7_8("sCx", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.x}, "7", 357)
	,F7b9_5("sCX", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.X}, "7b9", 357)
	,F79_5("sCs", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.s}, "79", 357)
	,FMin7addMaj3_5("sCS", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.S}, "-7(add+3)", 357)
	,F7addMaj3_2("sCO", new TonoEnum[]{TonoEnum.s, TonoEnum.C, TonoEnum.O}, "7(add+3)", 357)
	,FSus117Sos11_4("sQh", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.h}, "(sus11)7#11", 357)
	,FSus117_7("sQw", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.w}, "(sus11)7", 357)
	,FSus117b13_4("sQm", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.m}, "(sus11)7b13", 357)
	,FSus11713_4("sQM", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.M}, "(sus11)713", 357)
	,FSus117add7_1("sQc", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.c}, "(sus11)7(add7)", 357)
	,FSus117addMaj7_3("sQC", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.C}, "(sus11)7(add+7)", 357)
	,FSus117_8("sQQ", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.Q}, "(sus11)7", 357)
	,FSusb9711_5("sQx", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.x}, "(susb9)711", 357)
	,FSus9711_5("sQX", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.X}, "(sus9)711", 357)
	,FMin711_5("sQs", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.s}, "-711", 357)
	,F711_5("sQS", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.S}, "711", 357)
	,FSus11711_2("sQO", new TonoEnum[]{TonoEnum.s, TonoEnum.Q, TonoEnum.O}, "(sus11)711", 357)
	,FSusSos117_7("sxh", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.h}, "(sus#11)7", 357)
	,FSusSos117b13_4("sxw", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.w}, "(sus#11)7b13", 357)
	,FSusSos11713_4("sxm", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.m}, "(sus#11)713", 357)
	,FSusSos117add7_1("sxM", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.M}, "(sus#11)7(add7)", 357)
	,FSusSos117addMaj7_3("sxc", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.c}, "(sus#11)7(add+7)", 357)
	,FSusSos117_8("sxC", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.C}, "(sus#11)7", 357)
	,FSusb97Sos11_5("sxQ", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.Q}, "(susb9)7#11", 357)
	,FSus97Sos11_5("sxx", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.x}, "(sus9)7#11", 357)
	,FMin7Sos11_5("sxX", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.X}, "-7#11", 357)
	,F7Sos11_5("sxs", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.s}, "7#11", 357)
	,FSus117Sos11_5("sxS", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.S}, "(sus11)7#11", 357)
	,FSusSos117Sos11_2("sxO", new TonoEnum[]{TonoEnum.s, TonoEnum.x, TonoEnum.O}, "(sus#11)7#11", 357)
	,FOmmit37b13_7("sXh", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.h}, "(ommit3)7b13", 357)
	,FOmmit3713_7("sXw", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.w}, "(ommit3)713", 357)
	,FOmmit37_10("sXm", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.m}, "(ommit3)7", 357)
	,FOmmit37_11("sXM", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.M}, "(ommit3)7", 357)
	,FOmmit37_12("sXc", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.c}, "(ommit3)7", 357)
	,FSusb97_9("sXC", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.C}, "(susb9)7", 357)
	,FSus97_9("sXQ", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.Q}, "(sus9)7", 357)
	,FMin7_9("sXx", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.x}, "-7", 357)
	,F7_9("sXX", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.X}, "7", 357)
	,FSus117_9("sXs", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.s}, "(sus11)7", 357)
	,FSusSos117_9("sXS", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.S}, "(sus#11)7", 357)
	,FOmmit37_13("sXO", new TonoEnum[]{TonoEnum.s, TonoEnum.X, TonoEnum.O}, "(ommit3)7", 357)
	,FOmmit37b1313_4("ssh", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.h}, "(ommit3)7b1313", 357)
	,FOmmit37b13add7_1("ssw", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.w}, "(ommit3)7b13(add7)", 357)
	,FOmmit37b13addMaj7_3("ssm", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.m}, "(ommit3)7b13(add+7)", 357)
	,FOmmit37b13_8("ssM", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.M}, "(ommit3)7b13", 357)
	,FSusb97b13_5("ssc", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.c}, "(susb9)7b13", 357)
	,FSus97b13_5("ssC", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.C}, "(sus9)7b13", 357)
	,FMin7b13_5("ssQ", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.Q}, "-7b13", 357)
	,F7b13_5("ssx", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.x}, "7b13", 357)
	,FSus117b13_5("ssX", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.X}, "(sus11)7b13", 357)
	,FSusSos117b13_5("sss", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.s}, "(sus#11)7b13", 357)
	,FOmmit37b13_9("ssS", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.S}, "(ommit3)7b13", 357)
	,FOmmit37b13b13_2("ssO", new TonoEnum[]{TonoEnum.s, TonoEnum.s, TonoEnum.O}, "(ommit3)7b13b13", 357)
	,FOmmit3713add7_1("sSh", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.h}, "(ommit3)713(add7)", 357)
	,FOmmit3713addMaj7_3("sSw", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.w}, "(ommit3)713(add+7)", 357)
	,FOmmit3713_8("sSm", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.m}, "(ommit3)713", 357)
	,FSusb9713_5("sSM", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.M}, "(susb9)713", 357)
	,FSus9713_5("sSc", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.c}, "(sus9)713", 357)
	,FMin713_5("sSC", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.C}, "-713", 357)
	,F713_5("sSQ", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.Q}, "713", 357)
	,FSus11713_5("sSx", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.x}, "(sus11)713", 357)
	,FSusSos11713_5("sSX", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.X}, "(sus#11)713", 357)
	,FOmmit3713_9("sSs", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.s}, "(ommit3)713", 357)
	,FOmmit37b1313_5("sSS", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.S}, "(ommit3)7b1313", 357)
	,FOmmit371313_2("sSO", new TonoEnum[]{TonoEnum.s, TonoEnum.S, TonoEnum.O}, "(ommit3)71313", 357)
	,FOmmit37add7_2("sOh", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.h}, "(ommit3)7(add7)", 357)
	,FOmmit37add7_3("sOw", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.w}, "(ommit3)7(add7)", 357)
	,FSusb97add7_2("sOm", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.m}, "(susb9)7(add7)", 357)
	,FSus97add7_2("sOM", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.M}, "(sus9)7(add7)", 357)
	,FMin7add7_2("sOc", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.c}, "-7(add7)", 357)
	,F7add7_2("sOC", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.C}, "7(add7)", 357)
	,FSus117add7_2("sOQ", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.Q}, "(sus11)7(add7)", 357)
	,FSusSos117add7_2("sOx", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.x}, "(sus#11)7(add7)", 357)
	,FOmmit37_14("sOX", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.X}, "(ommit3)7", 357)
	,FOmmit37b13add7_2("sOs", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.s}, "(ommit3)7b13(add7)", 357)
	,FOmmit3713add7_2("sOS", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.S}, "(ommit3)713(add7)", 357)
	,FOmmit37add7_4("sOO", new TonoEnum[]{TonoEnum.s, TonoEnum.O, TonoEnum.O}, "(ommit3)7(add7)", 357)
	,FSusb9maj7_6("Shh", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.h}, "(susb9)maj7", 357)
	,FSus9maj7_6("Shw", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.w}, "(sus9)maj7", 357)
	,FMinmaj7_6("Shm", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.m}, "-maj7", 357)
	,Fmaj7_6("ShM", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.M}, "maj7", 357)
	,FSus11maj7_6("Shc", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.c}, "(sus11)maj7", 357)
	,FSusSos11maj7_6("ShC", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.C}, "(sus#11)maj7", 357)
	,FOmmit3maj7_5("ShQ", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.Q}, "(ommit3)maj7", 357)
	,FOmmit3maj7b13_6("Shx", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.x}, "(ommit3)maj7b13", 357)
	,FOmmit3maj713_6("ShX", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.X}, "(ommit3)maj713", 357)
	,FOmmit37addMaj7_3("Shs", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.s}, "(ommit3)7(add+7)", 357)
	,FOmmit3maj7addMaj7("ShS", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.S}, "(ommit3)maj7(add+7)", 357)
	,FOmmit3maj7_6("ShO", new TonoEnum[]{TonoEnum.S, TonoEnum.h, TonoEnum.O}, "(ommit3)maj7", 357)
	,FSusb9maj79_4("Swh", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.h}, "(susb9)maj79", 357)
	,FMinmaj7b9_4("Sww", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.w}, "-maj7b9", 357)
	,Fmaj7b9_4("Swm", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.m}, "maj7b9", 357)
	,FSusb9maj711_4("SwM", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.M}, "(susb9)maj711", 357)
	,FSusb9maj7Sos11_4("Swc", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.c}, "(susb9)maj7#11", 357)
	,FSusb9maj7_7("SwC", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.C}, "(susb9)maj7", 357)
	,FSusb9maj7b13_4("SwQ", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.Q}, "(susb9)maj7b13", 357)
	,FSusb9maj713_4("Swx", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.x}, "(susb9)maj713", 357)
	,FSusb97addMaj7_4("SwX", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.X}, "(susb9)7(add+7)", 357)
	,FSusb9maj7addMaj7_1("Sws", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.s}, "(susb9)maj7(add+7)", 357)
	,FSusb9maj7_8("SwS", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.S}, "(susb9)maj7", 357)
	,FSusb9maj7b9_2("SwO", new TonoEnum[]{TonoEnum.S, TonoEnum.w, TonoEnum.O}, "(susb9)maj7b9", 357)
	,FMinmaj79_4("Smh", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.h}, "-maj79", 357)
	,Fmaj79_4("Smw", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.w}, "maj79", 357)
	,FSus9maj711_4("Smm", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.m}, "(sus9)maj711", 357)
	,FSus9maj7Sos11_4("SmM", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.M}, "(sus9)maj7#11", 357)
	,FSus9maj7_7("Smc", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.c}, "(sus9)maj7", 357)
	,FSus9maj7b13_4("SmC", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.C}, "(sus9)maj7b13", 357)
	,FSus9maj713_4("SmQ", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.Q}, "(sus9)maj713", 357)
	,FSus97addMaj7_4("Smx", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.x}, "(sus9)7(add+7)", 357)
	,FSus9maj7addMaj7_1("SmX", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.X}, "(sus9)maj7(add+7)", 357)
	,FSus9maj7_8("Sms", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.s}, "(sus9)maj7", 357)
	,FSusb9maj79_5("SmS", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.S}, "(susb9)maj79", 357)
	,FSus9maj79_2("SmO", new TonoEnum[]{TonoEnum.S, TonoEnum.m, TonoEnum.O}, "(sus9)maj79", 357)
	,FMinmaj7addMaj3_4("SMh", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.h}, "-maj7(add+3)", 357)
	,FMinmaj711_4("SMw", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.w}, "-maj711", 357)
	,FMinmaj7Sos11_4("SMm", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.m}, "-maj7#11", 357)
	,FMinmaj7_7("SMM", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.M}, "-maj7", 357)
	,FMinmaj7b13_4("SMc", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.c}, "-maj7b13", 357)
	,FMinmaj713_4("SMC", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.C}, "-maj713", 357)
	,FMin7addMaj7_4("SMQ", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.Q}, "-7(add+7)", 357)
	,FMinmaj7addMaj7_1("SMx", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.x}, "-maj7(add+7)", 357)
	,FMinmaj7_8("SMX", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.X}, "-maj7", 357)
	,FMinmaj7b9_5("SMs", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.s}, "-maj7b9", 357)
	,FMinmaj79_5("SMS", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.S}, "-maj79", 357)
	,FMinmaj7addMin3_2("SMO", new TonoEnum[]{TonoEnum.S, TonoEnum.M, TonoEnum.O}, "-maj7(add-3)", 357)
	,Fmaj711_4("Sch", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.h}, "maj711", 357)
	,Fmaj7Sos11_4("Scw", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.w}, "maj7#11", 357)
	,Fmaj7_7("Scm", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.m}, "maj7", 357)
	,Fmaj7b13_4("ScM", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.M}, "maj7b13", 357)
	,Fmaj713_4("Scc", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.c}, "maj713", 357)
	,F7addMaj7_4("ScC", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.C}, "7(add+7)", 357)
	,Fmaj7addMaj7_1("ScQ", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.Q}, "maj7(add+7)", 357)
	,Fmaj7_8("Scx", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.x}, "maj7", 357)
	,Fmaj7b9_5("ScX", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.X}, "maj7b9", 357)
	,Fmaj79_5("Scs", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.s}, "maj79", 357)
	,FMinmaj7addMaj3_5("ScS", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.S}, "-maj7(add+3)", 357)
	,Fmaj7addMaj3_2("ScO", new TonoEnum[]{TonoEnum.S, TonoEnum.c, TonoEnum.O}, "maj7(add+3)", 357)
	,FSus11maj7Sos11_4("SCh", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.h}, "(sus11)maj7#11", 357)
	,FSus11maj7_7("SCw", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.w}, "(sus11)maj7", 357)
	,FSus11maj7b13_4("SCm", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.m}, "(sus11)maj7b13", 357)
	,FSus11maj713_4("SCM", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.M}, "(sus11)maj713", 357)
	,FSus117addMaj7_4("SCc", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.c}, "(sus11)7(add+7)", 357)
	,FSus11maj7addMaj7_1("SCC", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.C}, "(sus11)maj7(add+7)", 357)
	,FSus11maj7_8("SCQ", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.Q}, "(sus11)maj7", 357)
	,FSusb9maj711_5("SCx", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.x}, "(susb9)maj711", 357)
	,FSus9maj711_5("SCX", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.X}, "(sus9)maj711", 357)
	,FMinmaj711_5("SCs", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.s}, "-maj711", 357)
	,Fmaj711_5("SCS", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.S}, "maj711", 357)
	,FSus11maj711_2("SCO", new TonoEnum[]{TonoEnum.S, TonoEnum.C, TonoEnum.O}, "(sus11)maj711", 357)
	,FSusSos11maj7_7("SQh", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.h}, "(sus#11)maj7", 357)
	,FSusSos11maj7b13_4("SQw", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.w}, "(sus#11)maj7b13", 357)
	,FSusSos11maj713_4("SQm", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.m}, "(sus#11)maj713", 357)
	,FSusSos117addMaj7_4("SQM", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.M}, "(sus#11)7(add+7)", 357)
	,FSusSos11maj7addMaj7_1("SQc", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.c}, "(sus#11)maj7(add+7)", 357)
	,FSusSos11maj7_8("SQC", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.C}, "(sus#11)maj7", 357)
	,FSusb9maj7Sos11_5("SQQ", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.Q}, "(susb9)maj7#11", 357)
	,FSus9maj7Sos11_5("SQx", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.x}, "(sus9)maj7#11", 357)
	,FMinmaj7Sos11_5("SQX", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.X}, "-maj7#11", 357)
	,Fmaj7Sos11_5("SQs", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.s}, "maj7#11", 357)
	,FSus11maj7Sos11_5("SQS", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.S}, "(sus11)maj7#11", 357)
	,FSusSos11maj7Sos11_2("SQO", new TonoEnum[]{TonoEnum.S, TonoEnum.Q, TonoEnum.O}, "(sus#11)maj7#11", 357)
	,FOmmit3maj7b13_7("Sxh", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.h}, "(ommit3)maj7b13", 357)
	,FOmmit3maj713_7("Sxw", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.w}, "(ommit3)maj713", 357)
	,FOmmit37_15("Sxm", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.m}, "(ommit3)7", 357)
	,FOmmit3maj7_7("SxM", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.M}, "(ommit3)maj7", 357)
	,FOmmit3maj7_8("Sxc", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.c}, "(ommit3)maj7", 357)
	,FSusb9maj7_9("SxC", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.C}, "(susb9)maj7", 357)
	,FSus9maj7_9("SxQ", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.Q}, "(sus9)maj7", 357)
	,FMinmaj7_9("Sxx", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.x}, "-maj7", 357)
	,Fmaj7_9("SxX", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.X}, "maj7", 357)
	,FSus11maj7_9("Sxs", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.s}, "(sus11)maj7", 357)
	,FSusSos11maj7_9("SxS", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.S}, "(sus#11)maj7", 357)
	,FOmmit3maj7_9("SxO", new TonoEnum[]{TonoEnum.S, TonoEnum.x, TonoEnum.O}, "(ommit3)maj7", 357)
	,FOmmit3maj7b1313_4("SXh", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.h}, "(ommit3)maj7b1313", 357)
	,FOmmit37b13addMaj7_4("SXw", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.w}, "(ommit3)7b13(add+7)", 357)
	,FOmmit3maj7b13addMaj7_1("SXm", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.m}, "(ommit3)maj7b13(add+7)", 357)
	,FOmmit3maj7b13_8("SXM", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.M}, "(ommit3)maj7b13", 357)
	,FSusb9maj7b13_5("SXc", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.c}, "(susb9)maj7b13", 357)
	,FSus9maj7b13_5("SXC", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.C}, "(sus9)maj7b13", 357)
	,FMinmaj7b13_5("SXQ", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.Q}, "-maj7b13", 357)
	,Fmaj7b13_5("SXx", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.x}, "maj7b13", 357)
	,FSus11maj7b13_5("SXX", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.X}, "(sus11)maj7b13", 357)
	,FSusSos11maj7b13_5("SXs", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.s}, "(sus#11)maj7b13", 357)
	,FOmmit3maj7b13_9("SXS", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.S}, "(ommit3)maj7b13", 357)
	,FOmmit3maj7b13b13_2("SXO", new TonoEnum[]{TonoEnum.S, TonoEnum.X, TonoEnum.O}, "(ommit3)maj7b13b13", 357)
	,FOmmit3713addMaj7_4("Ssh", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.h}, "(ommit3)713(add+7)", 357)
	,FOmmit3maj713addMaj7_1("Ssw", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.w}, "(ommit3)maj713(add+7)", 357)
	,FOmmit3maj713_8("Ssm", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.m}, "(ommit3)maj713", 357)
	,FSusb9maj713_5("SsM", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.M}, "(susb9)maj713", 357)
	,FSus9maj713_5("Ssc", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.c}, "(sus9)maj713", 357)
	,FMinmaj713_5("SsC", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.C}, "-maj713", 357)
	,Fmaj713_5("SsQ", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.Q}, "maj713", 357)
	,FSus11maj713_5("Ssx", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.x}, "(sus11)maj713", 357)
	,FSusSos11maj713_5("SsX", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.X}, "(sus#11)maj713", 357)
	,FOmmit3maj713_9("Sss", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.s}, "(ommit3)maj713", 357)
	,FOmmit3maj7b1313_5("SsS", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.S}, "(ommit3)maj7b1313", 357)
	,FOmmit3maj71313_2("SsO", new TonoEnum[]{TonoEnum.S, TonoEnum.s, TonoEnum.O}, "(ommit3)maj71313", 357)
	,FOmmit37addMaj7_4("SSh", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.h}, "(ommit3)7(add+7)", 357)
	,FOmmit37addMaj7_5("SSw", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.w}, "(ommit3)7(add+7)", 357)
	,FSusb97addMaj7_5("SSm", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.m}, "(susb9)7(add+7)", 357)
	,FSus97addMaj7_5("SSM", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.M}, "(sus9)7(add+7)", 357)
	,FMin7addMaj7_5("SSc", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.c}, "-7(add+7)", 357)
	,F7addMaj7_5("SSC", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.C}, "7(add+7)", 357)
	,FSus117addMaj7_5("SSQ", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.Q}, "(sus11)7(add+7)", 357)
	,FSusSos117addMaj7_5("SSx", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.x}, "(sus#11)7(add+7)", 357)
	,FOmmit37_16("SSX", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.X}, "(ommit3)7", 357)
	,FOmmit37b13addMaj7_5("SSs", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.s}, "(ommit3)7b13(add+7)", 357)
	,FOmmit3713addMaj7_5("SSS", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.S}, "(ommit3)713(add+7)", 357)
	,FOmmit37add7_5("SSO", new TonoEnum[]{TonoEnum.S, TonoEnum.S, TonoEnum.O}, "(ommit3)7(add7)", 357)
	,FOmmit3maj7addMaj7_1("SOh", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.h}, "(ommit3)maj7(add+7)", 357)
	,FSusb9maj7addMaj7_2("SOw", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.w}, "(susb9)maj7(add+7)", 357)
	,FSus9maj7addMaj7_2("SOm", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.m}, "(sus9)maj7(add+7)", 357)
	,FMinmaj7addMaj7_2("SOM", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.M}, "-maj7(add+7)", 357)
	,Fmaj7addMaj7_2("SOc", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.c}, "maj7(add+7)", 357)
	,FSus11maj7addMaj7_2("SOC", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.C}, "(sus11)maj7(add+7)", 357)
	,FSusSos11maj7addMaj7_2("SOQ", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.Q}, "(sus#11)maj7(add+7)", 357)
	,FOmmit3maj7_10("SOx", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.x}, "(ommit3)maj7", 357)
	,FOmmit3maj7b13addMaj7_2("SOX", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.X}, "(ommit3)maj7b13(add+7)", 357)
	,FOmmit3maj713addMaj7_2("SOs", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.s}, "(ommit3)maj713(add+7)", 357)
	,FOmmit37addMaj7_6("SOS", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.S}, "(ommit3)7(add+7)", 357)
	,FOmmit3maj7addMaj7_2("SOO", new TonoEnum[]{TonoEnum.S, TonoEnum.O, TonoEnum.O}, "(ommit3)maj7(add+7)", 357)
	,FSusb99_10("Ohh", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.h}, "(susb9)9", 357)
	,FMinb9_10("Ohw", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.w}, "-b9", 357)
	,Fb9_10("Ohm", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.m}, "b9", 357)
	,FSusb911_10("OhM", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.M}, "(susb9)11", 357)
	,FSusb9Sos11_10("Ohc", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.c}, "(susb9)#11", 357)
	,FSusb9_8("OhC", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.C}, "(susb9)", 357)
	,FSusb9b13_10("OhQ", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.Q}, "(susb9)b13", 357)
	,FSusb913_10("Ohx", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.x}, "(susb9)13", 357)
	,FSusb97_10("OhX", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.X}, "(susb9)7", 357)
	,FSusb9maj7_10("Ohs", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.s}, "(susb9)maj7", 357)
	,FSusb9_9("OhS", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.S}, "(susb9)", 357)
	,FSusb9b9_5("OhO", new TonoEnum[]{TonoEnum.O, TonoEnum.h, TonoEnum.O}, "(susb9)b9", 357)
	,FMin9_10("Owh", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.h}, "-9", 357)
	,F9_10("Oww", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.w}, "9", 357)
	,FSus911_10("Owm", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.m}, "(sus9)11", 357)
	,FSus9Sos11_10("OwM", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.M}, "(sus9)#11", 357)
	,FSus9_8("Owc", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.c}, "(sus9)", 357)
	,FSus9b13_10("OwC", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.C}, "(sus9)b13", 357)
	,FSus913_10("OwQ", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.Q}, "(sus9)13", 357)
	,FSus97_10("Owx", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.x}, "(sus9)7", 357)
	,FSus9maj7_10("OwX", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.X}, "(sus9)maj7", 357)
	,FSus9_9("Ows", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.s}, "(sus9)", 357)
	,FSusb99_11("OwS", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.S}, "(susb9)9", 357)
	,FSus99_5("OwO", new TonoEnum[]{TonoEnum.O, TonoEnum.w, TonoEnum.O}, "(sus9)9", 357)
	,FMinaddMaj3_10("Omh", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.h}, "-(add+3)", 357)
	,FMin11_10("Omw", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.w}, "-11", 357)
	,FMinSos11_10("Omm", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.m}, "-#11", 357)
	,FMin_8("OmM", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.M}, "-", 357)
	,FMinb13_10("Omc", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.c}, "-b13", 357)
	,FMin13_10("OmC", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.C}, "-13", 357)
	,FMin7_10("OmQ", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.Q}, "-7", 357)
	,FMinmaj7_10("Omx", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.x}, "-maj7", 357)
	,FMin_9("OmX", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.X}, "-", 357)
	,FMinb9_11("Oms", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.s}, "-b9", 357)
	,FMin9_11("OmS", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.S}, "-9", 357)
	,FMinaddMin3_5("OmO", new TonoEnum[]{TonoEnum.O, TonoEnum.m, TonoEnum.O}, "-(add-3)", 357)
	,F11_10("OMh", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.h}, "11", 357)
	,FSos11_10("OMw", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.w}, "#11", 357)
	,FMaj_8("OMm", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.m}, "", 357)
	,Fb13_10("OMM", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.M}, "b13", 357)
	,F13_10("OMc", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.c}, "13", 357)
	,F7_10("OMC", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.C}, "7", 357)
	,Fmaj7_10("OMQ", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.Q}, "maj7", 357)
	,FMaj_9("OMx", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.x}, "", 357)
	,Fb9_11("OMX", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.X}, "b9", 357)
	,F9_11("OMs", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.s}, "9", 357)
	,FMinaddMaj3_11("OMS", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.S}, "-(add+3)", 357)
	,FaddMaj3_5("OMO", new TonoEnum[]{TonoEnum.O, TonoEnum.M, TonoEnum.O}, "(add+3)", 357)
	,FSus11Sos11_10("Och", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.h}, "(sus11)#11", 357)
	,FSus11_8("Ocw", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.w}, "(sus11)", 357)
	,FSus11b13_10("Ocm", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.m}, "(sus11)b13", 357)
	,FSus1113_10("OcM", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.M}, "(sus11)13", 357)
	,FSus117_10("Occ", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.c}, "(sus11)7", 357)
	,FSus11maj7_10("OcC", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.C}, "(sus11)maj7", 357)
	,FSus11_9("OcQ", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.Q}, "(sus11)", 357)
	,FSusb911_11("Ocx", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.x}, "(susb9)11", 357)
	,FSus911_11("OcX", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.X}, "(sus9)11", 357)
	,FMin11_11("Ocs", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.s}, "-11", 357)
	,F11_11("OcS", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.S}, "11", 357)
	,FSus1111_5("OcO", new TonoEnum[]{TonoEnum.O, TonoEnum.c, TonoEnum.O}, "(sus11)11", 357)
	,FSusSos11_8("OCh", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.h}, "(sus#11)", 357)
	,FSusSos11b13_10("OCw", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.w}, "(sus#11)b13", 357)
	,FSusSos1113_10("OCm", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.m}, "(sus#11)13", 357)
	,FSusSos117_10("OCM", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.M}, "(sus#11)7", 357)
	,FSusSos11maj7_10("OCc", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.c}, "(sus#11)maj7", 357)
	,FSusSos11_9("OCC", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.C}, "(sus#11)", 357)
	,FSusb9Sos11_11("OCQ", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.Q}, "(susb9)#11", 357)
	,FSus9Sos11_11("OCx", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.x}, "(sus9)#11", 357)
	,FMinSos11_11("OCX", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.X}, "-#11", 357)
	,FSos11_11("OCs", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.s}, "#11", 357)
	,FSus11Sos11_11("OCS", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.S}, "(sus11)#11", 357)
	,FSusSos11Sos11_5("OCO", new TonoEnum[]{TonoEnum.O, TonoEnum.C, TonoEnum.O}, "(sus#11)#11", 357)
	,FOmmit3b13_8("OQh", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.h}, "(ommit3)b13", 357)
	,FOmmit313_8("OQw", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.w}, "(ommit3)13", 357)
	,FOmmit37_17("OQm", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.m}, "(ommit3)7", 357)
	,FOmmit3maj7_11("OQM", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.M}, "(ommit3)maj7", 357)
	,FOmmit3_4("OQc", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.c}, "(ommit3)", 357)
	,FSusb9_10("OQC", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.C}, "(susb9)", 357)
	,FSus9_10("OQQ", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.Q}, "(sus9)", 357)
	,FMin_10("OQx", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.x}, "-", 357)
	,FMaj_10("OQX", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.X}, "", 357)
	,FSus11_10("OQs", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.s}, "(sus11)", 357)
	,FSusSos11_10("OQS", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.S}, "(sus#11)", 357)
	,FOmmit3_5("OQO", new TonoEnum[]{TonoEnum.O, TonoEnum.Q, TonoEnum.O}, "(ommit3)", 357)
	,FOmmit3b1313_13("Oxh", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.h}, "(ommit3)b1313", 357)
	,FOmmit37b13_10("Oxw", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.w}, "(ommit3)7b13", 357)
	,FOmmit3maj7b13_10("Oxm", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.m}, "(ommit3)maj7b13", 357)
	,FOmmit3b13_9("OxM", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.M}, "(ommit3)b13", 357)
	,FSusb9b13_11("Oxc", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.c}, "(susb9)b13", 357)
	,FSus9b13_11("OxC", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.C}, "(sus9)b13", 357)
	,FMinb13_11("OxQ", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.Q}, "-b13", 357)
	,Fb13_11("Oxx", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.x}, "b13", 357)
	,FSus11b13_11("OxX", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.X}, "(sus11)b13", 357)
	,FSusSos11b13_11("Oxs", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.s}, "(sus#11)b13", 357)
	,FOmmit3b13_10("OxS", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.S}, "(ommit3)b13", 357)
	,FOmmit3b13b13_9("OxO", new TonoEnum[]{TonoEnum.O, TonoEnum.x, TonoEnum.O}, "(ommit3)b13b13", 357)
	,FOmmit3713_10("OXh", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.h}, "(ommit3)713", 357)
	,FOmmit3maj713_10("OXw", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.w}, "(ommit3)maj713", 357)
	,FOmmit313_9("OXm", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.m}, "(ommit3)13", 357)
	,FSusb913_11("OXM", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.M}, "(susb9)13", 357)
	,FSus913_11("OXc", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.c}, "(sus9)13", 357)
	,FMin13_11("OXC", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.C}, "-13", 357)
	,F13_11("OXQ", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.Q}, "13", 357)
	,FSus1113_11("OXx", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.x}, "(sus11)13", 357)
	,FSusSos1113_11("OXX", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.X}, "(sus#11)13", 357)
	,FOmmit313_10("OXs", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.s}, "(ommit3)13", 357)
	,FOmmit3b1313_14("OXS", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.S}, "(ommit3)b1313", 357)
	,FOmmit31313_6("OXO", new TonoEnum[]{TonoEnum.O, TonoEnum.X, TonoEnum.O}, "(ommit3)1313", 357)
	,FOmmit37addMaj7_7("Osh", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.h}, "(ommit3)7(add+7)", 357)
	,FOmmit37_18("Osw", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.w}, "(ommit3)7", 357)
	,FSusb97_11("Osm", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.m}, "(susb9)7", 357)
	,FSus97_11("OsM", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.M}, "(sus9)7", 357)
	,FMin7_11("Osc", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.c}, "-7", 357)
	,F7_11("OsC", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.C}, "7", 357)
	,FSus117_11("OsQ", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.Q}, "(sus11)7", 357)
	,FSusSos117_11("Osx", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.x}, "(sus#11)7", 357)
	,FOmmit37_19("OsX", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.X}, "(ommit3)7", 357)
	,FOmmit37b13_11("Oss", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.s}, "(ommit3)7b13", 357)
	,FOmmit3713_11("OsS", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.S}, "(ommit3)713", 357)
	,FOmmit37add7_6("OsO", new TonoEnum[]{TonoEnum.O, TonoEnum.s, TonoEnum.O}, "(ommit3)7(add7)", 357)
	,FOmmit3maj7_12("OSh", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.h}, "(ommit3)maj7", 357)
	,FSusb9maj7_11("OSw", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.w}, "(susb9)maj7", 357)
	,FSus9maj7_11("OSm", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.m}, "(sus9)maj7", 357)
	,FMinmaj7_11("OSM", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.M}, "-maj7", 357)
	,Fmaj7_11("OSc", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.c}, "maj7", 357)
	,FSus11maj7_11("OSC", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.C}, "(sus11)maj7", 357)
	,FSusSos11maj7_11("OSQ", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.Q}, "(sus#11)maj7", 357)
	,FOmmit3maj7_13("OSx", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.x}, "(ommit3)maj7", 357)
	,FOmmit3maj7b13_11("OSX", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.X}, "(ommit3)maj7b13", 357)
	,FOmmit3maj713_11("OSs", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.s}, "(ommit3)maj713", 357)
	,FOmmit37addMaj7_8("OSS", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.S}, "(ommit3)7(add+7)", 357)
	,FOmmit3maj7addMaj7_3("OSO", new TonoEnum[]{TonoEnum.O, TonoEnum.S, TonoEnum.O}, "(ommit3)maj7(add+7)", 357)
	,FSusb9_11("OOh", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.h}, "(susb9)", 357)
	,FSus9_11("OOw", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.w}, "(sus9)", 357)
	,FMin_11("OOm", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.m}, "-", 357)
	,FMaj_11("OOM", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.M}, "", 357)
	,FSus11_11("OOc", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.c}, "(sus11)", 357)
	,FSusSos11_11("OOC", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.C}, "(sus#11)", 357)
	,FOmmit3_6("OOQ", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.Q}, "(ommit3)", 357)
	,FOmmit3b13_11("OOx", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.x}, "(ommit3)b13", 357)
	,FOmmit313_11("OOX", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.X}, "(ommit3)13", 357)
	,FOmmit37_20("OOs", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.s}, "(ommit3)7", 357)
	,FOmmit3maj7_14("OOS", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.S}, "(ommit3)maj7", 357)
	,FOmmit3_7("OOO", new TonoEnum[]{TonoEnum.O, TonoEnum.O, TonoEnum.O}, "(ommit3)", 357)
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

	private FuncionEnumExt2(String value, TonoEnum[] tono, String name, int representativa) {
		
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

	public static boolean isFunction(FuncionEnumExt2 function, TonoEnum[] tonos) {

		boolean out = true;
		
		for (int i = 0; i < tonos.length; i++) {
			if (!function.tonos[i].equals(tonos[i])){
				out = false;
			}
		}
		
		return out;
	}

	public static FuncionEnumExt2 getFunction(TonoEnum[] tonos) {

		boolean out = true;
		
		FuncionEnumExt2 outFuncion;
		
		int j = 0;
		while (j < FuncionEnumExt2.values().length) {
			out = true;
			outFuncion = FuncionEnumExt2.values()[j]; 
			
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
			
			if (out) return outFuncion;
			
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
		
		System.out.println(Arrays.asList(notas) + FuncionEnumExt2.getName(notas));
		
		
		TonoEnum[] tonos = new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.C};
		
		/*
		 * Test getFuncion
		 */
		
		System.out.println(FuncionEnumExt2.getFunction(tonos).name());
		

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
