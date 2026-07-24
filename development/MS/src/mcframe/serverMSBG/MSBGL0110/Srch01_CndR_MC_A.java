package mcframe.serverMSBG.MSBGL0110;

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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public static final String $zero_disp_flg = "zero_disp_flg";
	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public static final String $ar_dpt_flg = "ar_dpt_flg";
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no_flg = "wrk_no_flg";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ_flg = "ar_typ_flg";
	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public static final String $acst_grp_flg1 = "acst_grp_flg1";
	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $acst_grp_cd1 = "acst_grp_cd1";
	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public static final String $acst_grp_nm1 = "acst_grp_nm1";
	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public static final String $acst_grp_flg2 = "acst_grp_flg2";
	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $acst_grp_cd2 = "acst_grp_cd2";
	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public static final String $acst_grp_nm2 = "acst_grp_nm2";
	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public static final String $acst_grp_flg3 = "acst_grp_flg3";
	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $acst_grp_cd3 = "acst_grp_cd3";
	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public static final String $acst_grp_nm3 = "acst_grp_nm3";
	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public static final String $acst_grp_flg4 = "acst_grp_flg4";
	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $acst_grp_cd4 = "acst_grp_cd4";
	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public static final String $acst_grp_nm4 = "acst_grp_nm4";
	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public static final String $acst_grp_flg5 = "acst_grp_flg5";
	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $acst_grp_cd5 = "acst_grp_cd5";
	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public static final String $acst_grp_nm5 = "acst_grp_nm5";
	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public static final String $acst_grp_flg6 = "acst_grp_flg6";
	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $acst_grp_cd6 = "acst_grp_cd6";
	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public static final String $acst_grp_nm6 = "acst_grp_nm6";
	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public static final String $acst_grp_flg7 = "acst_grp_flg7";
	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $acst_grp_cd7 = "acst_grp_cd7";
	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public static final String $acst_grp_nm7 = "acst_grp_nm7";
	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public static final String $acst_grp_flg8 = "acst_grp_flg8";
	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $acst_grp_cd8 = "acst_grp_cd8";
	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public static final String $acst_grp_nm8 = "acst_grp_nm8";
	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public static final String $acst_grp_flg9 = "acst_grp_flg9";
	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $acst_grp_cd9 = "acst_grp_cd9";
	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public static final String $acst_grp_nm9 = "acst_grp_nm9";
	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public static final String $acst_grp_flg10 = "acst_grp_flg10";
	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $acst_grp_cd10 = "acst_grp_cd10";
	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public static final String $acst_grp_nm10 = "acst_grp_nm10";


	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta zero_disp_flg_META = createCommonMeta($zero_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_flg_META = createCommonMeta($ar_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_flg_META = createCommonMeta($wrk_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_typ_flg_META = createCommonMeta($ar_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_flg1_META = createCommonMeta($acst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd1_META = createCommonMeta($acst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm1_META = createCommonMeta($acst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg2_META = createCommonMeta($acst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd2_META = createCommonMeta($acst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm2_META = createCommonMeta($acst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg3_META = createCommonMeta($acst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd3_META = createCommonMeta($acst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm3_META = createCommonMeta($acst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg4_META = createCommonMeta($acst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd4_META = createCommonMeta($acst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm4_META = createCommonMeta($acst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg5_META = createCommonMeta($acst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd5_META = createCommonMeta($acst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm5_META = createCommonMeta($acst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg6_META = createCommonMeta($acst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd6_META = createCommonMeta($acst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm6_META = createCommonMeta($acst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg7_META = createCommonMeta($acst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd7_META = createCommonMeta($acst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm7_META = createCommonMeta($acst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg8_META = createCommonMeta($acst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd8_META = createCommonMeta($acst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm8_META = createCommonMeta($acst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg9_META = createCommonMeta($acst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd9_META = createCommonMeta($acst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm9_META = createCommonMeta($acst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg10_META = createCommonMeta($acst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd10_META = createCommonMeta($acst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm10_META = createCommonMeta($acst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			acst_cd_META,
			acst_nm_META,
			iv_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			wrk_no_META,
			wrk_nm_META,
			ar_typ_META,
			zero_disp_flg_META,
			ar_dpt_flg_META,
			wg_flg_META,
			acst_flg_META,
			iv_no_flg_META,
			wrk_no_flg_META,
			ar_typ_flg_META,
			acst_grp_flg1_META,
			acst_grp_cd1_META,
			acst_grp_nm1_META,
			acst_grp_flg2_META,
			acst_grp_cd2_META,
			acst_grp_nm2_META,
			acst_grp_flg3_META,
			acst_grp_cd3_META,
			acst_grp_nm3_META,
			acst_grp_flg4_META,
			acst_grp_cd4_META,
			acst_grp_nm4_META,
			acst_grp_flg5_META,
			acst_grp_cd5_META,
			acst_grp_nm5_META,
			acst_grp_flg6_META,
			acst_grp_cd6_META,
			acst_grp_nm6_META,
			acst_grp_flg7_META,
			acst_grp_cd7_META,
			acst_grp_nm7_META,
			acst_grp_flg8_META,
			acst_grp_cd8_META,
			acst_grp_nm8_META,
			acst_grp_flg9_META,
			acst_grp_cd9_META,
			acst_grp_nm9_META,
			acst_grp_flg10_META,
			acst_grp_cd10_META,
			acst_grp_nm10_META
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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 0, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 0, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 1, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 1, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 4, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 4, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 5, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 5, $acst_nm, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 6, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 6, $iv_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 7, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 7, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 8, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 8, $trd_cur_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 9, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 9, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 10, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 10, $wrk_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 11, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 11, $ar_typ, value);
	}


	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public boolean zero_disp_flg() {
		return getConstBoolean(offset + 12, $zero_disp_flg);
	}

	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public void zero_disp_flg(boolean value) {
		setConstBoolean(offset + 12, $zero_disp_flg, value);
	}


	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public boolean ar_dpt_flg() {
		return getConstBoolean(offset + 13, $ar_dpt_flg);
	}

	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public void ar_dpt_flg(boolean value) {
		setConstBoolean(offset + 13, $ar_dpt_flg, value);
	}


	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 14, $wg_flg);
	}

	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 14, $wg_flg, value);
	}


	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 15, $acst_flg);
	}

	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 15, $acst_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 16, $iv_no_flg);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 16, $iv_no_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public boolean wrk_no_flg() {
		return getConstBoolean(offset + 17, $wrk_no_flg);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no_flg(boolean value) {
		setConstBoolean(offset + 17, $wrk_no_flg, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public boolean ar_typ_flg() {
		return getConstBoolean(offset + 18, $ar_typ_flg);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ_flg(boolean value) {
		setConstBoolean(offset + 18, $ar_typ_flg, value);
	}


	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public boolean acst_grp_flg1() {
		return getConstBoolean(offset + 19, $acst_grp_flg1);
	}

	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public void acst_grp_flg1(boolean value) {
		setConstBoolean(offset + 19, $acst_grp_flg1, value);
	}


	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return getConstString(offset + 20, $acst_grp_cd1);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		setConstString(offset + 20, $acst_grp_cd1, value);
	}


	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return getConstString(offset + 21, $acst_grp_nm1);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		setConstString(offset + 21, $acst_grp_nm1, value);
	}


	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public boolean acst_grp_flg2() {
		return getConstBoolean(offset + 22, $acst_grp_flg2);
	}

	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public void acst_grp_flg2(boolean value) {
		setConstBoolean(offset + 22, $acst_grp_flg2, value);
	}


	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return getConstString(offset + 23, $acst_grp_cd2);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		setConstString(offset + 23, $acst_grp_cd2, value);
	}


	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return getConstString(offset + 24, $acst_grp_nm2);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		setConstString(offset + 24, $acst_grp_nm2, value);
	}


	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public boolean acst_grp_flg3() {
		return getConstBoolean(offset + 25, $acst_grp_flg3);
	}

	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public void acst_grp_flg3(boolean value) {
		setConstBoolean(offset + 25, $acst_grp_flg3, value);
	}


	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return getConstString(offset + 26, $acst_grp_cd3);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		setConstString(offset + 26, $acst_grp_cd3, value);
	}


	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return getConstString(offset + 27, $acst_grp_nm3);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		setConstString(offset + 27, $acst_grp_nm3, value);
	}


	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public boolean acst_grp_flg4() {
		return getConstBoolean(offset + 28, $acst_grp_flg4);
	}

	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public void acst_grp_flg4(boolean value) {
		setConstBoolean(offset + 28, $acst_grp_flg4, value);
	}


	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return getConstString(offset + 29, $acst_grp_cd4);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		setConstString(offset + 29, $acst_grp_cd4, value);
	}


	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return getConstString(offset + 30, $acst_grp_nm4);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		setConstString(offset + 30, $acst_grp_nm4, value);
	}


	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public boolean acst_grp_flg5() {
		return getConstBoolean(offset + 31, $acst_grp_flg5);
	}

	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public void acst_grp_flg5(boolean value) {
		setConstBoolean(offset + 31, $acst_grp_flg5, value);
	}


	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return getConstString(offset + 32, $acst_grp_cd5);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		setConstString(offset + 32, $acst_grp_cd5, value);
	}


	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return getConstString(offset + 33, $acst_grp_nm5);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		setConstString(offset + 33, $acst_grp_nm5, value);
	}


	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public boolean acst_grp_flg6() {
		return getConstBoolean(offset + 34, $acst_grp_flg6);
	}

	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public void acst_grp_flg6(boolean value) {
		setConstBoolean(offset + 34, $acst_grp_flg6, value);
	}


	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return getConstString(offset + 35, $acst_grp_cd6);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		setConstString(offset + 35, $acst_grp_cd6, value);
	}


	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return getConstString(offset + 36, $acst_grp_nm6);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		setConstString(offset + 36, $acst_grp_nm6, value);
	}


	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public boolean acst_grp_flg7() {
		return getConstBoolean(offset + 37, $acst_grp_flg7);
	}

	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public void acst_grp_flg7(boolean value) {
		setConstBoolean(offset + 37, $acst_grp_flg7, value);
	}


	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return getConstString(offset + 38, $acst_grp_cd7);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		setConstString(offset + 38, $acst_grp_cd7, value);
	}


	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return getConstString(offset + 39, $acst_grp_nm7);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		setConstString(offset + 39, $acst_grp_nm7, value);
	}


	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public boolean acst_grp_flg8() {
		return getConstBoolean(offset + 40, $acst_grp_flg8);
	}

	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public void acst_grp_flg8(boolean value) {
		setConstBoolean(offset + 40, $acst_grp_flg8, value);
	}


	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return getConstString(offset + 41, $acst_grp_cd8);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		setConstString(offset + 41, $acst_grp_cd8, value);
	}


	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return getConstString(offset + 42, $acst_grp_nm8);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		setConstString(offset + 42, $acst_grp_nm8, value);
	}


	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public boolean acst_grp_flg9() {
		return getConstBoolean(offset + 43, $acst_grp_flg9);
	}

	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public void acst_grp_flg9(boolean value) {
		setConstBoolean(offset + 43, $acst_grp_flg9, value);
	}


	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return getConstString(offset + 44, $acst_grp_cd9);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		setConstString(offset + 44, $acst_grp_cd9, value);
	}


	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return getConstString(offset + 45, $acst_grp_nm9);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		setConstString(offset + 45, $acst_grp_nm9, value);
	}


	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public boolean acst_grp_flg10() {
		return getConstBoolean(offset + 46, $acst_grp_flg10);
	}

	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public void acst_grp_flg10(boolean value) {
		setConstBoolean(offset + 46, $acst_grp_flg10, value);
	}


	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return getConstString(offset + 47, $acst_grp_cd10);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		setConstString(offset + 47, $acst_grp_cd10, value);
	}


	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return getConstString(offset + 48, $acst_grp_nm10);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		setConstString(offset + 48, $acst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($zero_disp_flg.equalsIgnoreCase(name)) {
			return zero_disp_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($ar_typ_flg.equalsIgnoreCase(name)) {
			return ar_typ_flg();
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			return acst_grp_flg1();
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			return acst_grp_flg2();
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			return acst_grp_flg3();
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			return acst_grp_flg4();
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			return acst_grp_flg5();
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			return acst_grp_flg6();
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			return acst_grp_flg7();
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			return acst_grp_flg8();
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			return acst_grp_flg9();
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			return acst_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($zero_disp_flg.equalsIgnoreCase(name)) {
			return zero_disp_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($ar_typ_flg.equalsIgnoreCase(name)) {
			return ar_typ_flg();
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			return acst_grp_flg1();
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			return acst_grp_flg2();
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			return acst_grp_flg3();
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			return acst_grp_flg4();
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			return acst_grp_flg5();
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			return acst_grp_flg6();
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			return acst_grp_flg7();
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			return acst_grp_flg8();
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			return acst_grp_flg9();
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			return acst_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($zero_disp_flg.equalsIgnoreCase(name)) {
			zero_disp_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($ar_typ_flg.equalsIgnoreCase(name)) {
			ar_typ_flg(value);
			return;
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			acst_grp_flg1(value);
			return;
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			acst_grp_flg2(value);
			return;
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			acst_grp_flg3(value);
			return;
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			acst_grp_flg4(value);
			return;
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			acst_grp_flg5(value);
			return;
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			acst_grp_flg6(value);
			return;
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			acst_grp_flg7(value);
			return;
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			acst_grp_flg8(value);
			return;
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			acst_grp_flg9(value);
			return;
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			acst_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($zero_disp_flg.equalsIgnoreCase(name)) {
			zero_disp_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($ar_typ_flg.equalsIgnoreCase(name)) {
			ar_typ_flg(value);
			return;
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			acst_grp_flg1(value);
			return;
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			acst_grp_flg2(value);
			return;
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			acst_grp_flg3(value);
			return;
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			acst_grp_flg4(value);
			return;
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			acst_grp_flg5(value);
			return;
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			acst_grp_flg6(value);
			return;
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			acst_grp_flg7(value);
			return;
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			acst_grp_flg8(value);
			return;
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			acst_grp_flg9(value);
			return;
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			acst_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

