package mcframe.serverMSUC.MSUCL0010;

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
 * ブロック"GiGr_Loc"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class GiGr_LocR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public static final String $gi_stk_id_typ = "gi_stk_id_typ";
	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_bp_cd = "gi_stk_bp_cd";
	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gi_sppl_cd = "gi_sppl_cd";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public static final String $gi_loc_mng_typ = "gi_loc_mng_typ";
	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public static final String $gi_vmi_flg = "gi_vmi_flg";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public static final String $gr_schd_dt = "gr_schd_dt";
	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gr_stk_arrv_bp_cd = "gr_stk_arrv_bp_cd";
	/**
	 * GR inventory identification type 入庫在庫識別区分.<p>
	 *
	 */
	public static final String $gr_stk_id_typ = "gr_stk_id_typ";
	/**
	 * GR inventory BP cd. 入庫在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $gr_stk_bp_cd = "gr_stk_bp_cd";
	/**
	 * GR asset type 入庫資産区分.<p>
	 *
	 */
	public static final String $gr_asst_typ = "gr_asst_typ";
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gr_sppl_cd = "gr_sppl_cd";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gr_lg_grp_cd = "gr_lg_grp_cd";
	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public static final String $gr_loc_mng_typ = "gr_loc_mng_typ";
	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public static final String $gr_prov_rcv_typ = "gr_prov_rcv_typ";
	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public static final String $gr_prov_basis_typ = "gr_prov_basis_typ";
	/**
	 * GR supply type 入庫支給区分.<p>
	 *
	 */
	public static final String $gr_prov_typ = "gr_prov_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_id_typ_META = createCommonMeta($gi_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta gi_stk_bp_cd_META = createCommonMeta($gi_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_sppl_cd_META = createCommonMeta($gi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_mng_typ_META = createCommonMeta($gi_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta gi_vmi_flg_META = createCommonMeta($gi_vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_schd_dt_META = createCommonMeta($gr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_stk_arrv_bp_cd_META = createCommonMeta($gr_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_stk_id_typ_META = createCommonMeta($gr_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta gr_stk_bp_cd_META = createCommonMeta($gr_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_asst_typ_META = createCommonMeta($gr_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta gr_sppl_cd_META = createCommonMeta($gr_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_loc_mng_typ_META = createCommonMeta($gr_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta gr_prov_rcv_typ_META = createCommonMeta($gr_prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta gr_prov_basis_typ_META = createCommonMeta($gr_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta gr_prov_typ_META = createCommonMeta($gr_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);

	protected static final ConstMetaList<GiGr_LocR> constMetas = new ConstMetaList<GiGr_LocR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_schd_dt_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_id_typ_META,
			gi_stk_bp_cd_META,
			gi_sppl_cd_META,
			gi_wg_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_mng_typ_META,
			gi_vmi_flg_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			gr_schd_dt_META,
			gr_stk_arrv_bp_cd_META,
			gr_stk_id_typ_META,
			gr_stk_bp_cd_META,
			gr_asst_typ_META,
			gr_sppl_cd_META,
			gr_wg_cd_META,
			gr_lg_grp_cd_META,
			gr_loc_mng_typ_META,
			gr_prov_rcv_typ_META,
			gr_prov_basis_typ_META,
			gr_prov_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected GiGr_LocR_MC_A(ConstMetaList<? extends GiGr_LocR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GiGr_LocR clone() {
		return (GiGr_LocR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GiGr_LocR createInstance() {
		return (GiGr_LocR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GiGr_LocR getValues(String... names) {
		return (GiGr_LocR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 5, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 5, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 6, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 6, $gi_str_ln_cd, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 7, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 7, $gi_schd_dt, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 8, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 8, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public String gi_stk_id_typ() {
		return getConstString(offset + 9, $gi_stk_id_typ);
	}

	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public void gi_stk_id_typ(String value) {
		setConstString(offset + 9, $gi_stk_id_typ, value);
	}


	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public String gi_stk_bp_cd() {
		return getConstString(offset + 10, $gi_stk_bp_cd);
	}

	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public void gi_stk_bp_cd(String value) {
		setConstString(offset + 10, $gi_stk_bp_cd, value);
	}


	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return getConstString(offset + 11, $gi_sppl_cd);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		setConstString(offset + 11, $gi_sppl_cd, value);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 12, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 12, $gi_wg_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 13, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 13, $gi_lg_grp_cd, value);
	}


	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public String gi_loc_mng_typ() {
		return getConstString(offset + 14, $gi_loc_mng_typ);
	}

	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public void gi_loc_mng_typ(String value) {
		setConstString(offset + 14, $gi_loc_mng_typ, value);
	}


	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public boolean gi_vmi_flg() {
		return getConstBoolean(offset + 15, $gi_vmi_flg);
	}

	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public void gi_vmi_flg(boolean value) {
		setConstBoolean(offset + 15, $gi_vmi_flg, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 16, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 16, $gr_loc_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 17, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 17, $gr_str_ln_cd, value);
	}


	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return getConstDate(offset + 18, $gr_schd_dt);
	}

	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		setConstDate(offset + 18, $gr_schd_dt, value);
	}


	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return getConstString(offset + 19, $gr_stk_arrv_bp_cd);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		setConstString(offset + 19, $gr_stk_arrv_bp_cd, value);
	}


	/**
	 * GR inventory identification type 入庫在庫識別区分.<p>
	 *
	 */
	public String gr_stk_id_typ() {
		return getConstString(offset + 20, $gr_stk_id_typ);
	}

	/**
	 * GR inventory identification type 入庫在庫識別区分.<p>
	 *
	 */
	public void gr_stk_id_typ(String value) {
		setConstString(offset + 20, $gr_stk_id_typ, value);
	}


	/**
	 * GR inventory BP cd. 入庫在庫取引先ＣＤ.<p>
	 *
	 */
	public String gr_stk_bp_cd() {
		return getConstString(offset + 21, $gr_stk_bp_cd);
	}

	/**
	 * GR inventory BP cd. 入庫在庫取引先ＣＤ.<p>
	 *
	 */
	public void gr_stk_bp_cd(String value) {
		setConstString(offset + 21, $gr_stk_bp_cd, value);
	}


	/**
	 * GR asset type 入庫資産区分.<p>
	 *
	 */
	public String gr_asst_typ() {
		return getConstString(offset + 22, $gr_asst_typ);
	}

	/**
	 * GR asset type 入庫資産区分.<p>
	 *
	 */
	public void gr_asst_typ(String value) {
		setConstString(offset + 22, $gr_asst_typ, value);
	}


	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public String gr_sppl_cd() {
		return getConstString(offset + 23, $gr_sppl_cd);
	}

	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public void gr_sppl_cd(String value) {
		setConstString(offset + 23, $gr_sppl_cd, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 24, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 24, $gr_wg_cd, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 25, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 25, $gr_lg_grp_cd, value);
	}


	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public String gr_loc_mng_typ() {
		return getConstString(offset + 26, $gr_loc_mng_typ);
	}

	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public void gr_loc_mng_typ(String value) {
		setConstString(offset + 26, $gr_loc_mng_typ, value);
	}


	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public String gr_prov_rcv_typ() {
		return getConstString(offset + 27, $gr_prov_rcv_typ);
	}

	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public void gr_prov_rcv_typ(String value) {
		setConstString(offset + 27, $gr_prov_rcv_typ, value);
	}


	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public String gr_prov_basis_typ() {
		return getConstString(offset + 28, $gr_prov_basis_typ);
	}

	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public void gr_prov_basis_typ(String value) {
		setConstString(offset + 28, $gr_prov_basis_typ, value);
	}


	/**
	 * GR supply type 入庫支給区分.<p>
	 *
	 */
	public String gr_prov_typ() {
		return getConstString(offset + 29, $gr_prov_typ);
	}

	/**
	 * GR supply type 入庫支給区分.<p>
	 *
	 */
	public void gr_prov_typ(String value) {
		setConstString(offset + 29, $gr_prov_typ, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			return gi_stk_id_typ();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			return gi_loc_mng_typ();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
		}
		if ($gr_stk_id_typ.equalsIgnoreCase(name)) {
			return gr_stk_id_typ();
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_bp_cd();
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			return gr_asst_typ();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			return gr_loc_mng_typ();
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			return gr_prov_rcv_typ();
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			return gr_prov_basis_typ();
		}
		if ($gr_prov_typ.equalsIgnoreCase(name)) {
			return gr_prov_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			return gi_stk_id_typ();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			return gi_loc_mng_typ();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
		}
		if ($gr_stk_id_typ.equalsIgnoreCase(name)) {
			return gr_stk_id_typ();
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_bp_cd();
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			return gr_asst_typ();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			return gr_loc_mng_typ();
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			return gr_prov_rcv_typ();
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			return gr_prov_basis_typ();
		}
		if ($gr_prov_typ.equalsIgnoreCase(name)) {
			return gr_prov_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			gi_stk_id_typ(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			gi_loc_mng_typ(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_stk_id_typ.equalsIgnoreCase(name)) {
			gr_stk_id_typ(value);
			return;
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_bp_cd(value);
			return;
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			gr_asst_typ(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			gr_loc_mng_typ(value);
			return;
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			gr_prov_rcv_typ(value);
			return;
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			gr_prov_basis_typ(value);
			return;
		}
		if ($gr_prov_typ.equalsIgnoreCase(name)) {
			gr_prov_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			gi_stk_id_typ(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			gi_loc_mng_typ(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_stk_id_typ.equalsIgnoreCase(name)) {
			gr_stk_id_typ(value);
			return;
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_bp_cd(value);
			return;
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			gr_asst_typ(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			gr_loc_mng_typ(value);
			return;
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			gr_prov_rcv_typ(value);
			return;
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			gr_prov_basis_typ(value);
			return;
		}
		if ($gr_prov_typ.equalsIgnoreCase(name)) {
			gr_prov_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

