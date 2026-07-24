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
 * ブロック"MfgInstTblReg_Upd06_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd06_DtlWkR_MC_A extends MCConstRow {

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
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $disp_seq_upd_flg = "disp_seq_upd_flg";
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
	 * Spare 1 (Remaining man-hour result) 予備１（工数実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char1 = "rem_sub_char1";
	/**
	 * Spare 2 (Remaining man-hour result) 予備２（工数実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char2 = "rem_sub_char2";
	/**
	 * Spare 3 (Remaining man-hour result) 予備３（工数実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char3 = "rem_sub_char3";
	public static final String $wk_schd = "wk_schd";

	public static final String $wk_schd_no = $wk_schd + ".wk_schd_no";
	public static final String $mfg_inst_no = $wk_schd + ".mfg_inst_no";
	public static final String $itm_mfg_inst_no = $wk_schd + ".itm_mfg_inst_no";
	public static final String $oper_inst_no = $wk_schd + ".oper_inst_no";
	public static final String $wk_cost_cd = $wk_schd + ".wk_cost_cd";
	public static final String $wk_cost_calc_flg = $wk_schd + ".wk_cost_calc_flg";
	public static final String $fxd_wk_cost = $wk_schd + ".fxd_wk_cost";
	public static final String $wk_cost = $wk_schd + ".wk_cost";
	public static final String $mst_fxd_wk_cost = $wk_schd + ".mst_fxd_wk_cost";
	public static final String $mst_wk_cost = $wk_schd + ".mst_wk_cost";
	public static final String $disp_seq = $wk_schd + ".disp_seq";
	public static final String $can_flg = $wk_schd + ".can_flg";
	public static final String $intr_rmrks = $wk_schd + ".intr_rmrks";
	public static final String $sub_char1 = $wk_schd + ".sub_char1";
	public static final String $sub_char2 = $wk_schd + ".sub_char2";
	public static final String $sub_char3 = $wk_schd + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta hdr_mfg_sts_typ_META = createCommonMeta($hdr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta disp_seq_upd_flg_META = createCommonMeta($disp_seq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta not_header_inst_abort_flg_META = createCommonMeta($not_header_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_sub_char1_META = createCommonMeta($rem_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR1);
	public static final MCMeta rem_sub_char2_META = createCommonMeta($rem_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR2);
	public static final MCMeta rem_sub_char3_META = createCommonMeta($rem_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR3);
	public static final MCMeta wk_schd_META = createInnerRowMeta($wk_schd, mcframe.serverMS.dbc.MST_WK_SCHD_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd06_DtlWkR> constMetas = new ConstMetaList<MfgInstTblReg_Upd06_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			mfg_mtd_typ_META,
			hdr_mfg_sts_typ_META,
			mfg_sts_typ_META,
			disp_seq_upd_flg_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META,
			mfg_inst_unit_typ_META,
			not_header_inst_abort_flg_META,
			rem_sub_char1_META,
			rem_sub_char2_META,
			rem_sub_char3_META,
			wk_schd_META
		},
		new String[][]{
			{
				"wk_schd_no",
				"mfg_inst_no",
				"itm_mfg_inst_no",
				"oper_inst_no",
				"wk_cost_cd",
				"wk_cost_calc_flg",
				"fxd_wk_cost",
				"wk_cost",
				"mst_fxd_wk_cost",
				"mst_wk_cost",
				"disp_seq",
				"can_flg",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$wk_schd_no,
				$mfg_inst_no,
				$itm_mfg_inst_no,
				$oper_inst_no,
				$wk_cost_cd,
				$wk_cost_calc_flg,
				$fxd_wk_cost,
				$wk_cost,
				$mst_fxd_wk_cost,
				$mst_wk_cost,
				$disp_seq,
				$can_flg,
				$intr_rmrks,
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
	protected MfgInstTblReg_Upd06_DtlWkR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd06_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd06_DtlWkR clone() {
		return (MfgInstTblReg_Upd06_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd06_DtlWkR createInstance() {
		return (MfgInstTblReg_Upd06_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd06_DtlWkR getValues(String... names) {
		return (MfgInstTblReg_Upd06_DtlWkR) super.getValues(names);
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
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public boolean disp_seq_upd_flg() {
		return getConstBoolean(offset + 6, $disp_seq_upd_flg);
	}

	/**
	 * Update display order only flg. 表示順のみ更新ＦＬＧ.<p>
	 *
	 */
	public void disp_seq_upd_flg(boolean value) {
		setConstBoolean(offset + 6, $disp_seq_upd_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 7, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 7, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 8, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 8, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 9, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 9, $not_frst_inst_can_flg, value);
	}


	public String mfg_inst_unit_typ() {
		return getConstString(offset + 10, $mfg_inst_unit_typ);
	}

	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 10, $mfg_inst_unit_typ, value);
	}


	public boolean not_header_inst_abort_flg() {
		return getConstBoolean(offset + 11, $not_header_inst_abort_flg);
	}

	public void not_header_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 11, $not_header_inst_abort_flg, value);
	}


	/**
	 * Spare 1 (Remaining man-hour result) 予備１（工数実績残）.<p>
	 *
	 */
	public String rem_sub_char1() {
		return getConstString(offset + 12, $rem_sub_char1);
	}

	/**
	 * Spare 1 (Remaining man-hour result) 予備１（工数実績残）.<p>
	 *
	 */
	public void rem_sub_char1(String value) {
		setConstString(offset + 12, $rem_sub_char1, value);
	}


	/**
	 * Spare 2 (Remaining man-hour result) 予備２（工数実績残）.<p>
	 *
	 */
	public String rem_sub_char2() {
		return getConstString(offset + 13, $rem_sub_char2);
	}

	/**
	 * Spare 2 (Remaining man-hour result) 予備２（工数実績残）.<p>
	 *
	 */
	public void rem_sub_char2(String value) {
		setConstString(offset + 13, $rem_sub_char2, value);
	}


	/**
	 * Spare 3 (Remaining man-hour result) 予備３（工数実績残）.<p>
	 *
	 */
	public String rem_sub_char3() {
		return getConstString(offset + 14, $rem_sub_char3);
	}

	/**
	 * Spare 3 (Remaining man-hour result) 予備３（工数実績残）.<p>
	 *
	 */
	public void rem_sub_char3(String value) {
		setConstString(offset + 14, $rem_sub_char3, value);
	}


	public mcframe.serverMS.dbc.MST_WK_SCHD_R wk_schd(){
		return (mcframe.serverMS.dbc.MST_WK_SCHD_R) getConstInnerRow(offset + 15, $wk_schd);
	}
	
	public void wk_schd(mcframe.serverMS.dbc.MST_WK_SCHD_R row){
		setConstInnerRow(offset + 15, $wk_schd, row);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
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
		if ($wk_schd.equalsIgnoreCase(name)) {
			return wk_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wk_schd.equalsIgnoreCase(name)) {
			wk_schd(
				((MCContainerMeta) wk_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_WK_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return wk_schd().wk_schd_no();
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		wk_schd().wk_schd_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return wk_schd().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		wk_schd().mfg_inst_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return wk_schd().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		wk_schd().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return wk_schd().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		wk_schd().oper_inst_no(value);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return wk_schd().wk_cost_cd();
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		wk_schd().wk_cost_cd(value);
	}

	/**
	 * Auto man-hour calculation flg. 自動工数計算ＦＬＧ.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return wk_schd().wk_cost_calc_flg();
	}

	/**
	 * Auto man-hour calculation flg. 自動工数計算ＦＬＧ.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		wk_schd().wk_cost_calc_flg(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return wk_schd().fxd_wk_cost();
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		wk_schd().fxd_wk_cost(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		wk_schd().fxd_wk_cost(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		wk_schd().fxd_wk_cost(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		wk_schd().fxd_wk_cost(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		wk_schd().fxd_wk_cost(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return wk_schd().wk_cost();
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		wk_schd().wk_cost(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(int value) {
		wk_schd().wk_cost(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(long value) {
		wk_schd().wk_cost(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(float value) {
		wk_schd().wk_cost(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(double value) {
		wk_schd().wk_cost(value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public MCNumber mst_fxd_wk_cost() {
		return wk_schd().mst_fxd_wk_cost();
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(MCNumber value) {
		wk_schd().mst_fxd_wk_cost(value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(int value) {
		wk_schd().mst_fxd_wk_cost(value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(long value) {
		wk_schd().mst_fxd_wk_cost(value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(float value) {
		wk_schd().mst_fxd_wk_cost(value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(double value) {
		wk_schd().mst_fxd_wk_cost(value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public MCNumber mst_wk_cost() {
		return wk_schd().mst_wk_cost();
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(MCNumber value) {
		wk_schd().mst_wk_cost(value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(int value) {
		wk_schd().mst_wk_cost(value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(long value) {
		wk_schd().mst_wk_cost(value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(float value) {
		wk_schd().mst_wk_cost(value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(double value) {
		wk_schd().mst_wk_cost(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return wk_schd().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		wk_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		wk_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		wk_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		wk_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		wk_schd().disp_seq(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return wk_schd().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		wk_schd().can_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return wk_schd().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		wk_schd().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return wk_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		wk_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return wk_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		wk_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return wk_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		wk_schd().sub_char3(value);
	}

}

