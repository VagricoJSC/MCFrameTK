package mcframe.serverMSBA.MSBAL5100;

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
 * ブロック"WgRqst_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public static final String $inst_po_flg = "inst_po_flg";
	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	public static final String $wg_rqst = "wg_rqst";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public static final String $auto_prms_flg = "auto_prms_flg";
	/**
	 * Update 更新.<p>
	 *
	 */
	public static final String $upd_flg = "upd_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public static final String $abort_can_flg = "abort_can_flg";
	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public static final String $cred_no_up_flg = "cred_no_up_flg";
	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public static final String $screen_crct_flg = "screen_crct_flg";

	public static final String $wg_rqst_no = $wg_rqst + ".wg_rqst_no";
	public static final String $wg_rqst_typ = $wg_rqst + ".wg_rqst_typ";
	public static final String $wg_rqst_src_typ = $wg_rqst + ".wg_rqst_src_typ";
	public static final String $wg_rqst_src_no = $wg_rqst + ".wg_rqst_src_no";
	public static final String $rqst_dt = $wg_rqst + ".rqst_dt";
	public static final String $rqst_fr_wg_cd = $wg_rqst + ".rqst_fr_wg_cd";
	public static final String $rqst_fr_dpt_cd = $wg_rqst + ".rqst_fr_dpt_cd";
	public static final String $gr_loc_cd = $wg_rqst + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $wg_rqst + ".gr_str_ln_cd";
	public static final String $gr_rqst_tm = $wg_rqst + ".gr_rqst_tm";
	public static final String $rqst_to_wg_cd = $wg_rqst + ".rqst_to_wg_cd";
	public static final String $gi_loc_cd = $wg_rqst + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $wg_rqst + ".gi_str_ln_cd";
	public static final String $gi_rqst_tm = $wg_rqst + ".gi_rqst_tm";
	public static final String $itm_cd = $wg_rqst + ".itm_cd";
	public static final String $itm_sub1 = $wg_rqst + ".itm_sub1";
	public static final String $itm_sub2 = $wg_rqst + ".itm_sub2";
	public static final String $itm_sub3 = $wg_rqst + ".itm_sub3";
	public static final String $itm_nm = $wg_rqst + ".itm_nm";
	public static final String $iv_itm_nm = $wg_rqst + ".iv_itm_nm";
	public static final String $sundry_itm_flg = $wg_rqst + ".sundry_itm_flg";
	public static final String $sno1 = $wg_rqst + ".sno1";
	public static final String $sno1_null_flg = $wg_rqst + ".sno1_null_flg";
	public static final String $sno2 = $wg_rqst + ".sno2";
	public static final String $sno2_null_flg = $wg_rqst + ".sno2_null_flg";
	public static final String $sno3 = $wg_rqst + ".sno3";
	public static final String $sno3_null_flg = $wg_rqst + ".sno3_null_flg";
	public static final String $sno4 = $wg_rqst + ".sno4";
	public static final String $sno4_null_flg = $wg_rqst + ".sno4_null_flg";
	public static final String $trd_unit_qty = $wg_rqst + ".trd_unit_qty";
	public static final String $trd_unit_cd = $wg_rqst + ".trd_unit_cd";
	public static final String $sppl_cd = $wg_rqst + ".sppl_cd";
	public static final String $maker_cd = $wg_rqst + ".maker_cd";
	public static final String $slo_no = $wg_rqst + ".slo_no";
	public static final String $slo_d_no = $wg_rqst + ".slo_d_no";
	public static final String $dlv_cd = $wg_rqst + ".dlv_cd";
	public static final String $itm_ord_no = $wg_rqst + ".itm_ord_no";
	public static final String $mfg_loc_cd = $wg_rqst + ".mfg_loc_cd";
	public static final String $bom_ptn = $wg_rqst + ".bom_ptn";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_po_flg_META = createCommonMeta($inst_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_META = createInnerRowMeta($wg_rqst, mcframe.serverMS.dbc.MST_WG_RQST_R.class);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta auto_prms_flg_META = createCommonMeta($auto_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_flg_META = createCommonMeta($upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_can_flg_META = createCommonMeta($abort_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_no_up_flg_META = createCommonMeta($cred_no_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta screen_crct_flg_META = createCommonMeta($screen_crct_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<WgRqst_Chk01_DtlR> constMetas = new ConstMetaList<WgRqst_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			inst_po_flg_META,
			act_flg_META,
			wg_rqst_META,
			cst_cd_META,
			auto_prms_flg_META,
			upd_flg_META,
			abort_flg_META,
			abort_can_flg_META,
			cred_no_up_flg_META,
			screen_crct_flg_META
		},
		new String[][]{
			{
				"wg_rqst_no",
				"wg_rqst_typ",
				"wg_rqst_src_typ",
				"wg_rqst_src_no",
				"rqst_dt",
				"rqst_fr_wg_cd",
				"rqst_fr_dpt_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"gr_rqst_tm",
				"rqst_to_wg_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_rqst_tm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"sundry_itm_flg",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"trd_unit_qty",
				"trd_unit_cd",
				"sppl_cd",
				"maker_cd",
				"slo_no",
				"slo_d_no",
				"dlv_cd",
				"itm_ord_no",
				"mfg_loc_cd",
				"bom_ptn"
			},
			{
				$wg_rqst_no,
				$wg_rqst_typ,
				$wg_rqst_src_typ,
				$wg_rqst_src_no,
				$rqst_dt,
				$rqst_fr_wg_cd,
				$rqst_fr_dpt_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$gr_rqst_tm,
				$rqst_to_wg_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_rqst_tm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$sundry_itm_flg,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$trd_unit_qty,
				$trd_unit_cd,
				$sppl_cd,
				$maker_cd,
				$slo_no,
				$slo_d_no,
				$dlv_cd,
				$itm_ord_no,
				$mfg_loc_cd,
				$bom_ptn
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
	protected WgRqst_Chk01_DtlR_MC_A(ConstMetaList<? extends WgRqst_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_DtlR clone() {
		return (WgRqst_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_DtlR createInstance() {
		return (WgRqst_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_DtlR getValues(String... names) {
		return (WgRqst_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public boolean inst_po_flg() {
		return getConstBoolean(offset + 3, $inst_po_flg);
	}

	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public void inst_po_flg(boolean value) {
		setConstBoolean(offset + 3, $inst_po_flg, value);
	}


	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 4, $act_flg);
	}

	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 4, $act_flg, value);
	}


	public mcframe.serverMS.dbc.MST_WG_RQST_R wg_rqst(){
		return (mcframe.serverMS.dbc.MST_WG_RQST_R) getConstInnerRow(offset + 5, $wg_rqst);
	}
	
	public void wg_rqst(mcframe.serverMS.dbc.MST_WG_RQST_R row){
		setConstInnerRow(offset + 5, $wg_rqst, row);
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
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public boolean auto_prms_flg() {
		return getConstBoolean(offset + 7, $auto_prms_flg);
	}

	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public void auto_prms_flg(boolean value) {
		setConstBoolean(offset + 7, $auto_prms_flg, value);
	}


	/**
	 * Update 更新.<p>
	 *
	 */
	public boolean upd_flg() {
		return getConstBoolean(offset + 8, $upd_flg);
	}

	/**
	 * Update 更新.<p>
	 *
	 */
	public void upd_flg(boolean value) {
		setConstBoolean(offset + 8, $upd_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 9, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 9, $abort_flg, value);
	}


	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public boolean abort_can_flg() {
		return getConstBoolean(offset + 10, $abort_can_flg);
	}

	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public void abort_can_flg(boolean value) {
		setConstBoolean(offset + 10, $abort_can_flg, value);
	}


	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public boolean cred_no_up_flg() {
		return getConstBoolean(offset + 11, $cred_no_up_flg);
	}

	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public void cred_no_up_flg(boolean value) {
		setConstBoolean(offset + 11, $cred_no_up_flg, value);
	}


	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public boolean screen_crct_flg() {
		return getConstBoolean(offset + 12, $screen_crct_flg);
	}

	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public void screen_crct_flg(boolean value) {
		setConstBoolean(offset + 12, $screen_crct_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			return inst_po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			return abort_can_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			return inst_po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			return abort_can_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			inst_po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			abort_can_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			inst_po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			abort_can_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wg_rqst.equalsIgnoreCase(name)) {
			return wg_rqst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wg_rqst.equalsIgnoreCase(name)) {
			wg_rqst(
				((MCContainerMeta) wg_rqst_META).castInnerRow(mcframe.serverMS.dbc.MST_WG_RQST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return wg_rqst().wg_rqst_no();
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		wg_rqst().wg_rqst_no(value);
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return wg_rqst().wg_rqst_typ();
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		wg_rqst().wg_rqst_typ(value);
	}

	/**
	 * Source of inventory request from other WG?creation type ＷＧ間依頼元作成区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return wg_rqst().wg_rqst_src_typ();
	}

	/**
	 * Source of inventory request from other WG?creation type ＷＧ間依頼元作成区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		wg_rqst().wg_rqst_src_typ(value);
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return wg_rqst().wg_rqst_src_no();
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		wg_rqst().wg_rqst_src_no(value);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return wg_rqst().rqst_dt();
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		wg_rqst().rqst_dt(value);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return wg_rqst().rqst_fr_wg_cd();
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		wg_rqst().rqst_fr_wg_cd(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return wg_rqst().rqst_fr_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		wg_rqst().rqst_fr_dpt_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return wg_rqst().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		wg_rqst().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return wg_rqst().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		wg_rqst().gr_str_ln_cd(value);
	}

	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return wg_rqst().gr_rqst_tm();
	}

	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		wg_rqst().gr_rqst_tm(value);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return wg_rqst().rqst_to_wg_cd();
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		wg_rqst().rqst_to_wg_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return wg_rqst().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		wg_rqst().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return wg_rqst().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		wg_rqst().gi_str_ln_cd(value);
	}

	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return wg_rqst().gi_rqst_tm();
	}

	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		wg_rqst().gi_rqst_tm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return wg_rqst().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		wg_rqst().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return wg_rqst().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		wg_rqst().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return wg_rqst().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		wg_rqst().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return wg_rqst().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		wg_rqst().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return wg_rqst().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		wg_rqst().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return wg_rqst().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		wg_rqst().iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return wg_rqst().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		wg_rqst().sundry_itm_flg(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return wg_rqst().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		wg_rqst().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return wg_rqst().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		wg_rqst().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return wg_rqst().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		wg_rqst().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return wg_rqst().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		wg_rqst().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return wg_rqst().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		wg_rqst().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return wg_rqst().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		wg_rqst().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return wg_rqst().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		wg_rqst().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return wg_rqst().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		wg_rqst().sno4_null_flg(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return wg_rqst().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return wg_rqst().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		wg_rqst().trd_unit_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return wg_rqst().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		wg_rqst().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return wg_rqst().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		wg_rqst().maker_cd(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return wg_rqst().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		wg_rqst().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return wg_rqst().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		wg_rqst().slo_d_no(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return wg_rqst().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		wg_rqst().dlv_cd(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return wg_rqst().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		wg_rqst().itm_ord_no(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return wg_rqst().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		wg_rqst().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return wg_rqst().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		wg_rqst().bom_ptn(value);
	}

}

