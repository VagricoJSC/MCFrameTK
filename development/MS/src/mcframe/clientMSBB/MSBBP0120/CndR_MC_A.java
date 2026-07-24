package mcframe.clientMSBB.MSBBP0120;

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
	 * UPD,Edit;REF,Refer UPD,訂正する;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $spln_ym_fr = "spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $spln_ym_to = "spln_ym_to";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $spln_vers = "spln_vers";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $fix_f_flg = "fix_f_flg";
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public static final String $fix_t_flg = "fix_t_flg";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
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
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_ym_fr_META = createCommonMeta($spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_ym_to_META = createCommonMeta($spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta spln_vers_META = createCommonMeta($spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta fix_f_flg_META = createCommonMeta($fix_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_t_flg_META = createCommonMeta($fix_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ym_META,
			spln_ym_fr_META,
			spln_ym_to_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			wrk_no_p_META,
			spln_vers_META,
			fix_f_flg_META,
			fix_t_flg_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			cur_cd_META,
			cur_nm_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_nm"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS"},	// dpt_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// cst_cd
				{$spln_vers, "ym;dpt_cd;cst_cd;wrk_no"}	// spln_vers
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ"},	// dpt_cd
				{$cst_cd, "bp_is_srch_typ"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
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
	 * UPD,Edit;REF,Refer UPD,訂正する;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Edit;REF,Refer UPD,訂正する;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 1, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 1, $ym, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate spln_ym_fr() {
		return getConstDate(offset + 2, $spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void spln_ym_fr(MCDate value) {
		setConstDate(offset + 2, $spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate spln_ym_to() {
		return getConstDate(offset + 3, $spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void spln_ym_to(MCDate value) {
		setConstDate(offset + 3, $spln_ym_to, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 7, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 7, $cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 8, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 8, $wrk_no_p, row);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String spln_vers() {
		return getConstString(offset + 9, $spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void spln_vers(String value) {
		setConstString(offset + 9, $spln_vers, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean fix_f_flg() {
		return getConstBoolean(offset + 10, $fix_f_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void fix_f_flg(boolean value) {
		setConstBoolean(offset + 10, $fix_f_flg, value);
	}


	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public boolean fix_t_flg() {
		return getConstBoolean(offset + 11, $fix_t_flg);
	}

	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public void fix_t_flg(boolean value) {
		setConstBoolean(offset + 11, $fix_t_flg, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 12, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 12, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 13, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 13, $spln_itm_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 14, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 14, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 15, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 15, $cur_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 16, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 16, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			return spln_ym_fr();
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			return spln_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			return fix_f_flg();
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			return fix_t_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			return spln_ym_fr();
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			return spln_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			return fix_f_flg();
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			return fix_t_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			spln_ym_fr(value);
			return;
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			spln_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			fix_f_flg(value);
			return;
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			fix_t_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			spln_ym_fr(value);
			return;
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			spln_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			fix_f_flg(value);
			return;
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			fix_t_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Plan item classification 1 計画品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Plan item classification 1 計画品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	/**
	 * Plan item classification cd. 1 計画品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Plan item classification cd. 1 計画品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Plan item classification name 1 計画品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Plan item classification name 1 計画品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Plan item classification 2 計画品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Plan item classification 2 計画品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	/**
	 * Plan item classification cd. 2 計画品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Plan item classification cd. 2 計画品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Plan item classification name 2 計画品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Plan item classification name 2 計画品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Plan item classification 3 計画品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Plan item classification 3 計画品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	/**
	 * Plan item classification cd. 3 計画品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Plan item classification cd. 3 計画品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Plan item classification name 3 計画品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Plan item classification name 3 計画品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Plan item classification 4 計画品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Plan item classification 4 計画品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	/**
	 * Plan item classification cd. 4 計画品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Plan item classification cd. 4 計画品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Plan item classification name 4 計画品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Plan item classification name 4 計画品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Plan item classification 5 計画品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Plan item classification 5 計画品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	/**
	 * Plan item classification cd. 5 計画品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Plan item classification cd. 5 計画品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Plan item classification name 5 計画品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Plan item classification name 5 計画品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Plan item classification 6 計画品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Plan item classification 6 計画品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	/**
	 * Plan item classification cd. 6 計画品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Plan item classification cd. 6 計画品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Plan item classification name 6 計画品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Plan item classification name 6 計画品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Plan item classification 7 計画品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Plan item classification 7 計画品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	/**
	 * Plan item classification cd. 7 計画品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Plan item classification cd. 7 計画品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Plan item classification name 7 計画品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Plan item classification name 7 計画品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Plan item classification 8 計画品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Plan item classification 8 計画品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	/**
	 * Plan item classification cd. 8 計画品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Plan item classification cd. 8 計画品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Plan item classification name 8 計画品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Plan item classification name 8 計画品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Plan item classification 9 計画品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Plan item classification 9 計画品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	/**
	 * Plan item classification cd. 9 計画品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Plan item classification cd. 9 計画品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Plan item classification name 9 計画品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Plan item classification name 9 計画品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Plan item classification 10 計画品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Plan item classification 10 計画品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	/**
	 * Plan item classification cd. 10 計画品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Plan item classification cd. 10 計画品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Plan item classification name 10 計画品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Plan item classification name 10 計画品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

