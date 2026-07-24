package mcframe.clientMSBG.MSBGP0270;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public static final String $cred_nm = "cred_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public static final String $cred_use_fr = "cred_use_fr";
	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public static final String $cred_use_to = "cred_use_to";
	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public static final String $cred_amt_fr = "cred_amt_fr";
	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public static final String $cred_amt_to = "cred_amt_to";
	/**
	 * Alarm アラーム.<p>
	 *
	 */
	public static final String $alarm_flg = "alarm_flg";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	public static final String $bp_grp_p = "bp_grp_p";

	public static final String $cred_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $cred_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $cred_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $cred_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $cred_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $cred_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $cred_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $cred_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $cred_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $cred_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $cred_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $cred_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $cred_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $cred_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $cred_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $cred_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $cred_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $cred_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $cred_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $cred_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $cred_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $cred_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $cred_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $cred_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $cred_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $cred_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $cred_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $cred_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $cred_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $cred_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $cred_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $cred_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $cred_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $cred_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $cred_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $cred_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $cred_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $cred_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $cred_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $cred_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_nm_META = createCommonMeta($cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cred_use_fr_META = createCommonMeta($cred_use_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta cred_use_to_META = createCommonMeta($cred_use_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta cred_amt_fr_META = createCommonMeta($cred_amt_fr, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_amt_to_META = createCommonMeta($cred_amt_to, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alarm_flg_META = createCommonMeta($alarm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR3);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cred_cd_META,
			cred_nm_META,
			cur_cd_META,
			cur_nm_META,
			cred_use_fr_META,
			cred_use_to_META,
			cred_amt_fr_META,
			cred_amt_to_META,
			alarm_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			bp_grp_p_META
		},
		new String[][]{
			{
				"cred_grp_flg1",
				"cred_grp_cd1",
				"cred_grp_nm1",
				"cred_grp_flg2",
				"cred_grp_cd2",
				"cred_grp_nm2",
				"cred_grp_flg3",
				"cred_grp_cd3",
				"cred_grp_nm3",
				"cred_grp_flg4",
				"cred_grp_cd4",
				"cred_grp_nm4",
				"cred_grp_flg5",
				"cred_grp_cd5",
				"cred_grp_nm5",
				"cred_grp_flg6",
				"cred_grp_cd6",
				"cred_grp_nm6",
				"cred_grp_flg7",
				"cred_grp_cd7",
				"cred_grp_nm7",
				"cred_grp_flg8",
				"cred_grp_cd8",
				"cred_grp_nm8",
				"cred_grp_flg9",
				"cred_grp_cd9",
				"cred_grp_nm9",
				"cred_grp_flg10",
				"cred_grp_cd10",
				"cred_grp_nm10"
			},
			{
				$cred_grp_flg1,
				$cred_grp_cd1,
				$cred_grp_nm1,
				$cred_grp_flg2,
				$cred_grp_cd2,
				$cred_grp_nm2,
				$cred_grp_flg3,
				$cred_grp_cd3,
				$cred_grp_nm3,
				$cred_grp_flg4,
				$cred_grp_cd4,
				$cred_grp_nm4,
				$cred_grp_flg5,
				$cred_grp_cd5,
				$cred_grp_nm5,
				$cred_grp_flg6,
				$cred_grp_cd6,
				$cred_grp_nm6,
				$cred_grp_flg7,
				$cred_grp_cd7,
				$cred_grp_nm7,
				$cred_grp_flg8,
				$cred_grp_cd8,
				$cred_grp_nm8,
				$cred_grp_flg9,
				$cred_grp_cd9,
				$cred_grp_nm9,
				$cred_grp_flg10,
				$cred_grp_cd10,
				$cred_grp_nm10
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$cred_cd, "bp_nm"}	// cred_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cred_cd, "MAC_BP_IS_SRCH_TYP.CRED"}	// cred_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cred_cd, "bp_is_srch_typ"}	// cred_cd
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 0, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 0, $cred_cd, value);
	}


	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public String cred_nm() {
		return getConstString(offset + 1, $cred_nm);
	}

	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public void cred_nm(String value) {
		setConstString(offset + 1, $cred_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 2, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 2, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 3, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 3, $cur_nm, value);
	}


	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber cred_use_fr() {
		return getConstNumber(offset + 4, $cred_use_fr);
	}

	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public void cred_use_fr(MCNumber value) {
		setConstNumber(offset + 4, $cred_use_fr, value);
	}

	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public void cred_use_fr(int value) {
		setConstNumber(offset + 4, $cred_use_fr, value);
	}

	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public void cred_use_fr(long value) {
		setConstNumber(offset + 4, $cred_use_fr, value);
	}

	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public void cred_use_fr(float value) {
		setConstNumber(offset + 4, $cred_use_fr, value);
	}

	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public void cred_use_fr(double value) {
		setConstNumber(offset + 4, $cred_use_fr, value);
	}


	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public MCNumber cred_use_to() {
		return getConstNumber(offset + 5, $cred_use_to);
	}

	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public void cred_use_to(MCNumber value) {
		setConstNumber(offset + 5, $cred_use_to, value);
	}

	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public void cred_use_to(int value) {
		setConstNumber(offset + 5, $cred_use_to, value);
	}

	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public void cred_use_to(long value) {
		setConstNumber(offset + 5, $cred_use_to, value);
	}

	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public void cred_use_to(float value) {
		setConstNumber(offset + 5, $cred_use_to, value);
	}

	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public void cred_use_to(double value) {
		setConstNumber(offset + 5, $cred_use_to, value);
	}


	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber cred_amt_fr() {
		return getConstNumber(offset + 6, $cred_amt_fr);
	}

	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public void cred_amt_fr(MCNumber value) {
		setConstNumber(offset + 6, $cred_amt_fr, value);
	}

	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public void cred_amt_fr(int value) {
		setConstNumber(offset + 6, $cred_amt_fr, value);
	}

	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public void cred_amt_fr(long value) {
		setConstNumber(offset + 6, $cred_amt_fr, value);
	}

	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public void cred_amt_fr(float value) {
		setConstNumber(offset + 6, $cred_amt_fr, value);
	}

	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public void cred_amt_fr(double value) {
		setConstNumber(offset + 6, $cred_amt_fr, value);
	}


	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public MCNumber cred_amt_to() {
		return getConstNumber(offset + 7, $cred_amt_to);
	}

	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public void cred_amt_to(MCNumber value) {
		setConstNumber(offset + 7, $cred_amt_to, value);
	}

	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public void cred_amt_to(int value) {
		setConstNumber(offset + 7, $cred_amt_to, value);
	}

	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public void cred_amt_to(long value) {
		setConstNumber(offset + 7, $cred_amt_to, value);
	}

	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public void cred_amt_to(float value) {
		setConstNumber(offset + 7, $cred_amt_to, value);
	}

	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public void cred_amt_to(double value) {
		setConstNumber(offset + 7, $cred_amt_to, value);
	}


	/**
	 * Alarm アラーム.<p>
	 *
	 */
	public boolean alarm_flg() {
		return getConstBoolean(offset + 8, $alarm_flg);
	}

	/**
	 * Alarm アラーム.<p>
	 *
	 */
	public void alarm_flg(boolean value) {
		setConstBoolean(offset + 8, $alarm_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 9, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 9, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 10, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 10, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 11, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 11, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 12, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 12, $bp_grp_p, row);
	}


	public String getString(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			return cred_use_fr();
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			return cred_use_to();
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			return cred_amt_fr();
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			return cred_amt_to();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($alarm_flg.equalsIgnoreCase(name)) {
			return alarm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			return cred_use_fr();
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			return cred_use_to();
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			return cred_amt_fr();
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			return cred_amt_to();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alarm_flg.equalsIgnoreCase(name)) {
			return alarm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alarm_flg.equalsIgnoreCase(name)) {
			alarm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cred_use_fr.equalsIgnoreCase(name)) {
			cred_use_fr(value);
			return;
		}
		if ($cred_use_to.equalsIgnoreCase(name)) {
			cred_use_to(value);
			return;
		}
		if ($cred_amt_fr.equalsIgnoreCase(name)) {
			cred_amt_fr(value);
			return;
		}
		if ($cred_amt_to.equalsIgnoreCase(name)) {
			cred_amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alarm_flg.equalsIgnoreCase(name)) {
			alarm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Credit managed BP class 1 与信管理先分類１.<p>
	 *
	 */
	public boolean cred_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Credit managed BP class 1 与信管理先分類１.<p>
	 *
	 */
	public void cred_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public String cred_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public void cred_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public String cred_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public void cred_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Credit managed BP class 2 与信管理先分類２.<p>
	 *
	 */
	public boolean cred_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Credit managed BP class 2 与信管理先分類２.<p>
	 *
	 */
	public void cred_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public String cred_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public void cred_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public String cred_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public void cred_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Credit managed BP class 3 与信管理先分類３.<p>
	 *
	 */
	public boolean cred_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Credit managed BP class 3 与信管理先分類３.<p>
	 *
	 */
	public void cred_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public String cred_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public void cred_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public String cred_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public void cred_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Credit managed BP class 4 与信管理先分類４.<p>
	 *
	 */
	public boolean cred_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Credit managed BP class 4 与信管理先分類４.<p>
	 *
	 */
	public void cred_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public String cred_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public void cred_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public String cred_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public void cred_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Credit managed BP class 5 与信管理先分類５.<p>
	 *
	 */
	public boolean cred_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Credit managed BP class 5 与信管理先分類５.<p>
	 *
	 */
	public void cred_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public String cred_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public void cred_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public String cred_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public void cred_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Credit managed BP class 6 与信管理先分類６.<p>
	 *
	 */
	public boolean cred_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Credit managed BP class 6 与信管理先分類６.<p>
	 *
	 */
	public void cred_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public String cred_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public void cred_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public String cred_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public void cred_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Credit managed BP class 7 与信管理先分類７.<p>
	 *
	 */
	public boolean cred_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Credit managed BP class 7 与信管理先分類７.<p>
	 *
	 */
	public void cred_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public String cred_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public void cred_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public String cred_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public void cred_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Credit managed BP class 8 与信管理先分類８.<p>
	 *
	 */
	public boolean cred_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Credit managed BP class 8 与信管理先分類８.<p>
	 *
	 */
	public void cred_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public String cred_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public void cred_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public String cred_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public void cred_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Credit managed BP class 9 与信管理先分類９.<p>
	 *
	 */
	public boolean cred_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Credit managed BP class 9 与信管理先分類９.<p>
	 *
	 */
	public void cred_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public String cred_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public void cred_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public String cred_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public void cred_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Credit managed BP class 10 与信管理先分類１０.<p>
	 *
	 */
	public boolean cred_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Credit managed BP class 10 与信管理先分類１０.<p>
	 *
	 */
	public void cred_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public String cred_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public void cred_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public String cred_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public void cred_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

