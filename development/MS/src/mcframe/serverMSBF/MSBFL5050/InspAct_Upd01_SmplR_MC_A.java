package mcframe.serverMSBF.MSBFL5050;

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
 * ブロック"InspAct_Upd01_Smpl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspAct_Upd01_SmplR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	public static final String $insp_smpl_act = "insp_smpl_act";
	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public static final String $rmrks_upd_flg = "rmrks_upd_flg";
	/**
	 * Enter sampling GR/GI result 抜取受払実績登録.<p>
	 *
	 */
	public static final String $smpl_io_ins_flg = "smpl_io_ins_flg";
	/**
	 * Update sampling GR/GI result 抜取受払実績更新.<p>
	 *
	 */
	public static final String $smpl_io_upd_flg = "smpl_io_upd_flg";
	/**
	 * Delete sampling GR/GI result 抜取受払実績削除.<p>
	 *
	 */
	public static final String $smpl_io_del_flg = "smpl_io_del_flg";
	/**
	 * SKU transfer back 荷姿振替戻し.<p>
	 *
	 */
	public static final String $xfr_pack_rtn_flg = "xfr_pack_rtn_flg";
	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public static final String $db_pack_xfr_pack_unit_qty = "db_pack_xfr_pack_unit_qty";
	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public static final String $db_pack_xfr_base_unit_qty = "db_pack_xfr_base_unit_qty";
	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public static final String $db_so_qty = "db_so_qty";

	public static final String $insp_smpl_act_no = $insp_smpl_act + ".insp_smpl_act_no";
	public static final String $insp_schd_no = $insp_smpl_act + ".insp_schd_no";
	public static final String $insp_act_no = $insp_smpl_act + ".insp_act_no";
	public static final String $itm_cd = $insp_smpl_act + ".itm_cd";
	public static final String $itm_sub1 = $insp_smpl_act + ".itm_sub1";
	public static final String $itm_sub2 = $insp_smpl_act + ".itm_sub2";
	public static final String $itm_sub3 = $insp_smpl_act + ".itm_sub3";
	public static final String $so_qty = $insp_smpl_act + ".so_qty";
	public static final String $smpl_qty = $insp_smpl_act + ".smpl_qty";
	public static final String $base_unit_cd = $insp_smpl_act + ".base_unit_cd";
	public static final String $pack_xfr_pack_unit_qty = $insp_smpl_act + ".pack_xfr_pack_unit_qty";
	public static final String $pack_xfr_pack_unit_cd = $insp_smpl_act + ".pack_xfr_pack_unit_cd";
	public static final String $pack_xfr_base_unit_qty = $insp_smpl_act + ".pack_xfr_base_unit_qty";
	public static final String $pack_xfr_base_unit_cd = $insp_smpl_act + ".pack_xfr_base_unit_cd";
	public static final String $loc_cd = $insp_smpl_act + ".loc_cd";
	public static final String $str_ln_cd = $insp_smpl_act + ".str_ln_cd";
	public static final String $quality_typ = $insp_smpl_act + ".quality_typ";
	public static final String $stk_insp_typ = $insp_smpl_act + ".stk_insp_typ";
	public static final String $stk_id_typ = $insp_smpl_act + ".stk_id_typ";
	public static final String $stk_bp_cd = $insp_smpl_act + ".stk_bp_cd";
	public static final String $gd_cd = $insp_smpl_act + ".gd_cd";
	public static final String $stk_arrv_bp_cd = $insp_smpl_act + ".stk_arrv_bp_cd";
	public static final String $lot_no = $insp_smpl_act + ".lot_no";
	public static final String $sublot_no = $insp_smpl_act + ".sublot_no";
	public static final String $sno1 = $insp_smpl_act + ".sno1";
	public static final String $sno1_mng_typ = $insp_smpl_act + ".sno1_mng_typ";
	public static final String $sno2 = $insp_smpl_act + ".sno2";
	public static final String $sno2_mng_typ = $insp_smpl_act + ".sno2_mng_typ";
	public static final String $sno3 = $insp_smpl_act + ".sno3";
	public static final String $sno3_mng_typ = $insp_smpl_act + ".sno3_mng_typ";
	public static final String $sno4 = $insp_smpl_act + ".sno4";
	public static final String $sno4_mng_typ = $insp_smpl_act + ".sno4_mng_typ";
	public static final String $fix_no_typ = $insp_smpl_act + ".fix_no_typ";
	public static final String $fix_no = $insp_smpl_act + ".fix_no";
	public static final String $ac_dt = $insp_smpl_act + ".ac_dt";
	public static final String $bd_dpt_cd = $insp_smpl_act + ".bd_dpt_cd";
	public static final String $so_cmpl_flg = $insp_smpl_act + ".so_cmpl_flg";
	public static final String $trd_rmrks = $insp_smpl_act + ".trd_rmrks";
	public static final String $intr_rmrks = $insp_smpl_act + ".intr_rmrks";
	public static final String $sub_char1 = $insp_smpl_act + ".sub_char1";
	public static final String $sub_char2 = $insp_smpl_act + ".sub_char2";
	public static final String $sub_char3 = $insp_smpl_act + ".sub_char3";
	public static final String $lims_flg = $insp_smpl_act + ".lims_flg";
	public static final String $ext_sys_cd = $insp_smpl_act + ".ext_sys_cd";
	public static final String $ext_insp_smpl_act_no = $insp_smpl_act + ".ext_insp_smpl_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_smpl_act_META = createInnerRowMeta($insp_smpl_act, mcframe.serverMS.dbc.MST_INSP_SMPL_ACT_R.class);
	public static final MCMeta rmrks_upd_flg_META = createCommonMeta($rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta smpl_io_ins_flg_META = createCommonMeta($smpl_io_ins_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta smpl_io_upd_flg_META = createCommonMeta($smpl_io_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta smpl_io_del_flg_META = createCommonMeta($smpl_io_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_pack_rtn_flg_META = createCommonMeta($xfr_pack_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta db_pack_xfr_pack_unit_qty_META = createCommonMeta($db_pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_pack_xfr_base_unit_qty_META = createCommonMeta($db_pack_xfr_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_so_qty_META = createCommonMeta($db_so_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<InspAct_Upd01_SmplR> constMetas = new ConstMetaList<InspAct_Upd01_SmplR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			insp_no_META,
			data_crud_typ_META,
			can_ac_dt_META,
			act_tm_META,
			insp_smpl_act_META,
			rmrks_upd_flg_META,
			smpl_io_ins_flg_META,
			smpl_io_upd_flg_META,
			smpl_io_del_flg_META,
			xfr_pack_rtn_flg_META,
			db_pack_xfr_pack_unit_qty_META,
			db_pack_xfr_base_unit_qty_META,
			db_so_qty_META
		},
		new String[][]{
			{
				"insp_smpl_act_no",
				"insp_schd_no",
				"insp_act_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"so_qty",
				"smpl_qty",
				"base_unit_cd",
				"pack_xfr_pack_unit_qty",
				"pack_xfr_pack_unit_cd",
				"pack_xfr_base_unit_qty",
				"pack_xfr_base_unit_cd",
				"loc_cd",
				"str_ln_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"gd_cd",
				"stk_arrv_bp_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno1_mng_typ",
				"sno2",
				"sno2_mng_typ",
				"sno3",
				"sno3_mng_typ",
				"sno4",
				"sno4_mng_typ",
				"fix_no_typ",
				"fix_no",
				"ac_dt",
				"bd_dpt_cd",
				"so_cmpl_flg",
				"trd_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"lims_flg",
				"ext_sys_cd",
				"ext_insp_smpl_act_no"
			},
			{
				$insp_smpl_act_no,
				$insp_schd_no,
				$insp_act_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$so_qty,
				$smpl_qty,
				$base_unit_cd,
				$pack_xfr_pack_unit_qty,
				$pack_xfr_pack_unit_cd,
				$pack_xfr_base_unit_qty,
				$pack_xfr_base_unit_cd,
				$loc_cd,
				$str_ln_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$gd_cd,
				$stk_arrv_bp_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno1_mng_typ,
				$sno2,
				$sno2_mng_typ,
				$sno3,
				$sno3_mng_typ,
				$sno4,
				$sno4_mng_typ,
				$fix_no_typ,
				$fix_no,
				$ac_dt,
				$bd_dpt_cd,
				$so_cmpl_flg,
				$trd_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$lims_flg,
				$ext_sys_cd,
				$ext_insp_smpl_act_no
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
	protected InspAct_Upd01_SmplR_MC_A(ConstMetaList<? extends InspAct_Upd01_SmplR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd01_SmplR clone() {
		return (InspAct_Upd01_SmplR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd01_SmplR createInstance() {
		return (InspAct_Upd01_SmplR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd01_SmplR getValues(String... names) {
		return (InspAct_Upd01_SmplR) super.getValues(names);
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
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 1, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 1, $insp_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
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
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 4, $act_tm);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 4, $act_tm, value);
	}


	public mcframe.serverMS.dbc.MST_INSP_SMPL_ACT_R insp_smpl_act(){
		return (mcframe.serverMS.dbc.MST_INSP_SMPL_ACT_R) getConstInnerRow(offset + 5, $insp_smpl_act);
	}
	
	public void insp_smpl_act(mcframe.serverMS.dbc.MST_INSP_SMPL_ACT_R row){
		setConstInnerRow(offset + 5, $insp_smpl_act, row);
	}


	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public boolean rmrks_upd_flg() {
		return getConstBoolean(offset + 6, $rmrks_upd_flg);
	}

	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public void rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 6, $rmrks_upd_flg, value);
	}


	/**
	 * Enter sampling GR/GI result 抜取受払実績登録.<p>
	 *
	 */
	public boolean smpl_io_ins_flg() {
		return getConstBoolean(offset + 7, $smpl_io_ins_flg);
	}

	/**
	 * Enter sampling GR/GI result 抜取受払実績登録.<p>
	 *
	 */
	public void smpl_io_ins_flg(boolean value) {
		setConstBoolean(offset + 7, $smpl_io_ins_flg, value);
	}


	/**
	 * Update sampling GR/GI result 抜取受払実績更新.<p>
	 *
	 */
	public boolean smpl_io_upd_flg() {
		return getConstBoolean(offset + 8, $smpl_io_upd_flg);
	}

	/**
	 * Update sampling GR/GI result 抜取受払実績更新.<p>
	 *
	 */
	public void smpl_io_upd_flg(boolean value) {
		setConstBoolean(offset + 8, $smpl_io_upd_flg, value);
	}


	/**
	 * Delete sampling GR/GI result 抜取受払実績削除.<p>
	 *
	 */
	public boolean smpl_io_del_flg() {
		return getConstBoolean(offset + 9, $smpl_io_del_flg);
	}

	/**
	 * Delete sampling GR/GI result 抜取受払実績削除.<p>
	 *
	 */
	public void smpl_io_del_flg(boolean value) {
		setConstBoolean(offset + 9, $smpl_io_del_flg, value);
	}


	/**
	 * SKU transfer back 荷姿振替戻し.<p>
	 *
	 */
	public boolean xfr_pack_rtn_flg() {
		return getConstBoolean(offset + 10, $xfr_pack_rtn_flg);
	}

	/**
	 * SKU transfer back 荷姿振替戻し.<p>
	 *
	 */
	public void xfr_pack_rtn_flg(boolean value) {
		setConstBoolean(offset + 10, $xfr_pack_rtn_flg, value);
	}


	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public MCNumber db_pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty);
	}

	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer SKU qty. (DB) 荷姿振替荷姿単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 11, $db_pack_xfr_pack_unit_qty, value);
	}


	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public MCNumber db_pack_xfr_base_unit_qty() {
		return getConstNumber(offset + 12, $db_pack_xfr_base_unit_qty);
	}

	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 12, $db_pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_base_unit_qty(int value) {
		setConstNumber(offset + 12, $db_pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_base_unit_qty(long value) {
		setConstNumber(offset + 12, $db_pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_base_unit_qty(float value) {
		setConstNumber(offset + 12, $db_pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. (DB) 荷姿振替基準単位数量（ＤＢ）.<p>
	 *
	 */
	public void db_pack_xfr_base_unit_qty(double value) {
		setConstNumber(offset + 12, $db_pack_xfr_base_unit_qty, value);
	}


	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public MCNumber db_so_qty() {
		return getConstNumber(offset + 13, $db_so_qty);
	}

	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public void db_so_qty(MCNumber value) {
		setConstNumber(offset + 13, $db_so_qty, value);
	}

	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public void db_so_qty(int value) {
		setConstNumber(offset + 13, $db_so_qty, value);
	}

	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public void db_so_qty(long value) {
		setConstNumber(offset + 13, $db_so_qty, value);
	}

	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public void db_so_qty(float value) {
		setConstNumber(offset + 13, $db_so_qty, value);
	}

	/**
	 * Deducted qty. (DB) 引落数量（ＤＢ）.<p>
	 *
	 */
	public void db_so_qty(double value) {
		setConstNumber(offset + 13, $db_so_qty, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return db_pack_xfr_pack_unit_qty();
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return db_pack_xfr_base_unit_qty();
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			return db_so_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			return rmrks_upd_flg();
		}
		if ($smpl_io_ins_flg.equalsIgnoreCase(name)) {
			return smpl_io_ins_flg();
		}
		if ($smpl_io_upd_flg.equalsIgnoreCase(name)) {
			return smpl_io_upd_flg();
		}
		if ($smpl_io_del_flg.equalsIgnoreCase(name)) {
			return smpl_io_del_flg();
		}
		if ($xfr_pack_rtn_flg.equalsIgnoreCase(name)) {
			return xfr_pack_rtn_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return db_pack_xfr_pack_unit_qty();
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return db_pack_xfr_base_unit_qty();
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			return db_so_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			return rmrks_upd_flg();
		}
		if ($smpl_io_ins_flg.equalsIgnoreCase(name)) {
			return smpl_io_ins_flg();
		}
		if ($smpl_io_upd_flg.equalsIgnoreCase(name)) {
			return smpl_io_upd_flg();
		}
		if ($smpl_io_del_flg.equalsIgnoreCase(name)) {
			return smpl_io_del_flg();
		}
		if ($xfr_pack_rtn_flg.equalsIgnoreCase(name)) {
			return xfr_pack_rtn_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			rmrks_upd_flg(value);
			return;
		}
		if ($smpl_io_ins_flg.equalsIgnoreCase(name)) {
			smpl_io_ins_flg(value);
			return;
		}
		if ($smpl_io_upd_flg.equalsIgnoreCase(name)) {
			smpl_io_upd_flg(value);
			return;
		}
		if ($smpl_io_del_flg.equalsIgnoreCase(name)) {
			smpl_io_del_flg(value);
			return;
		}
		if ($xfr_pack_rtn_flg.equalsIgnoreCase(name)) {
			xfr_pack_rtn_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($db_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($db_pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			db_pack_xfr_base_unit_qty(value);
			return;
		}
		if ($db_so_qty.equalsIgnoreCase(name)) {
			db_so_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			rmrks_upd_flg(value);
			return;
		}
		if ($smpl_io_ins_flg.equalsIgnoreCase(name)) {
			smpl_io_ins_flg(value);
			return;
		}
		if ($smpl_io_upd_flg.equalsIgnoreCase(name)) {
			smpl_io_upd_flg(value);
			return;
		}
		if ($smpl_io_del_flg.equalsIgnoreCase(name)) {
			smpl_io_del_flg(value);
			return;
		}
		if ($xfr_pack_rtn_flg.equalsIgnoreCase(name)) {
			xfr_pack_rtn_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($insp_smpl_act.equalsIgnoreCase(name)) {
			return insp_smpl_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($insp_smpl_act.equalsIgnoreCase(name)) {
			insp_smpl_act(
				((MCContainerMeta) insp_smpl_act_META).castInnerRow(mcframe.serverMS.dbc.MST_INSP_SMPL_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public String insp_smpl_act_no() {
		return insp_smpl_act().insp_smpl_act_no();
	}

	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public void insp_smpl_act_no(String value) {
		insp_smpl_act().insp_smpl_act_no(value);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return insp_smpl_act().insp_schd_no();
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		insp_smpl_act().insp_schd_no(value);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return insp_smpl_act().insp_act_no();
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		insp_smpl_act().insp_act_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return insp_smpl_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		insp_smpl_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return insp_smpl_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		insp_smpl_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return insp_smpl_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		insp_smpl_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return insp_smpl_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		insp_smpl_act().itm_sub3(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public MCNumber so_qty() {
		return insp_smpl_act().so_qty();
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		insp_smpl_act().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(int value) {
		insp_smpl_act().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(long value) {
		insp_smpl_act().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(float value) {
		insp_smpl_act().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(double value) {
		insp_smpl_act().so_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return insp_smpl_act().smpl_qty();
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		insp_smpl_act().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(int value) {
		insp_smpl_act().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(long value) {
		insp_smpl_act().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(float value) {
		insp_smpl_act().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(double value) {
		insp_smpl_act().smpl_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return insp_smpl_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		insp_smpl_act().base_unit_cd(value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_qty() {
		return insp_smpl_act().pack_xfr_pack_unit_qty();
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(MCNumber value) {
		insp_smpl_act().pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(int value) {
		insp_smpl_act().pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(long value) {
		insp_smpl_act().pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(float value) {
		insp_smpl_act().pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(double value) {
		insp_smpl_act().pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return insp_smpl_act().pack_xfr_pack_unit_cd();
	}

	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		insp_smpl_act().pack_xfr_pack_unit_cd(value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_qty() {
		return insp_smpl_act().pack_xfr_base_unit_qty();
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(MCNumber value) {
		insp_smpl_act().pack_xfr_base_unit_qty(value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(int value) {
		insp_smpl_act().pack_xfr_base_unit_qty(value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(long value) {
		insp_smpl_act().pack_xfr_base_unit_qty(value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(float value) {
		insp_smpl_act().pack_xfr_base_unit_qty(value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(double value) {
		insp_smpl_act().pack_xfr_base_unit_qty(value);
	}

	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return insp_smpl_act().pack_xfr_base_unit_cd();
	}

	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		insp_smpl_act().pack_xfr_base_unit_cd(value);
	}

	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return insp_smpl_act().loc_cd();
	}

	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		insp_smpl_act().loc_cd(value);
	}

	/**
	 * Sampling rack/line cd. 抜取元棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return insp_smpl_act().str_ln_cd();
	}

	/**
	 * Sampling rack/line cd. 抜取元棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		insp_smpl_act().str_ln_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return insp_smpl_act().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		insp_smpl_act().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return insp_smpl_act().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		insp_smpl_act().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return insp_smpl_act().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		insp_smpl_act().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return insp_smpl_act().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		insp_smpl_act().stk_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return insp_smpl_act().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		insp_smpl_act().gd_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return insp_smpl_act().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		insp_smpl_act().stk_arrv_bp_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return insp_smpl_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		insp_smpl_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return insp_smpl_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		insp_smpl_act().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return insp_smpl_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		insp_smpl_act().sno1(value);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return insp_smpl_act().sno1_mng_typ();
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		insp_smpl_act().sno1_mng_typ(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return insp_smpl_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		insp_smpl_act().sno2(value);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return insp_smpl_act().sno2_mng_typ();
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		insp_smpl_act().sno2_mng_typ(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return insp_smpl_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		insp_smpl_act().sno3(value);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return insp_smpl_act().sno3_mng_typ();
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		insp_smpl_act().sno3_mng_typ(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return insp_smpl_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		insp_smpl_act().sno4(value);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return insp_smpl_act().sno4_mng_typ();
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		insp_smpl_act().sno4_mng_typ(value);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return insp_smpl_act().fix_no_typ();
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		insp_smpl_act().fix_no_typ(value);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return insp_smpl_act().fix_no();
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		insp_smpl_act().fix_no(value);
	}

	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return insp_smpl_act().ac_dt();
	}

	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		insp_smpl_act().ac_dt(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return insp_smpl_act().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		insp_smpl_act().bd_dpt_cd(value);
	}

	/**
	 * Deduction completion flg. 引落完了ＦＬＧ.<p>
	 *
	 */
	public boolean so_cmpl_flg() {
		return insp_smpl_act().so_cmpl_flg();
	}

	/**
	 * Deduction completion flg. 引落完了ＦＬＧ.<p>
	 *
	 */
	public void so_cmpl_flg(boolean value) {
		insp_smpl_act().so_cmpl_flg(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return insp_smpl_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		insp_smpl_act().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return insp_smpl_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		insp_smpl_act().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return insp_smpl_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		insp_smpl_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return insp_smpl_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		insp_smpl_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return insp_smpl_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		insp_smpl_act().sub_char3(value);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return insp_smpl_act().lims_flg();
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		insp_smpl_act().lims_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return insp_smpl_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		insp_smpl_act().ext_sys_cd(value);
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return insp_smpl_act().ext_insp_smpl_act_no();
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		insp_smpl_act().ext_insp_smpl_act_no(value);
	}

}

