package mcframe.serverMSBC.MSBCL6010;

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
 * ブロック"MfgInstTblReg_Upd03_DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd03_DtlOperR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public static final String $hdr_mfg_sts_typ = "hdr_mfg_sts_typ";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	public static final String $not_header_inst_abort_flg = "not_header_inst_abort_flg";
	/**
	 * Spare 1 (Remaining operation result) 予備１（工程実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char1 = "rem_sub_char1";
	/**
	 * Spare 2 (Remaining operation result) 予備２（工程実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char2 = "rem_sub_char2";
	/**
	 * Spare 3 (Remaining operation result) 予備３（工程実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char3 = "rem_sub_char3";
	public static final String $oper_inst = "oper_inst";

	public static final String $oper_inst_no = $oper_inst + ".oper_inst_no";
	public static final String $mfg_inst_no = $oper_inst + ".mfg_inst_no";
	public static final String $itm_mfg_inst_no = $oper_inst + ".itm_mfg_inst_no";
	public static final String $oper_ord_no = $oper_inst + ".oper_ord_no";
	public static final String $disp_seq = $oper_inst + ".disp_seq";
	public static final String $oper_cd = $oper_inst + ".oper_cd";
	public static final String $oper_seq = $oper_inst + ".oper_seq";
	public static final String $st_schd_tm = $oper_inst + ".st_schd_tm";
	public static final String $end_schd_tm = $oper_inst + ".end_schd_tm";
	public static final String $oper_loc_cd = $oper_inst + ".oper_loc_cd";
	public static final String $oper_str_ln_cd = $oper_inst + ".oper_str_ln_cd";
	public static final String $base_unit_qty = $oper_inst + ".base_unit_qty";
	public static final String $base_unit_cd = $oper_inst + ".base_unit_cd";
	public static final String $oper_std_qty = $oper_inst + ".oper_std_qty";
	public static final String $oper_conv_qty = $oper_inst + ".oper_conv_qty";
	public static final String $oper_unit_cd = $oper_inst + ".oper_unit_cd";
	public static final String $oper_unit_conv_rnd_typ = $oper_inst + ".oper_unit_conv_rnd_typ";
	public static final String $oper_unit_dec_place = $oper_inst + ".oper_unit_dec_place";
	public static final String $unschd_inst_flg = $oper_inst + ".unschd_inst_flg";
	public static final String $unschd_act_flg = $oper_inst + ".unschd_act_flg";
	public static final String $bkf_flg = $oper_inst + ".bkf_flg";
	public static final String $wk_cost_calc_flg = $oper_inst + ".wk_cost_calc_flg";
	public static final String $oper_inst_grp = $oper_inst + ".oper_inst_grp";
	public static final String $usr_cd = $oper_inst + ".usr_cd";
	public static final String $oper_lt = $oper_inst + ".oper_lt";
	public static final String $oper_lt_add_qty = $oper_inst + ".oper_lt_add_qty";
	public static final String $oper_offst_typ = $oper_inst + ".oper_offst_typ";
	public static final String $oper_offst = $oper_inst + ".oper_offst";
	public static final String $lmt_fr_dt_flg = $oper_inst + ".lmt_fr_dt_flg";
	public static final String $oper_offst_add_qty = $oper_inst + ".oper_offst_add_qty";
	public static final String $oper_lower_yield = $oper_inst + ".oper_lower_yield";
	public static final String $oper_std_yield = $oper_inst + ".oper_std_yield";
	public static final String $oper_upper_yield = $oper_inst + ".oper_upper_yield";
	public static final String $wip_rate = $oper_inst + ".wip_rate";
	public static final String $yield_oper_flg = $oper_inst + ".yield_oper_flg";
	public static final String $yield_oper_ratio = $oper_inst + ".yield_oper_ratio";
	public static final String $can_flg = $oper_inst + ".can_flg";
	public static final String $oper_abort_flg = $oper_inst + ".oper_abort_flg";
	public static final String $mes_flg = $oper_inst + ".mes_flg";
	public static final String $oper_rsrc = $oper_inst + ".oper_rsrc";
	public static final String $intr_rmrks = $oper_inst + ".intr_rmrks";
	public static final String $inst_rpt_rmrks = $oper_inst + ".inst_rpt_rmrks";
	public static final String $sub_char1 = $oper_inst + ".sub_char1";
	public static final String $sub_char2 = $oper_inst + ".sub_char2";
	public static final String $sub_char3 = $oper_inst + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta hdr_mfg_sts_typ_META = createCommonMeta($hdr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta not_header_inst_abort_flg_META = createCommonMeta($not_header_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_sub_char1_META = createCommonMeta($rem_sub_char1, mcframe.commonMS.meta.MS_META.OPER_ACT_REM_SUB_CHAR1);
	public static final MCMeta rem_sub_char2_META = createCommonMeta($rem_sub_char2, mcframe.commonMS.meta.MS_META.OPER_ACT_REM_SUB_CHAR2);
	public static final MCMeta rem_sub_char3_META = createCommonMeta($rem_sub_char3, mcframe.commonMS.meta.MS_META.OPER_ACT_REM_SUB_CHAR3);
	public static final MCMeta oper_inst_META = createInnerRowMeta($oper_inst, mcframe.serverMS.dbc.MST_OPER_INST_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd03_DtlOperR> constMetas = new ConstMetaList<MfgInstTblReg_Upd03_DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			mfg_mtd_typ_META,
			hdr_mfg_sts_typ_META,
			mfg_sts_typ_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META,
			mfg_inst_unit_typ_META,
			not_header_inst_abort_flg_META,
			rem_sub_char1_META,
			rem_sub_char2_META,
			rem_sub_char3_META,
			oper_inst_META
		},
		new String[][]{
			{
				"oper_inst_no",
				"mfg_inst_no",
				"itm_mfg_inst_no",
				"oper_ord_no",
				"disp_seq",
				"oper_cd",
				"oper_seq",
				"st_schd_tm",
				"end_schd_tm",
				"oper_loc_cd",
				"oper_str_ln_cd",
				"base_unit_qty",
				"base_unit_cd",
				"oper_std_qty",
				"oper_conv_qty",
				"oper_unit_cd",
				"oper_unit_conv_rnd_typ",
				"oper_unit_dec_place",
				"unschd_inst_flg",
				"unschd_act_flg",
				"bkf_flg",
				"wk_cost_calc_flg",
				"oper_inst_grp",
				"usr_cd",
				"oper_lt",
				"oper_lt_add_qty",
				"oper_offst_typ",
				"oper_offst",
				"lmt_fr_dt_flg",
				"oper_offst_add_qty",
				"oper_lower_yield",
				"oper_std_yield",
				"oper_upper_yield",
				"wip_rate",
				"yield_oper_flg",
				"yield_oper_ratio",
				"can_flg",
				"oper_abort_flg",
				"mes_flg",
				"oper_rsrc",
				"intr_rmrks",
				"inst_rpt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$oper_inst_no,
				$mfg_inst_no,
				$itm_mfg_inst_no,
				$oper_ord_no,
				$disp_seq,
				$oper_cd,
				$oper_seq,
				$st_schd_tm,
				$end_schd_tm,
				$oper_loc_cd,
				$oper_str_ln_cd,
				$base_unit_qty,
				$base_unit_cd,
				$oper_std_qty,
				$oper_conv_qty,
				$oper_unit_cd,
				$oper_unit_conv_rnd_typ,
				$oper_unit_dec_place,
				$unschd_inst_flg,
				$unschd_act_flg,
				$bkf_flg,
				$wk_cost_calc_flg,
				$oper_inst_grp,
				$usr_cd,
				$oper_lt,
				$oper_lt_add_qty,
				$oper_offst_typ,
				$oper_offst,
				$lmt_fr_dt_flg,
				$oper_offst_add_qty,
				$oper_lower_yield,
				$oper_std_yield,
				$oper_upper_yield,
				$wip_rate,
				$yield_oper_flg,
				$yield_oper_ratio,
				$can_flg,
				$oper_abort_flg,
				$mes_flg,
				$oper_rsrc,
				$intr_rmrks,
				$inst_rpt_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected MfgInstTblReg_Upd03_DtlOperR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd03_DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd03_DtlOperR clone() {
		return (MfgInstTblReg_Upd03_DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd03_DtlOperR createInstance() {
		return (MfgInstTblReg_Upd03_DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd03_DtlOperR getValues(String... names) {
		return (MfgInstTblReg_Upd03_DtlOperR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
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
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 3, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 3, $mfg_mtd_typ, value);
	}


	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public String hdr_mfg_sts_typ() {
		return getConstString(offset + 4, $hdr_mfg_sts_typ);
	}

	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public void hdr_mfg_sts_typ(String value) {
		setConstString(offset + 4, $hdr_mfg_sts_typ, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 5, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 5, $mfg_sts_typ, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 6, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 6, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 7, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 7, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 8, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 8, $not_frst_inst_can_flg, value);
	}


	public String mfg_inst_unit_typ() {
		return getConstString(offset + 9, $mfg_inst_unit_typ);
	}

	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 9, $mfg_inst_unit_typ, value);
	}


	public boolean not_header_inst_abort_flg() {
		return getConstBoolean(offset + 10, $not_header_inst_abort_flg);
	}

	public void not_header_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 10, $not_header_inst_abort_flg, value);
	}


	/**
	 * Spare 1 (Remaining operation result) 予備１（工程実績残）.<p>
	 *
	 */
	public String rem_sub_char1() {
		return getConstString(offset + 11, $rem_sub_char1);
	}

	/**
	 * Spare 1 (Remaining operation result) 予備１（工程実績残）.<p>
	 *
	 */
	public void rem_sub_char1(String value) {
		setConstString(offset + 11, $rem_sub_char1, value);
	}


	/**
	 * Spare 2 (Remaining operation result) 予備２（工程実績残）.<p>
	 *
	 */
	public String rem_sub_char2() {
		return getConstString(offset + 12, $rem_sub_char2);
	}

	/**
	 * Spare 2 (Remaining operation result) 予備２（工程実績残）.<p>
	 *
	 */
	public void rem_sub_char2(String value) {
		setConstString(offset + 12, $rem_sub_char2, value);
	}


	/**
	 * Spare 3 (Remaining operation result) 予備３（工程実績残）.<p>
	 *
	 */
	public String rem_sub_char3() {
		return getConstString(offset + 13, $rem_sub_char3);
	}

	/**
	 * Spare 3 (Remaining operation result) 予備３（工程実績残）.<p>
	 *
	 */
	public void rem_sub_char3(String value) {
		setConstString(offset + 13, $rem_sub_char3, value);
	}


	public mcframe.serverMS.dbc.MST_OPER_INST_R oper_inst(){
		return (mcframe.serverMS.dbc.MST_OPER_INST_R) getConstInnerRow(offset + 14, $oper_inst);
	}
	
	public void oper_inst(mcframe.serverMS.dbc.MST_OPER_INST_R row){
		setConstInnerRow(offset + 14, $oper_inst, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			return rem_sub_char1();
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			return rem_sub_char2();
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			return rem_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			return rem_sub_char1();
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			return rem_sub_char2();
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			return rem_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			rem_sub_char1(value);
			return;
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			rem_sub_char2(value);
			return;
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			rem_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			rem_sub_char1(value);
			return;
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			rem_sub_char2(value);
			return;
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			rem_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($oper_inst.equalsIgnoreCase(name)) {
			return oper_inst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($oper_inst.equalsIgnoreCase(name)) {
			oper_inst(
				((MCContainerMeta) oper_inst_META).castInnerRow(mcframe.serverMS.dbc.MST_OPER_INST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return oper_inst().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		oper_inst().oper_inst_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return oper_inst().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		oper_inst().mfg_inst_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return oper_inst().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		oper_inst().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return oper_inst().oper_ord_no();
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		oper_inst().oper_ord_no(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return oper_inst().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		oper_inst().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		oper_inst().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		oper_inst().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		oper_inst().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		oper_inst().disp_seq(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return oper_inst().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		oper_inst().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return oper_inst().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		oper_inst().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		oper_inst().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		oper_inst().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		oper_inst().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		oper_inst().oper_seq(value);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return oper_inst().st_schd_tm();
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		oper_inst().st_schd_tm(value);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return oper_inst().end_schd_tm();
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		oper_inst().end_schd_tm(value);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return oper_inst().oper_loc_cd();
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		oper_inst().oper_loc_cd(value);
	}

	/**
	 * Operation rack/line cd. 工程棚ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return oper_inst().oper_str_ln_cd();
	}

	/**
	 * Operation rack/line cd. 工程棚ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		oper_inst().oper_str_ln_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return oper_inst().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		oper_inst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		oper_inst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		oper_inst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		oper_inst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		oper_inst().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return oper_inst().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		oper_inst().base_unit_cd(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return oper_inst().oper_std_qty();
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		oper_inst().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		oper_inst().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		oper_inst().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		oper_inst().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		oper_inst().oper_std_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return oper_inst().oper_conv_qty();
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		oper_inst().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		oper_inst().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		oper_inst().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		oper_inst().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		oper_inst().oper_conv_qty(value);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return oper_inst().oper_unit_cd();
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		oper_inst().oper_unit_cd(value);
	}

	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return oper_inst().oper_unit_conv_rnd_typ();
	}

	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		oper_inst().oper_unit_conv_rnd_typ(value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return oper_inst().oper_unit_dec_place();
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		oper_inst().oper_unit_dec_place(value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		oper_inst().oper_unit_dec_place(value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		oper_inst().oper_unit_dec_place(value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		oper_inst().oper_unit_dec_place(value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		oper_inst().oper_unit_dec_place(value);
	}

	/**
	 * Unplanned order flg. 計画外指図ＦＬＧ.<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return oper_inst().unschd_inst_flg();
	}

	/**
	 * Unplanned order flg. 計画外指図ＦＬＧ.<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		oper_inst().unschd_inst_flg(value);
	}

	/**
	 * Unplanned result flg. 計画外実績ＦＬＧ.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return oper_inst().unschd_act_flg();
	}

	/**
	 * Unplanned result flg. 計画外実績ＦＬＧ.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		oper_inst().unschd_act_flg(value);
	}

	/**
	 * Allow backflush flg. バックフラッシュ許可ＦＬＧ.<p>
	 *
	 */
	public boolean bkf_flg() {
		return oper_inst().bkf_flg();
	}

	/**
	 * Allow backflush flg. バックフラッシュ許可ＦＬＧ.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		oper_inst().bkf_flg(value);
	}

	/**
	 * Auto man-hour calculation flg. 自動工数計算ＦＬＧ.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return oper_inst().wk_cost_calc_flg();
	}

	/**
	 * Auto man-hour calculation flg. 自動工数計算ＦＬＧ.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		oper_inst().wk_cost_calc_flg(value);
	}

	/**
	 * Operation order Grp. 工程指図ＧＲＰ.<p>
	 *
	 */
	public String oper_inst_grp() {
		return oper_inst().oper_inst_grp();
	}

	/**
	 * Operation order Grp. 工程指図ＧＲＰ.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		oper_inst().oper_inst_grp(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return oper_inst().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		oper_inst().usr_cd(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return oper_inst().oper_lt();
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		oper_inst().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		oper_inst().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		oper_inst().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		oper_inst().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		oper_inst().oper_lt(value);
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return oper_inst().oper_lt_add_qty();
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		oper_inst().oper_lt_add_qty(value);
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		oper_inst().oper_lt_add_qty(value);
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		oper_inst().oper_lt_add_qty(value);
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		oper_inst().oper_lt_add_qty(value);
	}

	/**
	 * Base qty. of adding operation LT 工程ＬＴ加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		oper_inst().oper_lt_add_qty(value);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return oper_inst().oper_offst_typ();
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		oper_inst().oper_offst_typ(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return oper_inst().oper_offst();
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		oper_inst().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		oper_inst().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		oper_inst().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		oper_inst().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		oper_inst().oper_offst(value);
	}

	/**
	 * Base date use operation 起算日使用工程.<p>
	 *
	 */
	public boolean lmt_fr_dt_flg() {
		return oper_inst().lmt_fr_dt_flg();
	}

	/**
	 * Base date use operation 起算日使用工程.<p>
	 *
	 */
	public void lmt_fr_dt_flg(boolean value) {
		oper_inst().lmt_fr_dt_flg(value);
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return oper_inst().oper_offst_add_qty();
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		oper_inst().oper_offst_add_qty(value);
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		oper_inst().oper_offst_add_qty(value);
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		oper_inst().oper_offst_add_qty(value);
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		oper_inst().oper_offst_add_qty(value);
	}

	/**
	 * Base qty. of adding operation offset 工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		oper_inst().oper_offst_add_qty(value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return oper_inst().oper_lower_yield();
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		oper_inst().oper_lower_yield(value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		oper_inst().oper_lower_yield(value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		oper_inst().oper_lower_yield(value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		oper_inst().oper_lower_yield(value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		oper_inst().oper_lower_yield(value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return oper_inst().oper_std_yield();
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		oper_inst().oper_std_yield(value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		oper_inst().oper_std_yield(value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		oper_inst().oper_std_yield(value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		oper_inst().oper_std_yield(value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		oper_inst().oper_std_yield(value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return oper_inst().oper_upper_yield();
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		oper_inst().oper_upper_yield(value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		oper_inst().oper_upper_yield(value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		oper_inst().oper_upper_yield(value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		oper_inst().oper_upper_yield(value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		oper_inst().oper_upper_yield(value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return oper_inst().wip_rate();
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		oper_inst().wip_rate(value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(int value) {
		oper_inst().wip_rate(value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(long value) {
		oper_inst().wip_rate(value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(float value) {
		oper_inst().wip_rate(value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(double value) {
		oper_inst().wip_rate(value);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return oper_inst().yield_oper_flg();
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		oper_inst().yield_oper_flg(value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return oper_inst().yield_oper_ratio();
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		oper_inst().yield_oper_ratio(value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		oper_inst().yield_oper_ratio(value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		oper_inst().yield_oper_ratio(value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		oper_inst().yield_oper_ratio(value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		oper_inst().yield_oper_ratio(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return oper_inst().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		oper_inst().can_flg(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean oper_abort_flg() {
		return oper_inst().oper_abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void oper_abort_flg(boolean value) {
		oper_inst().oper_abort_flg(value);
	}

	/**
	 * MES flg. ＭＥＳＦＬＧ.<p>
	 *
	 */
	public boolean mes_flg() {
		return oper_inst().mes_flg();
	}

	/**
	 * MES flg. ＭＥＳＦＬＧ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		oper_inst().mes_flg(value);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return oper_inst().oper_rsrc();
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		oper_inst().oper_rsrc(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return oper_inst().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		oper_inst().intr_rmrks(value);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return oper_inst().inst_rpt_rmrks();
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		oper_inst().inst_rpt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return oper_inst().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		oper_inst().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return oper_inst().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		oper_inst().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return oper_inst().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		oper_inst().sub_char3(value);
	}

}

