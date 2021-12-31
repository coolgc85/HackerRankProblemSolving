package io.coolgc.gamingarray;

import org.junit.jupiter.api.*;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class GamingArrayTest {

    @Test
    void gameWinBobAtFirst() {
       // GamingArray g = new GamingArray();
        List<Integer> array = Stream.of(9,5,4,2).collect(toList());
        assertEquals(GamingArray.BOB_NAME, GamingArray.gamingArray(array) );
    }

   /* @BeforeAll
    void setUp() {

    }
*/

   @Test
   @Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
    void gameAndyWinner() {
       List<Integer> array = Stream.of(7,4,6,5,9).collect(toList());
       assertEquals(GamingArray.ANDY_NAME, GamingArray.gamingArray(array) );
    }

    @Test
    void gameWithSortedArrayBobWins() {

        List<Integer> array = Stream.of(1,3,5,7,9).collect(toList());
        assertEquals(GamingArray.BOB_NAME, GamingArray.gamingArray(array) );

    }

    @Test
    void gameWithEmptyArray() {
        assertNull(GamingArray.gamingArray(null));
    }

    @Test
    void gameWithOneMovement() {
        List<Integer> array = Stream.of(12,3,5,7,9).collect(toList());
        assertEquals(GamingArray.BOB_NAME, GamingArray.gamingArray(array));
    }

    @Test
    void gameWithLongList() {
        List<Integer> array = Stream.of(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,16,17,17,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34).collect(toList());
        assertEquals(GamingArray.BOB_NAME, GamingArray.gamingArray(array));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void gameWithRepeatedMax() {
        List<Integer> array = Stream.of(13,13,13,14,14,14).collect(toList());
        assertEquals(GamingArray.ANDY_NAME, GamingArray.gamingArray(array));
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void gameWithLongEntry(){
        List<Integer> array = Stream.of(98994,104980,154685,182990,209721,247963,304937,548310,604307,610170,734996,768248,780654,814756,840788,873503,876065,911168,970795,985722,1043472,1097831,1118430,1199722,1349609,1586121,1657468,1676780,1678062,1747260,1801875,1988169,2210575,2219334,2271139,2304662,2322831,2330157,2369583,2385392,2424056,2456830,2458096,2464081,2464451,2516939,2579957,2625277,2645973,2678631,2707105,2709260,2751524,2781182,2798930,2824065,2922452,2926494,2986428,2995950,3042422,3161836,3168032,3229922,3271580,3411655,3419815,3545006,3594590,3793817,3815380,3869874,3895592,3898545,3904520,3922612,4028598,4053211,4061306,4134224,4217225,4326242,4349981,4357494,4488604,4491007,4508176,4571961,4572284,4767475,4803458,4875062,4897577,4937299,4994392,5045618,5164973,5257903,5275530,5317393,5386592,5392100,5537481,5610172,5669227,5675460,5748453,5770182,5854318,5934089,5943930,5944914,5964989,5977772,6002798,6049139,6173934,6319000,6367831,6421585,6440756,6472542,6549074,6618058,6635824,6667231,6748029,6758592,6813574,6823228,6838960,6861368,6914704,6930350,6949040,6951211,6953520,7038165,7054046,7188700,7212171,7357511,7672803,7678219,7728771,7740069,7754288,7768778,7792392,7807034,7835744,7857317,7877915,7932123,8088228,8271174,8361830,8443103,8474309,8545081,8553931,8569618,8600466,8605128,8681248,8706342,8759236,8812042,8913655,9033732,9155374,9205041,9221836,9298158,9467595,9481373,9563349,9600619,9732257,9732675,9812460,9884280,9946834,9956892,10124344,10132708,10200625,10203675,10204436,10225944,10284908,10492654,10566401,10653945,10756121,10775121,10813976,10816687,10842595,10998293,11066983,11122472,11176702,11233795,11289645,11353773,11407775,11423615,11427610,11465182,11528875,11581692,11821043,11844937,11854191,11886243,11969671,11999309,12014744,12017018,12051071,12115274,12161980,12211249,12229087,12355869,12471591,12620348,12678496,12681930,12713369,12717073,12739247,12743403,12785423,12911924,12916346,12927167,12949630,12983343,12984396,13085575,13111358,13223300,13239789,13284874,13299681,13301238,13437149,13441711,13486895,13488876,13631109,13826916,13830813,13881376,13923117,13935058,13953161,14093635,14263357,14357796,14412777,14419594,14652880,14867553,14871199,15025179,15027641,15037216,15047907,15450180,15486608,15537172,15593357,15673391,15720113,15766987,15780128,15785566,15810115,15847906,15882071,15972967,15995863,16026659,16093001,16128803,16182083,16184022,16260801,16276901,16293968,16356666,16470130,16506310,16638999,16715719,16797199,16886331,16932044,17014457,17054185,17054506,17100942,17111230,17208933,17234295,17234652,17240817,17436525,17438028,17450055,17479356,17603633,17654195,17658579,17687696,17738762,17882177,17929012,17942801,17943573,17962530,18010835,18020466,18238721,18247638,18278026,18305054,18420805,18488740,18498920,18583848,18621695,18632987,18678115,18778072,18811120,18876175,18890041,18891105,18917641,18969794,18973687,18975194,18989035,19261817,19329366,19337750,19360540,19369866,19520484,19532199,19615752,19625108,19634367,19647169,19663535,19704991,19734290,19772355,19921911,19996811,20006205,20062310,20075442,20086758,20106876,20138227,20204376,20304619,20391377,20433902,20590960,20622533,20781028,20814530,20820587,20864498,20909138,20988555,21110487,21114205,21174907,21288171,21317265,21338705,21379356,21392557,21406117,21406315,21671237,21701575,21740069,21754301,21802610,21862725,21889875,21898269,22066272,22147962,22227211,22323119,22395409,22501447,22577907,22656114,22774722,22836828,22885205,22950188,22957173,22966775,22972663,23003293,23055512,23058431,23076811,23113858,23134053,23141118,23289708,23441875,23454912,23481415,23530938,23559922,23566103,23677020,23688093,23820553,23823876,23866894,23880424,23934907,23949973,24067024,24203053,24211773,24305040,24331462,24373818,24386789,24392323,24448070,24460405,24497039,24514758,24572742,24588433,24729163,24866713,24913799,24940207,24948578,25003881,25214027,25226062,25281755,25294093,25316449,25381763,25718449,25726714,25729914,25751627,25768429,25771751,25783869,25821903,25822026,25879809,25892098,25989596,26070928,26101977,26112335,26164625,26209874,26276194,26286506,26301478,26347271,26540198,26642780,26657686,26729419,26733260,26740245,26750708,26770752,26916510,26916653,26956982,27000127,27006008,27090745,27092733,27348344,27374471,27384012,27490913,27495429,27559713,27574149,27626877,27708147,27820493,27839233,27839473,28014428,28068046,28097121,28122122,28130905,28191107,28378411,28414013,28433829,28609845,28611023,28612312,28660015,28668956,28812605,28841093,28881584,28987624,29025437,29036521,29084583,29125858,29277167,29327316,29341903,29398313,29624336,29674353,29715878,29727125,29740738,29860742,29873980,29878623,29897139,29914190,29933534,30069565,30111405,30115315,30129571,30143570,30210336,30219122,30221589,30350512,30393719,30456057,30477230,30503766,30526070,30534709,30585317,30611501,30637469,30668377,30672419,30800349,30805341,30832184,30912307,30923346,30960221,30961040,30996803,31090149,31131684,31140549,31213803,31263885,31381882,31394921,31403469,31424240,31430163,31485771,31526499,31529143,31550167).collect(Collectors.toList());
        assertNotNull(GamingArray.gamingArray(array));
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TwoInlineGames(){
        List<Integer> array = Stream.of(1,3,5,7,9).collect(toList());
        List<Integer> array1 = Stream.of(7,4,6,5,9).collect(toList());
        assertEquals(GamingArray.BOB_NAME, GamingArray.gamingArray(array));
        assertEquals(GamingArray.ANDY_NAME, GamingArray.gamingArray(array1));

    }

}