package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd03_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public static final String $itm_mfg_inst_qty = "itm_mfg_inst_qty";
	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_lot_no = "mfg_inst_lot_no";
	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_sublot_no = "mfg_inst_sublot_no";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	public static final String $yield_act = "yield_act";

	public static final String $yield_act_no = $yield_act + ".yield_act_no";
	public static final String $mfg_act_no = $yield_act + ".mfg_act_no";
	public static final String $itm_mfg_inst_no = $yield_act + ".itm_mfg_inst_no";
	public static final String $oper_act_no = $yield_act + ".oper_act_no";
	public static final String $yield_schd_no = $yield_act + ".yield_schd_no";
	public static final String $div_seq = $yield_act + ".div_seq";
	public static final String $mfg_mtd_typ = $yield_act + ".mfg_mtd_typ";
	public static final String $itm_cd = $yield_act + ".itm_cd";
	public static final String $itm_sub1 = $yield_act + ".itm_sub1";
	public static final String $itm_sub2 = $yield_act + ".itm_sub2";
	public static final String $itm_sub3 = $yield_act + ".itm_sub3";
	public static final String $trd_unit_qty = $yield_act + ".trd_unit_qty";
	public static final String $trd_unit_cd = $yield_act + ".trd_unit_cd";
	public static final String $base_unit_qty = $yield_act + ".base_unit_qty";
	public static final String $base_unit_cd = $yield_act + ".base_unit_cd";
	public static final String $yield_typ = $yield_act + ".yield_typ";
	public static final String $yield_rate = $yield_act + ".yield_rate";
	public static final String $lot_no = $yield_act + ".lot_no";
	public static final String $sublot_no = $yield_act + ".sublot_no";
	public static final String $sno1 = $yield_act + ".sno1";
	public static final String $sno2 = $yield_act + ".sno2";
	public static final String $sno3 = $yield_act + ".sno3";
	public static final String $sno4 = $yield_act + ".sno4";
	public static final String $quality_typ = $yield_act + ".quality_typ";
	public static final String $stk_insp_typ = $yield_act + ".stk_insp_typ";
	public static final String $gd_cd = $yield_act + ".gd_cd";
	public static final String $yield_rsn_cd = $yield_act + ".yield_rsn_cd";
	public static final String $yield_loc_cd = $yield_act + ".yield_loc_cd";
	public static final String $yield_str_ln_cd = $yield_act + ".yield_str_ln_cd";
	public static final String $strg_loc_cd = $yield_act + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $yield_act + ".strg_str_ln_cd";
	public static final String $act_tm = $yield_act + ".act_tm";
	public static final String $ac_dt = $yield_act + ".ac_dt";
	public static final String $bkf_ctl_flg = $yield_act + ".bkf_ctl_flg";
	public static final String $lot_ctl_flg = $yield_act + ".lot_ctl_flg";
	public static final String $sublot_ctl_flg = $yield_act + ".sublot_ctl_flg";
	public static final String $not_stk_flg = $yield_act + ".not_stk_flg";
	public static final String $data_no = $yield_act + ".data_no";
	public static final String $mes_id = $yield_act + ".mes_id";
	public static final String $intr_rmrks = $yield_act + ".intr_rmrks";
	public static final String $act_rpt_rmrks = $yield_act + ".act_rpt_rmrks";
	public static final String $insp_cnt_rmrks = $yield_act + ".insp_cnt_rmrks";
	public static final String $trd_rmrks = $yield_act + ".trd_rmrks";
	public static final String $yield_act_sub_char1 = $yield_act + ".sub_char1";
	public static final String $yield_act_sub_char2 = $yield_act + ".sub_char2";
	public static final String $yield_act_sub_char3 = $yield_act + ".sub_char3";
	public static final String $mes_flg = $yield_act + ".mes_flg";
	public static final String $ext_sys_cd = $yield_act + ".ext_sys_cd";
	public static final String $ext_yield_act_no = $yield_act + ".ext_yield_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta itm_mfg_inst_qty_META = createCommonMeta($itm_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta mfg_inst_lot_no_META = createCommonMeta($mfg_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mfg_inst_sublot_no_META = createCommonMeta($mfg_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_act_META = createInnerRowMeta($yield_act, mcframe.serverMS.dbc.MST_YIELD_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd03_DtlR> constMetas = new ConstMetaList<MfgActTblReg_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			itm_ord_no_META,
			can_ac_dt_META,
			pack_flg_META,
			mfg_inst_no_META,
			wg_cd_META,
			site_cd_META,
			trd_cd_META,
			act_dpt_cd_META,
			act_usr_cd_META,
			itm_mfg_inst_qty_META,
			mfg_st_qty_META,
			disp_seq_META,
			oper_cd_META,
			mfg_inst_lot_no_META,
			mfg_inst_sublot_no_META,
			mfg_inst_unit_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			abort_flg_META,
			yield_act_META
		},
		new String[][]{
			{
				"yield_act_no",
				"mfg_act_no",
				"itm_mfg_inst_no",
				"oper_act_no",
				"yield_schd_no",
				"div_seq",
				"mfg_mtd_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"yield_typ",
				"yield_rate",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"quality_typ",
				"stk_insp_typ",
				"gd_cd",
				"yield_rsn_cd",
				"yield_loc_cd",
				"yield_str_ln_cd",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"act_tm",
				"ac_dt",
				"bkf_ctl_flg",
				"lot_ctl_flg",
				"sublot_ctl_flg",
				"not_stk_flg",
				"data_no",
				"mes_id",
				"intr_rmrks",
				"act_rpt_rmrks",
				"insp_cnt_rmrks",
				"trd_rmrks",
				"yield_act_sub_char1",
				"yield_act_sub_char2",
				"yield_act_sub_char3",
				"mes_flg",
				"ext_sys_cd",
				"ext_yield_act_no"
			},
			{
				$yield_act_no,
				$mfg_act_no,
				$itm_mfg_inst_no,
				$oper_act_no,
				$yield_schd_no,
				$div_seq,
				$mfg_mtd_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$yield_typ,
				$yield_rate,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$quality_typ,
				$stk_insp_typ,
				$gd_cd,
				$yield_rsn_cd,
				$yield_loc_cd,
				$yield_str_ln_cd,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$act_tm,
				$ac_dt,
				$bkf_ctl_flg,
				$lot_ctl_flg,
				$sublot_ctl_flg,
				$not_stk_flg,
				$data_no,
				$mes_id,
				$intr_rmrks,
				$act_rpt_rmrks,
				$insp_cnt_rmrks,
				$trd_rmrks,
				$yield_act_sub_char1,
				$yield_act_sub_char2,
				$yield_act_sub_char3,
				$mes_flg,
				$ext_sys_cd,
				$ext_yield_act_no
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
	protected MfgActTblReg_Upd03_DtlR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd03_DtlR clone() {
		return (MfgActTblReg_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd03_DtlR createInstance() {
		return (MfgActTblReg_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd03_DtlR getValues(String... names) {
		return (MfgActTblReg_Upd03_DtlR) super.getValues(names);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 2, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 2, $itm_ord_no, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 3, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 3, $can_ac_dt, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 4, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 4, $pack_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 5, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 5, $mfg_inst_no, value);
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 7, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 7, $site_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 8, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 8, $trd_cd, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 9, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 9, $act_dpt_cd, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 10, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 10, $act_usr_cd, value);
	}


	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_qty() {
		return getConstNumber(offset + 11, $itm_mfg_inst_qty);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 11, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(int value) {
		setConstNumber(offset + 11, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(long value) {
		setConstNumber(offset + 11, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(float value) {
		setConstNumber(offset + 11, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(double value) {
		setConstNumber(offset + 11, $itm_mfg_inst_qty, value);
	}


	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 12, $mfg_st_qty);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 12, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 12, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 12, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 12, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 12, $mfg_st_qty, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 13, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 14, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 14, $oper_cd, value);
	}


	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_lot_no() {
		return getConstString(offset + 15, $mfg_inst_lot_no);
	}

	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_lot_no(String value) {
		setConstString(offset + 15, $mfg_inst_lot_no, value);
	}


	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_sublot_no() {
		return getConstString(offset + 16, $mfg_inst_sublot_no);
	}

	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_sublot_no(String value) {
		setConstString(offset + 16, $mfg_inst_sublot_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 17, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 17, $mfg_inst_unit_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 18, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 18, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 19, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 19, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 20, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 20, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 21, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 21, $sno4_mng_typ, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 22, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 22, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 22, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 22, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 22, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 22, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 23, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 23, $pack_unit_cd, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 24, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 24, $abort_flg, value);
	}


	public mcframe.serverMS.dbc.MST_YIELD_ACT_R yield_act(){
		return (mcframe.serverMS.dbc.MST_YIELD_ACT_R) getConstInnerRow(offset + 25, $yield_act);
	}
	
	public void yield_act(mcframe.serverMS.dbc.MST_YIELD_ACT_R row){
		setConstInnerRow(offset + 25, $yield_act, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($yield_act.equalsIgnoreCase(name)) {
			return yield_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($yield_act.equalsIgnoreCase(name)) {
			yield_act(
				((MCContainerMeta) yield_act_META).castInnerRow(mcframe.serverMS.dbc.MST_YIELD_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return yield_act().yield_act_no();
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		yield_act().yield_act_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return yield_act().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		yield_act().mfg_act_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return yield_act().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		yield_act().itm_mfg_inst_no(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return yield_act().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		yield_act().oper_act_no(value);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return yield_act().yield_schd_no();
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		yield_act().yield_schd_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return yield_act().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		yield_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		yield_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		yield_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		yield_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		yield_act().div_seq(value);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return yield_act().mfg_mtd_typ();
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		yield_act().mfg_mtd_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return yield_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		yield_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return yield_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		yield_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return yield_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		yield_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return yield_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		yield_act().itm_sub3(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return yield_act().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		yield_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		yield_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		yield_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		yield_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		yield_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return yield_act().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		yield_act().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return yield_act().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		yield_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		yield_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		yield_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		yield_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		yield_act().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return yield_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		yield_act().base_unit_cd(value);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return yield_act().yield_typ();
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		yield_act().yield_typ(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return yield_act().yield_rate();
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		yield_act().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		yield_act().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		yield_act().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		yield_act().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		yield_act().yield_rate(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return yield_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		yield_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return yield_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		yield_act().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return yield_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		yield_act().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return yield_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		yield_act().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return yield_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		yield_act().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return yield_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		yield_act().sno4(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return yield_act().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		yield_act().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return yield_act().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		yield_act().stk_insp_typ(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return yield_act().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		yield_act().gd_cd(value);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return yield_act().yield_rsn_cd();
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		yield_act().yield_rsn_cd(value);
	}

	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public String yield_loc_cd() {
		return yield_act().yield_loc_cd();
	}

	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public void yield_loc_cd(String value) {
		yield_act().yield_loc_cd(value);
	}

	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public String yield_str_ln_cd() {
		return yield_act().yield_str_ln_cd();
	}

	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public void yield_str_ln_cd(String value) {
		yield_act().yield_str_ln_cd(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return yield_act().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		yield_act().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return yield_act().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		yield_act().strg_str_ln_cd(value);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return yield_act().act_tm();
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		yield_act().act_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return yield_act().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		yield_act().ac_dt(value);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return yield_act().bkf_ctl_flg();
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		yield_act().bkf_ctl_flg(value);
	}

	/**
	 * Allow same lot numbering 同一ロット発番許可.<p>
	 *
	 */
	public boolean lot_ctl_flg() {
		return yield_act().lot_ctl_flg();
	}

	/**
	 * Allow same lot numbering 同一ロット発番許可.<p>
	 *
	 */
	public void lot_ctl_flg(boolean value) {
		yield_act().lot_ctl_flg(value);
	}

	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public boolean sublot_ctl_flg() {
		return yield_act().sublot_ctl_flg();
	}

	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public void sublot_ctl_flg(boolean value) {
		yield_act().sublot_ctl_flg(value);
	}

	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public boolean not_stk_flg() {
		return yield_act().not_stk_flg();
	}

	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		yield_act().not_stk_flg(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return yield_act().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		yield_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		yield_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		yield_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		yield_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		yield_act().data_no(value);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return yield_act().mes_id();
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		yield_act().mes_id(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return yield_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		yield_act().intr_rmrks(value);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return yield_act().act_rpt_rmrks();
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		yield_act().act_rpt_rmrks(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return yield_act().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		yield_act().insp_cnt_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return yield_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		yield_act().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return yield_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		yield_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return yield_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		yield_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return yield_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		yield_act().sub_char3(value);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return yield_act().mes_flg();
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		yield_act().mes_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return yield_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		yield_act().ext_sys_cd(value);
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public String ext_yield_act_no() {
		return yield_act().ext_yield_act_no();
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		yield_act().ext_yield_act_no(value);
	}

}

