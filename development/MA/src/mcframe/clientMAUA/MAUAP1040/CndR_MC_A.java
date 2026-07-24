package mcframe.clientMAUA.MAUAP1040;

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
	 * Dept. cd. (Input value) 部門ＣＤ（入力値）.<p>
	 *
	 */
	public static final String $dpt_cd_input = "dpt_cd_input";
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
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * DAC (Search) flg. ＤＡＣ（検索）ＦＬＧ.<p>
	 *
	 */
	public static final String $rd_flg = "rd_flg";
	/**
	 * DAC (Update) flg. ＤＡＣ（更新）ＦＬＧ.<p>
	 *
	 */
	public static final String $wr_flg = "wr_flg";
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
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public static final String $up_lv_dpt_cd = "up_lv_dpt_cd";
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public static final String $up_lv_dpt_nm = "up_lv_dpt_nm";
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public static final String $new_dpt_cd = "new_dpt_cd";
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_dpt_flg = "ar_dpt_flg";
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_dpt_flg = "sls_dpt_flg";
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_dpt_flg = "purc_dpt_flg";
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public static final String $asst_dpt_flg = "asst_dpt_flg";
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_dpt_flg = "ship_dpt_flg";
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_dpt_flg = "arr_dpt_flg";
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public static final String $mfg_dpt_flg = "mfg_dpt_flg";
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_dpt_flg = "insp_dpt_flg";
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public static final String $sd_dpt_flg = "sd_dpt_flg";
	/**
	 * Non business dept. flg. 業務対象外部門ＦＬＧ.<p>
	 *
	 */
	public static final String $non_biz_dpt_flg = "non_biz_dpt_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	public static final String $dpt_is_srch_typ = "dpt_is_srch_typ";
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public static final String $dpt_is_srch_typ_nm = "dpt_is_srch_typ_nm";
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";


	public static final MCMeta dpt_cd_input_META = createCommonMeta($dpt_cd_input, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rd_flg_META = createCommonMeta($rd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wr_flg_META = createCommonMeta($wr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta up_lv_dpt_cd_META = createCommonMeta($up_lv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta up_lv_dpt_nm_META = createCommonMeta($up_lv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta new_dpt_cd_META = createCommonMeta($new_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_flg_META = createCommonMeta($ar_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dpt_flg_META = createCommonMeta($sls_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_flg_META = createCommonMeta($purc_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_dpt_flg_META = createCommonMeta($asst_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dpt_flg_META = createCommonMeta($ship_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_dpt_flg_META = createCommonMeta($arr_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_dpt_flg_META = createCommonMeta($mfg_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_dpt_flg_META = createCommonMeta($insp_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_dpt_flg_META = createCommonMeta($sd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_biz_dpt_flg_META = createCommonMeta($non_biz_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta dpt_is_srch_typ_META = createCommonMeta($dpt_is_srch_typ, mcframe.commonMA.meta.MA_META.DPT_IS_SRCH_TYP);
	public static final MCMeta dpt_is_srch_typ_nm_META = createCommonMeta($dpt_is_srch_typ_nm, mcframe.commonMA.meta.MA_META.DPT_IS_SRCH_TYP_NM);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dpt_cd_input_META,
			dpt_cd_META,
			dpt_nm_META,
			dt_META,
			rd_flg_META,
			wr_flg_META,
			wg_cd_META,
			wg_nm_META,
			dpt_lvl_cd_META,
			dpt_lvl_nm_META,
			up_lv_dpt_cd_META,
			up_lv_dpt_nm_META,
			new_dpt_cd_META,
			ar_dpt_flg_META,
			ap_dpt_flg_META,
			sls_dpt_flg_META,
			purc_dpt_flg_META,
			asst_dpt_flg_META,
			ship_dpt_flg_META,
			arr_dpt_flg_META,
			mfg_dpt_flg_META,
			insp_dpt_flg_META,
			bd_dpt_flg_META,
			sd_dpt_flg_META,
			non_biz_dpt_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			dpt_is_srch_typ_META,
			dpt_is_srch_typ_nm_META,
			match_typ_META
		},
		new String[][]{
			{
			},
			{
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$up_lv_dpt_cd, "dpt_nm"}	// up_lv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * Dept. cd. (Input value) 部門ＣＤ（入力値）.<p>
	 *
	 */
	public String dpt_cd_input() {
		return getConstString(offset + 0, $dpt_cd_input);
	}

	/**
	 * Dept. cd. (Input value) 部門ＣＤ（入力値）.<p>
	 *
	 */
	public void dpt_cd_input(String value) {
		setConstString(offset + 0, $dpt_cd_input, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 2, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 2, $dpt_nm, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 3, $dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 3, $dt, value);
	}


	/**
	 * DAC (Search) flg. ＤＡＣ（検索）ＦＬＧ.<p>
	 *
	 */
	public boolean rd_flg() {
		return getConstBoolean(offset + 4, $rd_flg);
	}

	/**
	 * DAC (Search) flg. ＤＡＣ（検索）ＦＬＧ.<p>
	 *
	 */
	public void rd_flg(boolean value) {
		setConstBoolean(offset + 4, $rd_flg, value);
	}


	/**
	 * DAC (Update) flg. ＤＡＣ（更新）ＦＬＧ.<p>
	 *
	 */
	public boolean wr_flg() {
		return getConstBoolean(offset + 5, $wr_flg);
	}

	/**
	 * DAC (Update) flg. ＤＡＣ（更新）ＦＬＧ.<p>
	 *
	 */
	public void wr_flg(boolean value) {
		setConstBoolean(offset + 5, $wr_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 8, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 8, $dpt_lvl_cd, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 9, $dpt_lvl_nm);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 9, $dpt_lvl_nm, value);
	}


	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public String up_lv_dpt_cd() {
		return getConstString(offset + 10, $up_lv_dpt_cd);
	}

	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public void up_lv_dpt_cd(String value) {
		setConstString(offset + 10, $up_lv_dpt_cd, value);
	}


	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public String up_lv_dpt_nm() {
		return getConstString(offset + 11, $up_lv_dpt_nm);
	}

	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public void up_lv_dpt_nm(String value) {
		setConstString(offset + 11, $up_lv_dpt_nm, value);
	}


	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public String new_dpt_cd() {
		return getConstString(offset + 12, $new_dpt_cd);
	}

	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public void new_dpt_cd(String value) {
		setConstString(offset + 12, $new_dpt_cd, value);
	}


	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public boolean ar_dpt_flg() {
		return getConstBoolean(offset + 13, $ar_dpt_flg);
	}

	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public void ar_dpt_flg(boolean value) {
		setConstBoolean(offset + 13, $ar_dpt_flg, value);
	}


	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 14, $ap_dpt_flg);
	}

	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 14, $ap_dpt_flg, value);
	}


	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public boolean sls_dpt_flg() {
		return getConstBoolean(offset + 15, $sls_dpt_flg);
	}

	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public void sls_dpt_flg(boolean value) {
		setConstBoolean(offset + 15, $sls_dpt_flg, value);
	}


	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dpt_flg() {
		return getConstBoolean(offset + 16, $purc_dpt_flg);
	}

	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public void purc_dpt_flg(boolean value) {
		setConstBoolean(offset + 16, $purc_dpt_flg, value);
	}


	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public boolean asst_dpt_flg() {
		return getConstBoolean(offset + 17, $asst_dpt_flg);
	}

	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public void asst_dpt_flg(boolean value) {
		setConstBoolean(offset + 17, $asst_dpt_flg, value);
	}


	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public boolean ship_dpt_flg() {
		return getConstBoolean(offset + 18, $ship_dpt_flg);
	}

	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public void ship_dpt_flg(boolean value) {
		setConstBoolean(offset + 18, $ship_dpt_flg, value);
	}


	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public boolean arr_dpt_flg() {
		return getConstBoolean(offset + 19, $arr_dpt_flg);
	}

	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public void arr_dpt_flg(boolean value) {
		setConstBoolean(offset + 19, $arr_dpt_flg, value);
	}


	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public boolean mfg_dpt_flg() {
		return getConstBoolean(offset + 20, $mfg_dpt_flg);
	}

	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public void mfg_dpt_flg(boolean value) {
		setConstBoolean(offset + 20, $mfg_dpt_flg, value);
	}


	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public boolean insp_dpt_flg() {
		return getConstBoolean(offset + 21, $insp_dpt_flg);
	}

	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public void insp_dpt_flg(boolean value) {
		setConstBoolean(offset + 21, $insp_dpt_flg, value);
	}


	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 22, $bd_dpt_flg);
	}

	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 22, $bd_dpt_flg, value);
	}


	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public boolean sd_dpt_flg() {
		return getConstBoolean(offset + 23, $sd_dpt_flg);
	}

	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public void sd_dpt_flg(boolean value) {
		setConstBoolean(offset + 23, $sd_dpt_flg, value);
	}


	/**
	 * Non business dept. flg. 業務対象外部門ＦＬＧ.<p>
	 *
	 */
	public boolean non_biz_dpt_flg() {
		return getConstBoolean(offset + 24, $non_biz_dpt_flg);
	}

	/**
	 * Non business dept. flg. 業務対象外部門ＦＬＧ.<p>
	 *
	 */
	public void non_biz_dpt_flg(boolean value) {
		setConstBoolean(offset + 24, $non_biz_dpt_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}


	public String dpt_is_srch_typ() {
		return getConstString(offset + 28, $dpt_is_srch_typ);
	}

	public void dpt_is_srch_typ(String value) {
		setConstString(offset + 28, $dpt_is_srch_typ, value);
	}


	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public String dpt_is_srch_typ_nm() {
		return getConstString(offset + 29, $dpt_is_srch_typ_nm);
	}

	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public void dpt_is_srch_typ_nm(String value) {
		setConstString(offset + 29, $dpt_is_srch_typ_nm, value);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 30, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 30, $match_typ, value);
	}


	public String getString(String name) {
		if ($dpt_cd_input.equalsIgnoreCase(name)) {
			return dpt_cd_input();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($dpt_is_srch_typ.equalsIgnoreCase(name)) {
			return dpt_is_srch_typ();
		}
		if ($dpt_is_srch_typ_nm.equalsIgnoreCase(name)) {
			return dpt_is_srch_typ_nm();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rd_flg.equalsIgnoreCase(name)) {
			return rd_flg();
		}
		if ($wr_flg.equalsIgnoreCase(name)) {
			return wr_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($non_biz_dpt_flg.equalsIgnoreCase(name)) {
			return non_biz_dpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd_input.equalsIgnoreCase(name)) {
			return dpt_cd_input();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($dpt_is_srch_typ.equalsIgnoreCase(name)) {
			return dpt_is_srch_typ();
		}
		if ($dpt_is_srch_typ_nm.equalsIgnoreCase(name)) {
			return dpt_is_srch_typ_nm();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rd_flg.equalsIgnoreCase(name)) {
			return rd_flg();
		}
		if ($wr_flg.equalsIgnoreCase(name)) {
			return wr_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($non_biz_dpt_flg.equalsIgnoreCase(name)) {
			return non_biz_dpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd_input.equalsIgnoreCase(name)) {
			dpt_cd_input(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($dpt_is_srch_typ.equalsIgnoreCase(name)) {
			dpt_is_srch_typ(value);
			return;
		}
		if ($dpt_is_srch_typ_nm.equalsIgnoreCase(name)) {
			dpt_is_srch_typ_nm(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rd_flg.equalsIgnoreCase(name)) {
			rd_flg(value);
			return;
		}
		if ($wr_flg.equalsIgnoreCase(name)) {
			wr_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($non_biz_dpt_flg.equalsIgnoreCase(name)) {
			non_biz_dpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd_input.equalsIgnoreCase(name)) {
			dpt_cd_input(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($dpt_is_srch_typ.equalsIgnoreCase(name)) {
			dpt_is_srch_typ(value);
			return;
		}
		if ($dpt_is_srch_typ_nm.equalsIgnoreCase(name)) {
			dpt_is_srch_typ_nm(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rd_flg.equalsIgnoreCase(name)) {
			rd_flg(value);
			return;
		}
		if ($wr_flg.equalsIgnoreCase(name)) {
			wr_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($non_biz_dpt_flg.equalsIgnoreCase(name)) {
			non_biz_dpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

