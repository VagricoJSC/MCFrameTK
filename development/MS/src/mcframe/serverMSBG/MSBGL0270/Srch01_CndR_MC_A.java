package mcframe.serverMSBG.MSBGL0270;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	/**
	 * Credit managed BP class 1 与信管理先分類１.<p>
	 *
	 */
	public static final String $cred_grp_flg1 = "cred_grp_flg1";
	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cred_grp_cd1 = "cred_grp_cd1";
	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public static final String $cred_grp_nm1 = "cred_grp_nm1";
	/**
	 * Credit managed BP class 2 与信管理先分類２.<p>
	 *
	 */
	public static final String $cred_grp_flg2 = "cred_grp_flg2";
	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cred_grp_cd2 = "cred_grp_cd2";
	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public static final String $cred_grp_nm2 = "cred_grp_nm2";
	/**
	 * Credit managed BP class 3 与信管理先分類３.<p>
	 *
	 */
	public static final String $cred_grp_flg3 = "cred_grp_flg3";
	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cred_grp_cd3 = "cred_grp_cd3";
	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public static final String $cred_grp_nm3 = "cred_grp_nm3";
	/**
	 * Credit managed BP class 4 与信管理先分類４.<p>
	 *
	 */
	public static final String $cred_grp_flg4 = "cred_grp_flg4";
	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cred_grp_cd4 = "cred_grp_cd4";
	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public static final String $cred_grp_nm4 = "cred_grp_nm4";
	/**
	 * Credit managed BP class 5 与信管理先分類５.<p>
	 *
	 */
	public static final String $cred_grp_flg5 = "cred_grp_flg5";
	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cred_grp_cd5 = "cred_grp_cd5";
	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public static final String $cred_grp_nm5 = "cred_grp_nm5";
	/**
	 * Credit managed BP class 6 与信管理先分類６.<p>
	 *
	 */
	public static final String $cred_grp_flg6 = "cred_grp_flg6";
	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cred_grp_cd6 = "cred_grp_cd6";
	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public static final String $cred_grp_nm6 = "cred_grp_nm6";
	/**
	 * Credit managed BP class 7 与信管理先分類７.<p>
	 *
	 */
	public static final String $cred_grp_flg7 = "cred_grp_flg7";
	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cred_grp_cd7 = "cred_grp_cd7";
	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public static final String $cred_grp_nm7 = "cred_grp_nm7";
	/**
	 * Credit managed BP class 8 与信管理先分類８.<p>
	 *
	 */
	public static final String $cred_grp_flg8 = "cred_grp_flg8";
	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cred_grp_cd8 = "cred_grp_cd8";
	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public static final String $cred_grp_nm8 = "cred_grp_nm8";
	/**
	 * Credit managed BP class 9 与信管理先分類９.<p>
	 *
	 */
	public static final String $cred_grp_flg9 = "cred_grp_flg9";
	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cred_grp_cd9 = "cred_grp_cd9";
	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public static final String $cred_grp_nm9 = "cred_grp_nm9";
	/**
	 * Credit managed BP class 10 与信管理先分類１０.<p>
	 *
	 */
	public static final String $cred_grp_flg10 = "cred_grp_flg10";
	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cred_grp_cd10 = "cred_grp_cd10";
	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public static final String $cred_grp_nm10 = "cred_grp_nm10";


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
	public static final MCMeta cred_grp_flg1_META = createCommonMeta($cred_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd1_META = createCommonMeta($cred_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm1_META = createCommonMeta($cred_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg2_META = createCommonMeta($cred_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd2_META = createCommonMeta($cred_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm2_META = createCommonMeta($cred_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg3_META = createCommonMeta($cred_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd3_META = createCommonMeta($cred_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm3_META = createCommonMeta($cred_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg4_META = createCommonMeta($cred_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd4_META = createCommonMeta($cred_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm4_META = createCommonMeta($cred_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg5_META = createCommonMeta($cred_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd5_META = createCommonMeta($cred_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm5_META = createCommonMeta($cred_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg6_META = createCommonMeta($cred_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd6_META = createCommonMeta($cred_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm6_META = createCommonMeta($cred_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg7_META = createCommonMeta($cred_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd7_META = createCommonMeta($cred_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm7_META = createCommonMeta($cred_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg8_META = createCommonMeta($cred_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd8_META = createCommonMeta($cred_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm8_META = createCommonMeta($cred_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg9_META = createCommonMeta($cred_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd9_META = createCommonMeta($cred_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm9_META = createCommonMeta($cred_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_flg10_META = createCommonMeta($cred_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_grp_cd10_META = createCommonMeta($cred_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm10_META = createCommonMeta($cred_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
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
			cred_grp_flg1_META,
			cred_grp_cd1_META,
			cred_grp_nm1_META,
			cred_grp_flg2_META,
			cred_grp_cd2_META,
			cred_grp_nm2_META,
			cred_grp_flg3_META,
			cred_grp_cd3_META,
			cred_grp_nm3_META,
			cred_grp_flg4_META,
			cred_grp_cd4_META,
			cred_grp_nm4_META,
			cred_grp_flg5_META,
			cred_grp_cd5_META,
			cred_grp_nm5_META,
			cred_grp_flg6_META,
			cred_grp_cd6_META,
			cred_grp_nm6_META,
			cred_grp_flg7_META,
			cred_grp_cd7_META,
			cred_grp_nm7_META,
			cred_grp_flg8_META,
			cred_grp_cd8_META,
			cred_grp_nm8_META,
			cred_grp_flg9_META,
			cred_grp_cd9_META,
			cred_grp_nm9_META,
			cred_grp_flg10_META,
			cred_grp_cd10_META,
			cred_grp_nm10_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Credit managed BP class 1 与信管理先分類１.<p>
	 *
	 */
	public boolean cred_grp_flg1() {
		return getConstBoolean(offset + 12, $cred_grp_flg1);
	}

	/**
	 * Credit managed BP class 1 与信管理先分類１.<p>
	 *
	 */
	public void cred_grp_flg1(boolean value) {
		setConstBoolean(offset + 12, $cred_grp_flg1, value);
	}


	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public String cred_grp_cd1() {
		return getConstString(offset + 13, $cred_grp_cd1);
	}

	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public void cred_grp_cd1(String value) {
		setConstString(offset + 13, $cred_grp_cd1, value);
	}


	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public String cred_grp_nm1() {
		return getConstString(offset + 14, $cred_grp_nm1);
	}

	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public void cred_grp_nm1(String value) {
		setConstString(offset + 14, $cred_grp_nm1, value);
	}


	/**
	 * Credit managed BP class 2 与信管理先分類２.<p>
	 *
	 */
	public boolean cred_grp_flg2() {
		return getConstBoolean(offset + 15, $cred_grp_flg2);
	}

	/**
	 * Credit managed BP class 2 与信管理先分類２.<p>
	 *
	 */
	public void cred_grp_flg2(boolean value) {
		setConstBoolean(offset + 15, $cred_grp_flg2, value);
	}


	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public String cred_grp_cd2() {
		return getConstString(offset + 16, $cred_grp_cd2);
	}

	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public void cred_grp_cd2(String value) {
		setConstString(offset + 16, $cred_grp_cd2, value);
	}


	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public String cred_grp_nm2() {
		return getConstString(offset + 17, $cred_grp_nm2);
	}

	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public void cred_grp_nm2(String value) {
		setConstString(offset + 17, $cred_grp_nm2, value);
	}


	/**
	 * Credit managed BP class 3 与信管理先分類３.<p>
	 *
	 */
	public boolean cred_grp_flg3() {
		return getConstBoolean(offset + 18, $cred_grp_flg3);
	}

	/**
	 * Credit managed BP class 3 与信管理先分類３.<p>
	 *
	 */
	public void cred_grp_flg3(boolean value) {
		setConstBoolean(offset + 18, $cred_grp_flg3, value);
	}


	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public String cred_grp_cd3() {
		return getConstString(offset + 19, $cred_grp_cd3);
	}

	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public void cred_grp_cd3(String value) {
		setConstString(offset + 19, $cred_grp_cd3, value);
	}


	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public String cred_grp_nm3() {
		return getConstString(offset + 20, $cred_grp_nm3);
	}

	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public void cred_grp_nm3(String value) {
		setConstString(offset + 20, $cred_grp_nm3, value);
	}


	/**
	 * Credit managed BP class 4 与信管理先分類４.<p>
	 *
	 */
	public boolean cred_grp_flg4() {
		return getConstBoolean(offset + 21, $cred_grp_flg4);
	}

	/**
	 * Credit managed BP class 4 与信管理先分類４.<p>
	 *
	 */
	public void cred_grp_flg4(boolean value) {
		setConstBoolean(offset + 21, $cred_grp_flg4, value);
	}


	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public String cred_grp_cd4() {
		return getConstString(offset + 22, $cred_grp_cd4);
	}

	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public void cred_grp_cd4(String value) {
		setConstString(offset + 22, $cred_grp_cd4, value);
	}


	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public String cred_grp_nm4() {
		return getConstString(offset + 23, $cred_grp_nm4);
	}

	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public void cred_grp_nm4(String value) {
		setConstString(offset + 23, $cred_grp_nm4, value);
	}


	/**
	 * Credit managed BP class 5 与信管理先分類５.<p>
	 *
	 */
	public boolean cred_grp_flg5() {
		return getConstBoolean(offset + 24, $cred_grp_flg5);
	}

	/**
	 * Credit managed BP class 5 与信管理先分類５.<p>
	 *
	 */
	public void cred_grp_flg5(boolean value) {
		setConstBoolean(offset + 24, $cred_grp_flg5, value);
	}


	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public String cred_grp_cd5() {
		return getConstString(offset + 25, $cred_grp_cd5);
	}

	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public void cred_grp_cd5(String value) {
		setConstString(offset + 25, $cred_grp_cd5, value);
	}


	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public String cred_grp_nm5() {
		return getConstString(offset + 26, $cred_grp_nm5);
	}

	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public void cred_grp_nm5(String value) {
		setConstString(offset + 26, $cred_grp_nm5, value);
	}


	/**
	 * Credit managed BP class 6 与信管理先分類６.<p>
	 *
	 */
	public boolean cred_grp_flg6() {
		return getConstBoolean(offset + 27, $cred_grp_flg6);
	}

	/**
	 * Credit managed BP class 6 与信管理先分類６.<p>
	 *
	 */
	public void cred_grp_flg6(boolean value) {
		setConstBoolean(offset + 27, $cred_grp_flg6, value);
	}


	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public String cred_grp_cd6() {
		return getConstString(offset + 28, $cred_grp_cd6);
	}

	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public void cred_grp_cd6(String value) {
		setConstString(offset + 28, $cred_grp_cd6, value);
	}


	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public String cred_grp_nm6() {
		return getConstString(offset + 29, $cred_grp_nm6);
	}

	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public void cred_grp_nm6(String value) {
		setConstString(offset + 29, $cred_grp_nm6, value);
	}


	/**
	 * Credit managed BP class 7 与信管理先分類７.<p>
	 *
	 */
	public boolean cred_grp_flg7() {
		return getConstBoolean(offset + 30, $cred_grp_flg7);
	}

	/**
	 * Credit managed BP class 7 与信管理先分類７.<p>
	 *
	 */
	public void cred_grp_flg7(boolean value) {
		setConstBoolean(offset + 30, $cred_grp_flg7, value);
	}


	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public String cred_grp_cd7() {
		return getConstString(offset + 31, $cred_grp_cd7);
	}

	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public void cred_grp_cd7(String value) {
		setConstString(offset + 31, $cred_grp_cd7, value);
	}


	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public String cred_grp_nm7() {
		return getConstString(offset + 32, $cred_grp_nm7);
	}

	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public void cred_grp_nm7(String value) {
		setConstString(offset + 32, $cred_grp_nm7, value);
	}


	/**
	 * Credit managed BP class 8 与信管理先分類８.<p>
	 *
	 */
	public boolean cred_grp_flg8() {
		return getConstBoolean(offset + 33, $cred_grp_flg8);
	}

	/**
	 * Credit managed BP class 8 与信管理先分類８.<p>
	 *
	 */
	public void cred_grp_flg8(boolean value) {
		setConstBoolean(offset + 33, $cred_grp_flg8, value);
	}


	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public String cred_grp_cd8() {
		return getConstString(offset + 34, $cred_grp_cd8);
	}

	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public void cred_grp_cd8(String value) {
		setConstString(offset + 34, $cred_grp_cd8, value);
	}


	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public String cred_grp_nm8() {
		return getConstString(offset + 35, $cred_grp_nm8);
	}

	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public void cred_grp_nm8(String value) {
		setConstString(offset + 35, $cred_grp_nm8, value);
	}


	/**
	 * Credit managed BP class 9 与信管理先分類９.<p>
	 *
	 */
	public boolean cred_grp_flg9() {
		return getConstBoolean(offset + 36, $cred_grp_flg9);
	}

	/**
	 * Credit managed BP class 9 与信管理先分類９.<p>
	 *
	 */
	public void cred_grp_flg9(boolean value) {
		setConstBoolean(offset + 36, $cred_grp_flg9, value);
	}


	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public String cred_grp_cd9() {
		return getConstString(offset + 37, $cred_grp_cd9);
	}

	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public void cred_grp_cd9(String value) {
		setConstString(offset + 37, $cred_grp_cd9, value);
	}


	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public String cred_grp_nm9() {
		return getConstString(offset + 38, $cred_grp_nm9);
	}

	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public void cred_grp_nm9(String value) {
		setConstString(offset + 38, $cred_grp_nm9, value);
	}


	/**
	 * Credit managed BP class 10 与信管理先分類１０.<p>
	 *
	 */
	public boolean cred_grp_flg10() {
		return getConstBoolean(offset + 39, $cred_grp_flg10);
	}

	/**
	 * Credit managed BP class 10 与信管理先分類１０.<p>
	 *
	 */
	public void cred_grp_flg10(boolean value) {
		setConstBoolean(offset + 39, $cred_grp_flg10, value);
	}


	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public String cred_grp_cd10() {
		return getConstString(offset + 40, $cred_grp_cd10);
	}

	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public void cred_grp_cd10(String value) {
		setConstString(offset + 40, $cred_grp_cd10, value);
	}


	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public String cred_grp_nm10() {
		return getConstString(offset + 41, $cred_grp_nm10);
	}

	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public void cred_grp_nm10(String value) {
		setConstString(offset + 41, $cred_grp_nm10, value);
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			return cred_grp_cd1();
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			return cred_grp_nm1();
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			return cred_grp_cd2();
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			return cred_grp_nm2();
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			return cred_grp_cd3();
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			return cred_grp_nm3();
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			return cred_grp_cd4();
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			return cred_grp_nm4();
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			return cred_grp_cd5();
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			return cred_grp_nm5();
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			return cred_grp_cd6();
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			return cred_grp_nm6();
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			return cred_grp_cd7();
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			return cred_grp_nm7();
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			return cred_grp_cd8();
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			return cred_grp_nm8();
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			return cred_grp_cd9();
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			return cred_grp_nm9();
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			return cred_grp_cd10();
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			return cred_grp_nm10();
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
		if ($cred_grp_flg1.equalsIgnoreCase(name)) {
			return cred_grp_flg1();
		}
		if ($cred_grp_flg2.equalsIgnoreCase(name)) {
			return cred_grp_flg2();
		}
		if ($cred_grp_flg3.equalsIgnoreCase(name)) {
			return cred_grp_flg3();
		}
		if ($cred_grp_flg4.equalsIgnoreCase(name)) {
			return cred_grp_flg4();
		}
		if ($cred_grp_flg5.equalsIgnoreCase(name)) {
			return cred_grp_flg5();
		}
		if ($cred_grp_flg6.equalsIgnoreCase(name)) {
			return cred_grp_flg6();
		}
		if ($cred_grp_flg7.equalsIgnoreCase(name)) {
			return cred_grp_flg7();
		}
		if ($cred_grp_flg8.equalsIgnoreCase(name)) {
			return cred_grp_flg8();
		}
		if ($cred_grp_flg9.equalsIgnoreCase(name)) {
			return cred_grp_flg9();
		}
		if ($cred_grp_flg10.equalsIgnoreCase(name)) {
			return cred_grp_flg10();
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			return cred_grp_cd1();
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			return cred_grp_nm1();
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			return cred_grp_cd2();
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			return cred_grp_nm2();
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			return cred_grp_cd3();
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			return cred_grp_nm3();
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			return cred_grp_cd4();
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			return cred_grp_nm4();
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			return cred_grp_cd5();
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			return cred_grp_nm5();
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			return cred_grp_cd6();
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			return cred_grp_nm6();
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			return cred_grp_cd7();
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			return cred_grp_nm7();
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			return cred_grp_cd8();
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			return cred_grp_nm8();
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			return cred_grp_cd9();
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			return cred_grp_nm9();
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			return cred_grp_cd10();
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			return cred_grp_nm10();
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
		if ($cred_grp_flg1.equalsIgnoreCase(name)) {
			return cred_grp_flg1();
		}
		if ($cred_grp_flg2.equalsIgnoreCase(name)) {
			return cred_grp_flg2();
		}
		if ($cred_grp_flg3.equalsIgnoreCase(name)) {
			return cred_grp_flg3();
		}
		if ($cred_grp_flg4.equalsIgnoreCase(name)) {
			return cred_grp_flg4();
		}
		if ($cred_grp_flg5.equalsIgnoreCase(name)) {
			return cred_grp_flg5();
		}
		if ($cred_grp_flg6.equalsIgnoreCase(name)) {
			return cred_grp_flg6();
		}
		if ($cred_grp_flg7.equalsIgnoreCase(name)) {
			return cred_grp_flg7();
		}
		if ($cred_grp_flg8.equalsIgnoreCase(name)) {
			return cred_grp_flg8();
		}
		if ($cred_grp_flg9.equalsIgnoreCase(name)) {
			return cred_grp_flg9();
		}
		if ($cred_grp_flg10.equalsIgnoreCase(name)) {
			return cred_grp_flg10();
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			cred_grp_cd1(value);
			return;
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			cred_grp_nm1(value);
			return;
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			cred_grp_cd2(value);
			return;
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			cred_grp_nm2(value);
			return;
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			cred_grp_cd3(value);
			return;
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			cred_grp_nm3(value);
			return;
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			cred_grp_cd4(value);
			return;
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			cred_grp_nm4(value);
			return;
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			cred_grp_cd5(value);
			return;
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			cred_grp_nm5(value);
			return;
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			cred_grp_cd6(value);
			return;
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			cred_grp_nm6(value);
			return;
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			cred_grp_cd7(value);
			return;
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			cred_grp_nm7(value);
			return;
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			cred_grp_cd8(value);
			return;
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			cred_grp_nm8(value);
			return;
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			cred_grp_cd9(value);
			return;
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			cred_grp_nm9(value);
			return;
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			cred_grp_cd10(value);
			return;
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			cred_grp_nm10(value);
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
		if ($cred_grp_flg1.equalsIgnoreCase(name)) {
			cred_grp_flg1(value);
			return;
		}
		if ($cred_grp_flg2.equalsIgnoreCase(name)) {
			cred_grp_flg2(value);
			return;
		}
		if ($cred_grp_flg3.equalsIgnoreCase(name)) {
			cred_grp_flg3(value);
			return;
		}
		if ($cred_grp_flg4.equalsIgnoreCase(name)) {
			cred_grp_flg4(value);
			return;
		}
		if ($cred_grp_flg5.equalsIgnoreCase(name)) {
			cred_grp_flg5(value);
			return;
		}
		if ($cred_grp_flg6.equalsIgnoreCase(name)) {
			cred_grp_flg6(value);
			return;
		}
		if ($cred_grp_flg7.equalsIgnoreCase(name)) {
			cred_grp_flg7(value);
			return;
		}
		if ($cred_grp_flg8.equalsIgnoreCase(name)) {
			cred_grp_flg8(value);
			return;
		}
		if ($cred_grp_flg9.equalsIgnoreCase(name)) {
			cred_grp_flg9(value);
			return;
		}
		if ($cred_grp_flg10.equalsIgnoreCase(name)) {
			cred_grp_flg10(value);
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			cred_grp_cd1(value);
			return;
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			cred_grp_nm1(value);
			return;
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			cred_grp_cd2(value);
			return;
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			cred_grp_nm2(value);
			return;
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			cred_grp_cd3(value);
			return;
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			cred_grp_nm3(value);
			return;
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			cred_grp_cd4(value);
			return;
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			cred_grp_nm4(value);
			return;
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			cred_grp_cd5(value);
			return;
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			cred_grp_nm5(value);
			return;
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			cred_grp_cd6(value);
			return;
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			cred_grp_nm6(value);
			return;
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			cred_grp_cd7(value);
			return;
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			cred_grp_nm7(value);
			return;
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			cred_grp_cd8(value);
			return;
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			cred_grp_nm8(value);
			return;
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			cred_grp_cd9(value);
			return;
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			cred_grp_nm9(value);
			return;
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			cred_grp_cd10(value);
			return;
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			cred_grp_nm10(value);
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
		if ($cred_grp_flg1.equalsIgnoreCase(name)) {
			cred_grp_flg1(value);
			return;
		}
		if ($cred_grp_flg2.equalsIgnoreCase(name)) {
			cred_grp_flg2(value);
			return;
		}
		if ($cred_grp_flg3.equalsIgnoreCase(name)) {
			cred_grp_flg3(value);
			return;
		}
		if ($cred_grp_flg4.equalsIgnoreCase(name)) {
			cred_grp_flg4(value);
			return;
		}
		if ($cred_grp_flg5.equalsIgnoreCase(name)) {
			cred_grp_flg5(value);
			return;
		}
		if ($cred_grp_flg6.equalsIgnoreCase(name)) {
			cred_grp_flg6(value);
			return;
		}
		if ($cred_grp_flg7.equalsIgnoreCase(name)) {
			cred_grp_flg7(value);
			return;
		}
		if ($cred_grp_flg8.equalsIgnoreCase(name)) {
			cred_grp_flg8(value);
			return;
		}
		if ($cred_grp_flg9.equalsIgnoreCase(name)) {
			cred_grp_flg9(value);
			return;
		}
		if ($cred_grp_flg10.equalsIgnoreCase(name)) {
			cred_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

