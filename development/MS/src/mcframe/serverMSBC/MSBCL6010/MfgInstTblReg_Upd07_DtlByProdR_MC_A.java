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
 * ブロック"MfgInstTblReg_Upd07_DtlByProd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd07_DtlByProdR_MC_A extends MCConstRow {

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
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $disp_seq_upd_flg = "disp_seq_upd_flg";
	/**
	 * Identification tag issued flg. 現品票発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
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
	public static final String $not_header_inst_abort_flg = "not_header_inst_abort_flg";
	/**
	 * Spare 1 (Remaining output result) 予備１（出来高実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char1 = "rem_sub_char1";
	/**
	 * Spare 2 (Remaining output result) 予備２（出来高実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char2 = "rem_sub_char2";
	/**
	 * Spare 3 (Remaining output result) 予備３（出来高実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char3 = "rem_sub_char3";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	public static final String $yield_schd = "yield_schd";

	public static final String $yield_schd_no = $yield_schd + ".yield_schd_no";
	public static final String $mfg_inst_no = $yield_schd + ".mfg_inst_no";
	public static final String $itm_mfg_inst_no = $yield_schd + ".itm_mfg_inst_no";
	public static final String $oper_inst_no = $yield_schd + ".oper_inst_no";
	public static final String $io_schd_pr_no = $yield_schd + ".io_schd_pr_no";
	public static final String $yield_typ = $yield_schd + ".yield_typ";
	public static final String $schd_tm = $yield_schd + ".schd_tm";
	public static final String $itm_cd = $yield_schd + ".itm_cd";
	public static final String $itm_sub1 = $yield_schd + ".itm_sub1";
	public static final String $itm_sub2 = $yield_schd + ".itm_sub2";
	public static final String $itm_sub3 = $yield_schd + ".itm_sub3";
	public static final String $trd_unit_yield_qty = $yield_schd + ".trd_unit_yield_qty";
	public static final String $trd_unit_cd = $yield_schd + ".trd_unit_cd";
	public static final String $base_unit_yield_qty = $yield_schd + ".base_unit_yield_qty";
	public static final String $base_unit_cd = $yield_schd + ".base_unit_cd";
	public static final String $lot_no = $yield_schd + ".lot_no";
	public static final String $sublot_no = $yield_schd + ".sublot_no";
	public static final String $sno1 = $yield_schd + ".sno1";
	public static final String $sno2 = $yield_schd + ".sno2";
	public static final String $sno3 = $yield_schd + ".sno3";
	public static final String $sno4 = $yield_schd + ".sno4";
	public static final String $strg_loc_cd = $yield_schd + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $yield_schd + ".strg_str_ln_cd";
	public static final String $bkf_typ = $yield_schd + ".bkf_typ";
	public static final String $par_inst_qty = $yield_schd + ".par_inst_qty";
	public static final String $chd_inpt_qty = $yield_schd + ".chd_inpt_qty";
	public static final String $chd_rqmt_qty = $yield_schd + ".chd_rqmt_qty";
	public static final String $fxd_chd_rqmt_qty = $yield_schd + ".fxd_chd_rqmt_qty";
	public static final String $can_flg = $yield_schd + ".can_flg";
	public static final String $disp_seq = $yield_schd + ".disp_seq";
	public static final String $intr_rmrks = $yield_schd + ".intr_rmrks";
	public static final String $inst_rpt_rmrks = $yield_schd + ".inst_rpt_rmrks";
	public static final String $sub_char1 = $yield_schd + ".sub_char1";
	public static final String $sub_char2 = $yield_schd + ".sub_char2";
	public static final String $sub_char3 = $yield_schd + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta hdr_mfg_sts_typ_META = createCommonMeta($hdr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta disp_seq_upd_flg_META = createCommonMeta($disp_seq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_header_inst_abort_flg_META = createCommonMeta($not_header_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_sub_char1_META = createCommonMeta($rem_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR1);
	public static final MCMeta rem_sub_char2_META = createCommonMeta($rem_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR2);
	public static final MCMeta rem_sub_char3_META = createCommonMeta($rem_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR3);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta yield_schd_META = createInnerRowMeta($yield_schd, mcframe.serverMS.dbc.MST_YIELD_SCHD_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd07_DtlByProdR> constMetas = new ConstMetaList<MfgInstTblReg_Upd07_DtlByProdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			mfg_mtd_typ_META,
			hdr_mfg_sts_typ_META,
			mfg_sts_typ_META,
			old_mfg_sts_typ_META,
			mfg_inst_unit_typ_META,
			disp_seq_upd_flg_META,
			stk_lst_prnt_flg_META,
			mfg_loc_cd_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META,
			not_header_inst_abort_flg_META,
			rem_sub_char1_META,
			rem_sub_char2_META,
			rem_sub_char3_META,
			itm_ord_no_META,
			yield_schd_META
		},
		new String[][]{
			{
				"yield_schd_no",
				"mfg_inst_no",
				"itm_mfg_inst_no",
				"oper_inst_no",
				"io_schd_pr_no",
				"yield_typ",
				"schd_tm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"trd_unit_yield_qty",
				"trd_unit_cd",
				"base_unit_yield_qty",
				"base_unit_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"bkf_typ",
				"par_inst_qty",
				"chd_inpt_qty",
				"chd_rqmt_qty",
				"fxd_chd_rqmt_qty",
				"can_flg",
				"disp_seq",
				"intr_rmrks",
				"inst_rpt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$yield_schd_no,
				$mfg_inst_no,
				$itm_mfg_inst_no,
				$oper_inst_no,
				$io_schd_pr_no,
				$yield_typ,
				$schd_tm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$trd_unit_yield_qty,
				$trd_unit_cd,
				$base_unit_yield_qty,
				$base_unit_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$bkf_typ,
				$par_inst_qty,
				$chd_inpt_qty,
				$chd_rqmt_qty,
				$fxd_chd_rqmt_qty,
				$can_flg,
				$disp_seq,
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
	protected MfgInstTblReg_Upd07_DtlByProdR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd07_DtlByProdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd07_DtlByProdR clone() {
		return (MfgInstTblReg_Upd07_DtlByProdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd07_DtlByProdR createInstance() {
		return (MfgInstTblReg_Upd07_DtlByProdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd07_DtlByProdR getValues(String... names) {
		return (MfgInstTblReg_Upd07_DtlByProdR) super.getValues(names);
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
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 6, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 6, $old_mfg_sts_typ, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 7, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 7, $mfg_inst_unit_typ, value);
	}


	/**
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public boolean disp_seq_upd_flg() {
		return getConstBoolean(offset + 8, $disp_seq_upd_flg);
	}

	/**
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public void disp_seq_upd_flg(boolean value) {
		setConstBoolean(offset + 8, $disp_seq_upd_flg, value);
	}


	/**
	 * Identification tag issued flg. 現品票発行済ＦＬＧ.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 9, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued flg. 現品票発行済ＦＬＧ.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 9, $stk_lst_prnt_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 10, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 10, $mfg_loc_cd, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 11, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 11, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 12, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 12, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 13, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 13, $not_frst_inst_can_flg, value);
	}


	public boolean not_header_inst_abort_flg() {
		return getConstBoolean(offset + 14, $not_header_inst_abort_flg);
	}

	public void not_header_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 14, $not_header_inst_abort_flg, value);
	}


	/**
	 * Spare 1 (Remaining output result) 予備１（出来高実績残）.<p>
	 *
	 */
	public String rem_sub_char1() {
		return getConstString(offset + 15, $rem_sub_char1);
	}

	/**
	 * Spare 1 (Remaining output result) 予備１（出来高実績残）.<p>
	 *
	 */
	public void rem_sub_char1(String value) {
		setConstString(offset + 15, $rem_sub_char1, value);
	}


	/**
	 * Spare 2 (Remaining output result) 予備２（出来高実績残）.<p>
	 *
	 */
	public String rem_sub_char2() {
		return getConstString(offset + 16, $rem_sub_char2);
	}

	/**
	 * Spare 2 (Remaining output result) 予備２（出来高実績残）.<p>
	 *
	 */
	public void rem_sub_char2(String value) {
		setConstString(offset + 16, $rem_sub_char2, value);
	}


	/**
	 * Spare 3 (Remaining output result) 予備３（出来高実績残）.<p>
	 *
	 */
	public String rem_sub_char3() {
		return getConstString(offset + 17, $rem_sub_char3);
	}

	/**
	 * Spare 3 (Remaining output result) 予備３（出来高実績残）.<p>
	 *
	 */
	public void rem_sub_char3(String value) {
		setConstString(offset + 17, $rem_sub_char3, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 18, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 18, $itm_ord_no, value);
	}


	public mcframe.serverMS.dbc.MST_YIELD_SCHD_R yield_schd(){
		return (mcframe.serverMS.dbc.MST_YIELD_SCHD_R) getConstInnerRow(offset + 19, $yield_schd);
	}
	
	public void yield_schd(mcframe.serverMS.dbc.MST_YIELD_SCHD_R row){
		setConstInnerRow(offset + 19, $yield_schd, row);
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
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
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
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
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
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
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
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
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
		if ($yield_schd.equalsIgnoreCase(name)) {
			return yield_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($yield_schd.equalsIgnoreCase(name)) {
			yield_schd(
				((MCContainerMeta) yield_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_YIELD_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return yield_schd().yield_schd_no();
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		yield_schd().yield_schd_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return yield_schd().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		yield_schd().mfg_inst_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return yield_schd().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		yield_schd().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return yield_schd().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		yield_schd().oper_inst_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return yield_schd().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		yield_schd().io_schd_pr_no(value);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return yield_schd().yield_typ();
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		yield_schd().yield_typ(value);
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return yield_schd().schd_tm();
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		yield_schd().schd_tm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return yield_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		yield_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return yield_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		yield_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return yield_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		yield_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return yield_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		yield_schd().itm_sub3(value);
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return yield_schd().trd_unit_yield_qty();
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		yield_schd().trd_unit_yield_qty(value);
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		yield_schd().trd_unit_yield_qty(value);
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		yield_schd().trd_unit_yield_qty(value);
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		yield_schd().trd_unit_yield_qty(value);
	}

	/**
	 * Transaction unit scheduled output qty. 取引単位出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		yield_schd().trd_unit_yield_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return yield_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		yield_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return yield_schd().base_unit_yield_qty();
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		yield_schd().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		yield_schd().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		yield_schd().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		yield_schd().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		yield_schd().base_unit_yield_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return yield_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		yield_schd().base_unit_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return yield_schd().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		yield_schd().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return yield_schd().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		yield_schd().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return yield_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		yield_schd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return yield_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		yield_schd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return yield_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		yield_schd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return yield_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		yield_schd().sno4(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return yield_schd().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		yield_schd().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return yield_schd().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		yield_schd().strg_str_ln_cd(value);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return yield_schd().bkf_typ();
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		yield_schd().bkf_typ(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return yield_schd().par_inst_qty();
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		yield_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		yield_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		yield_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		yield_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		yield_schd().par_inst_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return yield_schd().chd_inpt_qty();
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		yield_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		yield_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		yield_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		yield_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		yield_schd().chd_inpt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return yield_schd().chd_rqmt_qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		yield_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		yield_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		yield_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		yield_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		yield_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return yield_schd().fxd_chd_rqmt_qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		yield_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		yield_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		yield_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		yield_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		yield_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return yield_schd().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		yield_schd().can_flg(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return yield_schd().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		yield_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		yield_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		yield_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		yield_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		yield_schd().disp_seq(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return yield_schd().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		yield_schd().intr_rmrks(value);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return yield_schd().inst_rpt_rmrks();
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		yield_schd().inst_rpt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return yield_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		yield_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return yield_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		yield_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return yield_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		yield_schd().sub_char3(value);
	}

}

