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
 * ブロック"MfgInstTblReg_Upd01_DtlMfg"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd01_DtlMfgR_MC_A extends MCConstRow {

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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
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
	/**
	 * Spare 1 (Remaining mfg. result) 予備１（製造実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char1 = "rem_sub_char1";
	/**
	 * Spare 2 (Remaining mfg. result) 予備２（製造実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char2 = "rem_sub_char2";
	/**
	 * Spare 3 (Remaining mfg. result) 予備３（製造実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char3 = "rem_sub_char3";
	public static final String $mfg_inst = "mfg_inst";

	public static final String $mfg_inst_no = $mfg_inst + ".mfg_inst_no";
	public static final String $mfg_inst_rev = $mfg_inst + ".mfg_inst_rev";
	public static final String $itm_mfg_inst_no = $mfg_inst + ".itm_mfg_inst_no";
	public static final String $po_d_no = $mfg_inst + ".po_d_no";
	public static final String $base_unit_yield_qty = $mfg_inst + ".base_unit_yield_qty";
	public static final String $base_unit_inst_qty = $mfg_inst + ".base_unit_inst_qty";
	public static final String $base_unit_cd = $mfg_inst + ".base_unit_cd";
	public static final String $st_schd_tm = $mfg_inst + ".st_schd_tm";
	public static final String $end_schd_tm = $mfg_inst + ".end_schd_tm";
	public static final String $rqst_dlv_rqst_tm = $mfg_inst + ".rqst_dlv_rqst_tm";
	public static final String $inst_dt = $mfg_inst + ".inst_dt";
	public static final String $inst_prnt_tm = $mfg_inst + ".inst_prnt_tm";
	public static final String $inst_prnt_flg = $mfg_inst + ".inst_prnt_flg";
	public static final String $aprv_flg = $mfg_inst + ".aprv_flg";
	public static final String $mfg_aprv_sts_typ = $mfg_inst + ".mfg_aprv_sts_typ";
	public static final String $aprv_dt = $mfg_inst + ".aprv_dt";
	public static final String $aprv_dpt_cd = $mfg_inst + ".aprv_dpt_cd";
	public static final String $aprv_usr_cd = $mfg_inst + ".aprv_usr_cd";
	public static final String $aprv_tm = $mfg_inst + ".aprv_tm";
	public static final String $aprv_rsn = $mfg_inst + ".aprv_rsn";
	public static final String $mfg_aprv_role_cd = $mfg_inst + ".mfg_aprv_role_cd";
	public static final String $disp_pd = $mfg_inst + ".disp_pd";
	public static final String $inst_dpt_cd = $mfg_inst + ".inst_dpt_cd";
	public static final String $inst_usr_cd = $mfg_inst + ".inst_usr_cd";
	public static final String $can_flg = $mfg_inst + ".can_flg";
	public static final String $abort_flg = $mfg_inst + ".abort_flg";
	public static final String $schd_chg_flg = $mfg_inst + ".schd_chg_flg";
	public static final String $po_locked_flg = $mfg_inst + ".po_locked_flg";
	public static final String $po_auto_reg_flg = $mfg_inst + ".po_auto_reg_flg";
	public static final String $mfg_inst_unit_typ = $mfg_inst + ".mfg_inst_unit_typ";
	public static final String $intr_rmrks = $mfg_inst + ".intr_rmrks";
	public static final String $inst_rpt_rmrks = $mfg_inst + ".inst_rpt_rmrks";
	public static final String $inst_po_cnt_rmrks = $mfg_inst + ".inst_po_cnt_rmrks";
	public static final String $sub_char1 = $mfg_inst + ".sub_char1";
	public static final String $sub_char2 = $mfg_inst + ".sub_char2";
	public static final String $sub_char3 = $mfg_inst + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_sub_char1_META = createCommonMeta($rem_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_REM_SUB_CHAR1);
	public static final MCMeta rem_sub_char2_META = createCommonMeta($rem_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_REM_SUB_CHAR2);
	public static final MCMeta rem_sub_char3_META = createCommonMeta($rem_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_REM_SUB_CHAR3);
	public static final MCMeta mfg_inst_META = createInnerRowMeta($mfg_inst, mcframe.serverMS.dbc.MST_MFG_INST_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd01_DtlMfgR> constMetas = new ConstMetaList<MfgInstTblReg_Upd01_DtlMfgR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			mfg_sts_typ_META,
			mfg_mtd_typ_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META,
			rem_sub_char1_META,
			rem_sub_char2_META,
			rem_sub_char3_META,
			mfg_inst_META
		},
		new String[][]{
			{
				"mfg_inst_no",
				"mfg_inst_rev",
				"itm_mfg_inst_no",
				"po_d_no",
				"base_unit_yield_qty",
				"base_unit_inst_qty",
				"base_unit_cd",
				"st_schd_tm",
				"end_schd_tm",
				"rqst_dlv_rqst_tm",
				"inst_dt",
				"inst_prnt_tm",
				"inst_prnt_flg",
				"aprv_flg",
				"mfg_aprv_sts_typ",
				"aprv_dt",
				"aprv_dpt_cd",
				"aprv_usr_cd",
				"aprv_tm",
				"aprv_rsn",
				"mfg_aprv_role_cd",
				"disp_pd",
				"inst_dpt_cd",
				"inst_usr_cd",
				"can_flg",
				"abort_flg",
				"schd_chg_flg",
				"po_locked_flg",
				"po_auto_reg_flg",
				"mfg_inst_unit_typ",
				"intr_rmrks",
				"inst_rpt_rmrks",
				"inst_po_cnt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$mfg_inst_no,
				$mfg_inst_rev,
				$itm_mfg_inst_no,
				$po_d_no,
				$base_unit_yield_qty,
				$base_unit_inst_qty,
				$base_unit_cd,
				$st_schd_tm,
				$end_schd_tm,
				$rqst_dlv_rqst_tm,
				$inst_dt,
				$inst_prnt_tm,
				$inst_prnt_flg,
				$aprv_flg,
				$mfg_aprv_sts_typ,
				$aprv_dt,
				$aprv_dpt_cd,
				$aprv_usr_cd,
				$aprv_tm,
				$aprv_rsn,
				$mfg_aprv_role_cd,
				$disp_pd,
				$inst_dpt_cd,
				$inst_usr_cd,
				$can_flg,
				$abort_flg,
				$schd_chg_flg,
				$po_locked_flg,
				$po_auto_reg_flg,
				$mfg_inst_unit_typ,
				$intr_rmrks,
				$inst_rpt_rmrks,
				$inst_po_cnt_rmrks,
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
	protected MfgInstTblReg_Upd01_DtlMfgR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd01_DtlMfgR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd01_DtlMfgR clone() {
		return (MfgInstTblReg_Upd01_DtlMfgR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd01_DtlMfgR createInstance() {
		return (MfgInstTblReg_Upd01_DtlMfgR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd01_DtlMfgR getValues(String... names) {
		return (MfgInstTblReg_Upd01_DtlMfgR) super.getValues(names);
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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 2, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 2, $mfg_sts_typ, value);
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
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 4, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 4, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 5, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 5, $not_frst_inst_can_flg, value);
	}


	/**
	 * Spare 1 (Remaining mfg. result) 予備１（製造実績残）.<p>
	 *
	 */
	public String rem_sub_char1() {
		return getConstString(offset + 6, $rem_sub_char1);
	}

	/**
	 * Spare 1 (Remaining mfg. result) 予備１（製造実績残）.<p>
	 *
	 */
	public void rem_sub_char1(String value) {
		setConstString(offset + 6, $rem_sub_char1, value);
	}


	/**
	 * Spare 2 (Remaining mfg. result) 予備２（製造実績残）.<p>
	 *
	 */
	public String rem_sub_char2() {
		return getConstString(offset + 7, $rem_sub_char2);
	}

	/**
	 * Spare 2 (Remaining mfg. result) 予備２（製造実績残）.<p>
	 *
	 */
	public void rem_sub_char2(String value) {
		setConstString(offset + 7, $rem_sub_char2, value);
	}


	/**
	 * Spare 3 (Remaining mfg. result) 予備３（製造実績残）.<p>
	 *
	 */
	public String rem_sub_char3() {
		return getConstString(offset + 8, $rem_sub_char3);
	}

	/**
	 * Spare 3 (Remaining mfg. result) 予備３（製造実績残）.<p>
	 *
	 */
	public void rem_sub_char3(String value) {
		setConstString(offset + 8, $rem_sub_char3, value);
	}


	public mcframe.serverMS.dbc.MST_MFG_INST_R mfg_inst(){
		return (mcframe.serverMS.dbc.MST_MFG_INST_R) getConstInnerRow(offset + 9, $mfg_inst);
	}
	
	public void mfg_inst(mcframe.serverMS.dbc.MST_MFG_INST_R row){
		setConstInnerRow(offset + 9, $mfg_inst, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
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
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
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
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
	public void setBoolean(String name, boolean value) {
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($mfg_inst.equalsIgnoreCase(name)) {
			return mfg_inst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($mfg_inst.equalsIgnoreCase(name)) {
			mfg_inst(
				((MCContainerMeta) mfg_inst_META).castInnerRow(mcframe.serverMS.dbc.MST_MFG_INST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return mfg_inst().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		mfg_inst().mfg_inst_no(value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return mfg_inst().mfg_inst_rev();
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		mfg_inst().mfg_inst_rev(value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		mfg_inst().mfg_inst_rev(value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		mfg_inst().mfg_inst_rev(value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		mfg_inst().mfg_inst_rev(value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		mfg_inst().mfg_inst_rev(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return mfg_inst().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		mfg_inst().itm_mfg_inst_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return mfg_inst().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		mfg_inst().po_d_no(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return mfg_inst().base_unit_yield_qty();
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return mfg_inst().base_unit_inst_qty();
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return mfg_inst().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		mfg_inst().base_unit_cd(value);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return mfg_inst().st_schd_tm();
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		mfg_inst().st_schd_tm(value);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return mfg_inst().end_schd_tm();
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		mfg_inst().end_schd_tm(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return mfg_inst().rqst_dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		mfg_inst().rqst_dlv_rqst_tm(value);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return mfg_inst().inst_dt();
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		mfg_inst().inst_dt(value);
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return mfg_inst().inst_prnt_tm();
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		mfg_inst().inst_prnt_tm(value);
	}

	/**
	 * Order sheet issued flg. 指図書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return mfg_inst().inst_prnt_flg();
	}

	/**
	 * Order sheet issued flg. 指図書発行済ＦＬＧ.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		mfg_inst().inst_prnt_flg(value);
	}

	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_flg() {
		return mfg_inst().aprv_flg();
	}

	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		mfg_inst().aprv_flg(value);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return mfg_inst().mfg_aprv_sts_typ();
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		mfg_inst().mfg_aprv_sts_typ(value);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return mfg_inst().aprv_dt();
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		mfg_inst().aprv_dt(value);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return mfg_inst().aprv_dpt_cd();
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		mfg_inst().aprv_dpt_cd(value);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return mfg_inst().aprv_usr_cd();
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		mfg_inst().aprv_usr_cd(value);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return mfg_inst().aprv_tm();
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		mfg_inst().aprv_tm(value);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return mfg_inst().aprv_rsn();
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		mfg_inst().aprv_rsn(value);
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return mfg_inst().mfg_aprv_role_cd();
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		mfg_inst().mfg_aprv_role_cd(value);
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return mfg_inst().disp_pd();
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		mfg_inst().disp_pd(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return mfg_inst().inst_dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		mfg_inst().inst_dpt_cd(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return mfg_inst().inst_usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		mfg_inst().inst_usr_cd(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return mfg_inst().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		mfg_inst().can_flg(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return mfg_inst().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		mfg_inst().abort_flg(value);
	}

	/**
	 * Plan changed flg. 計画変更ＦＬＧ.<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return mfg_inst().schd_chg_flg();
	}

	/**
	 * Plan changed flg. 計画変更ＦＬＧ.<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		mfg_inst().schd_chg_flg(value);
	}

	/**
	 * Do not allow PO correction/cancel flg. 発注訂正・取消不可ＦＬＧ.<p>
	 *
	 */
	public boolean po_locked_flg() {
		return mfg_inst().po_locked_flg();
	}

	/**
	 * Do not allow PO correction/cancel flg. 発注訂正・取消不可ＦＬＧ.<p>
	 *
	 */
	public void po_locked_flg(boolean value) {
		mfg_inst().po_locked_flg(value);
	}

	/**
	 * Auto-creation at PO flg. 発注時自動作成ＦＬＧ.<p>
	 *
	 */
	public boolean po_auto_reg_flg() {
		return mfg_inst().po_auto_reg_flg();
	}

	/**
	 * Auto-creation at PO flg. 発注時自動作成ＦＬＧ.<p>
	 *
	 */
	public void po_auto_reg_flg(boolean value) {
		mfg_inst().po_auto_reg_flg(value);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return mfg_inst().mfg_inst_unit_typ();
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		mfg_inst().mfg_inst_unit_typ(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return mfg_inst().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		mfg_inst().intr_rmrks(value);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return mfg_inst().inst_rpt_rmrks();
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		mfg_inst().inst_rpt_rmrks(value);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return mfg_inst().inst_po_cnt_rmrks();
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		mfg_inst().inst_po_cnt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return mfg_inst().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		mfg_inst().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return mfg_inst().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		mfg_inst().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return mfg_inst().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		mfg_inst().sub_char3(value);
	}

}

