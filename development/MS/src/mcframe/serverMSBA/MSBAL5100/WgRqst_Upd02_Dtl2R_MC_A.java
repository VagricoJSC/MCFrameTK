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
 * ブロック"WgRqst_Upd02_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Upd02_Dtl2R_MC_A extends MCConstRow {

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
	public static final String $wg_rqst_prms = "wg_rqst_prms";
	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public static final String $auto_prms_flg = "auto_prms_flg";
	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public static final String $cred_no_up_flg = "cred_no_up_flg";
	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";
	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public static final String $re_prms_dt = "re_prms_dt";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public static final String $last_fix_flg = "last_fix_flg";
	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public static final String $schd_cng_flg = "schd_cng_flg";
	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public static final String $screen_crct_flg = "screen_crct_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";

	public static final String $wg_rqst_prms_no = $wg_rqst_prms + ".wg_rqst_prms_no";
	public static final String $wg_rqst_no = $wg_rqst_prms + ".wg_rqst_no";
	public static final String $wg_cd = $wg_rqst_prms + ".wg_cd";
	public static final String $fix_flg = $wg_rqst_prms + ".fix_flg";
	public static final String $fix_dt = $wg_rqst_prms + ".fix_dt";
	public static final String $prms_trd_unit_cd = $wg_rqst_prms + ".prms_trd_unit_cd";
	public static final String $prms_trd_unit_qty = $wg_rqst_prms + ".prms_trd_unit_qty";
	public static final String $prms_base_unit_cd = $wg_rqst_prms + ".prms_base_unit_cd";
	public static final String $prms_base_unit_qty = $wg_rqst_prms + ".prms_base_unit_qty";
	public static final String $gr_schd_tm = $wg_rqst_prms + ".gr_schd_tm";
	public static final String $gi_lg_grp_cd = $wg_rqst_prms + ".gi_lg_grp_cd";
	public static final String $gi_loc_cd = $wg_rqst_prms + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $wg_rqst_prms + ".gi_str_ln_cd";
	public static final String $gi_rqst_tm = $wg_rqst_prms + ".gi_rqst_tm";
	public static final String $sppl_cd = $wg_rqst_prms + ".sppl_cd";
	public static final String $maker_cd = $wg_rqst_prms + ".maker_cd";
	public static final String $mfg_loc_cd = $wg_rqst_prms + ".mfg_loc_cd";
	public static final String $bom_ptn = $wg_rqst_prms + ".bom_ptn";
	public static final String $prms_rmrks = $wg_rqst_prms + ".prms_rmrks";
	public static final String $intr_rmrks = $wg_rqst_prms + ".intr_rmrks";
	public static final String $sub_char1 = $wg_rqst_prms + ".sub_char1";
	public static final String $sub_char2 = $wg_rqst_prms + ".sub_char2";
	public static final String $sub_char3 = $wg_rqst_prms + ".sub_char3";
	public static final String $can_flg = $wg_rqst_prms + ".can_flg";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_rqst_prms_META = createInnerRowMeta($wg_rqst_prms, mcframe.serverMS.dbc.MST_WG_RQST_PRMS_R.class);
	public static final MCMeta auto_prms_flg_META = createCommonMeta($auto_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_no_up_flg_META = createCommonMeta($cred_no_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta last_fix_flg_META = createCommonMeta($last_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_cng_flg_META = createCommonMeta($schd_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta screen_crct_flg_META = createCommonMeta($screen_crct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);

	protected static final ConstMetaList<WgRqst_Upd02_Dtl2R> constMetas = new ConstMetaList<WgRqst_Upd02_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			wg_rqst_prms_META,
			auto_prms_flg_META,
			cred_no_up_flg_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			slo_no_META,
			slo_d_no_META,
			last_fix_flg_META,
			schd_cng_flg_META,
			screen_crct_flg_META,
			trd_cd_META,
			trd_ptn_typ_META
		},
		new String[][]{
			{
				"wg_rqst_prms_no",
				"wg_rqst_no",
				"wg_cd",
				"fix_flg",
				"fix_dt",
				"prms_trd_unit_cd",
				"prms_trd_unit_qty",
				"prms_base_unit_cd",
				"prms_base_unit_qty",
				"gr_schd_tm",
				"gi_lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_rqst_tm",
				"sppl_cd",
				"maker_cd",
				"mfg_loc_cd",
				"bom_ptn",
				"prms_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"can_flg"
			},
			{
				$wg_rqst_prms_no,
				$wg_rqst_no,
				$wg_cd,
				$fix_flg,
				$fix_dt,
				$prms_trd_unit_cd,
				$prms_trd_unit_qty,
				$prms_base_unit_cd,
				$prms_base_unit_qty,
				$gr_schd_tm,
				$gi_lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_rqst_tm,
				$sppl_cd,
				$maker_cd,
				$mfg_loc_cd,
				$bom_ptn,
				$prms_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$can_flg
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
	protected WgRqst_Upd02_Dtl2R_MC_A(ConstMetaList<? extends WgRqst_Upd02_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl2R clone() {
		return (WgRqst_Upd02_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl2R createInstance() {
		return (WgRqst_Upd02_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd02_Dtl2R getValues(String... names) {
		return (WgRqst_Upd02_Dtl2R) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_WG_RQST_PRMS_R wg_rqst_prms(){
		return (mcframe.serverMS.dbc.MST_WG_RQST_PRMS_R) getConstInnerRow(offset + 2, $wg_rqst_prms);
	}
	
	public void wg_rqst_prms(mcframe.serverMS.dbc.MST_WG_RQST_PRMS_R row){
		setConstInnerRow(offset + 2, $wg_rqst_prms, row);
	}


	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public boolean auto_prms_flg() {
		return getConstBoolean(offset + 3, $auto_prms_flg);
	}

	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public void auto_prms_flg(boolean value) {
		setConstBoolean(offset + 3, $auto_prms_flg, value);
	}


	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public boolean cred_no_up_flg() {
		return getConstBoolean(offset + 4, $cred_no_up_flg);
	}

	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public void cred_no_up_flg(boolean value) {
		setConstBoolean(offset + 4, $cred_no_up_flg, value);
	}


	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 5, $prms_ntc_flg);
	}

	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_ntc_flg, value);
	}


	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 6, $prms_dt);
	}

	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 6, $prms_dt, value);
	}


	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 7, $re_prms_ntc_flg);
	}

	/**
	 * Re-replied 回答再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 7, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 8, $re_prms_dt);
	}

	/**
	 * Re-replied date 回答再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 8, $re_prms_dt, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 9, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 9, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 10, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 10, $slo_d_no, value);
	}


	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public boolean last_fix_flg() {
		return getConstBoolean(offset + 11, $last_fix_flg);
	}

	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public void last_fix_flg(boolean value) {
		setConstBoolean(offset + 11, $last_fix_flg, value);
	}


	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public boolean schd_cng_flg() {
		return getConstBoolean(offset + 12, $schd_cng_flg);
	}

	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public void schd_cng_flg(boolean value) {
		setConstBoolean(offset + 12, $schd_cng_flg, value);
	}


	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public boolean screen_crct_flg() {
		return getConstBoolean(offset + 13, $screen_crct_flg);
	}

	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public void screen_crct_flg(boolean value) {
		setConstBoolean(offset + 13, $screen_crct_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 14, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 14, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 15, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 15, $trd_ptn_typ, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			return schd_cng_flg();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			return schd_cng_flg();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			schd_cng_flg(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			schd_cng_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wg_rqst_prms.equalsIgnoreCase(name)) {
			return wg_rqst_prms();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wg_rqst_prms.equalsIgnoreCase(name)) {
			wg_rqst_prms(
				((MCContainerMeta) wg_rqst_prms_META).castInnerRow(mcframe.serverMS.dbc.MST_WG_RQST_PRMS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public String wg_rqst_prms_no() {
		return wg_rqst_prms().wg_rqst_prms_no();
	}

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public void wg_rqst_prms_no(String value) {
		wg_rqst_prms().wg_rqst_prms_no(value);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return wg_rqst_prms().wg_rqst_no();
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		wg_rqst_prms().wg_rqst_no(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return wg_rqst_prms().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		wg_rqst_prms().wg_cd(value);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return wg_rqst_prms().fix_flg();
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		wg_rqst_prms().fix_flg(value);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return wg_rqst_prms().fix_dt();
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		wg_rqst_prms().fix_dt(value);
	}

	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public String prms_trd_unit_cd() {
		return wg_rqst_prms().prms_trd_unit_cd();
	}

	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public void prms_trd_unit_cd(String value) {
		wg_rqst_prms().prms_trd_unit_cd(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_qty() {
		return wg_rqst_prms().prms_trd_unit_qty();
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(MCNumber value) {
		wg_rqst_prms().prms_trd_unit_qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(int value) {
		wg_rqst_prms().prms_trd_unit_qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(long value) {
		wg_rqst_prms().prms_trd_unit_qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(float value) {
		wg_rqst_prms().prms_trd_unit_qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(double value) {
		wg_rqst_prms().prms_trd_unit_qty(value);
	}

	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public String prms_base_unit_cd() {
		return wg_rqst_prms().prms_base_unit_cd();
	}

	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public void prms_base_unit_cd(String value) {
		wg_rqst_prms().prms_base_unit_cd(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public MCNumber prms_base_unit_qty() {
		return wg_rqst_prms().prms_base_unit_qty();
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(MCNumber value) {
		wg_rqst_prms().prms_base_unit_qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(int value) {
		wg_rqst_prms().prms_base_unit_qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(long value) {
		wg_rqst_prms().prms_base_unit_qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(float value) {
		wg_rqst_prms().prms_base_unit_qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(double value) {
		wg_rqst_prms().prms_base_unit_qty(value);
	}

	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public MCDate gr_schd_tm() {
		return wg_rqst_prms().gr_schd_tm();
	}

	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public void gr_schd_tm(MCDate value) {
		wg_rqst_prms().gr_schd_tm(value);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return wg_rqst_prms().gi_lg_grp_cd();
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		wg_rqst_prms().gi_lg_grp_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return wg_rqst_prms().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		wg_rqst_prms().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return wg_rqst_prms().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		wg_rqst_prms().gi_str_ln_cd(value);
	}

	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return wg_rqst_prms().gi_rqst_tm();
	}

	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		wg_rqst_prms().gi_rqst_tm(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return wg_rqst_prms().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		wg_rqst_prms().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return wg_rqst_prms().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		wg_rqst_prms().maker_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return wg_rqst_prms().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		wg_rqst_prms().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return wg_rqst_prms().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		wg_rqst_prms().bom_ptn(value);
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return wg_rqst_prms().prms_rmrks();
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		wg_rqst_prms().prms_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return wg_rqst_prms().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		wg_rqst_prms().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return wg_rqst_prms().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		wg_rqst_prms().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return wg_rqst_prms().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		wg_rqst_prms().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return wg_rqst_prms().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		wg_rqst_prms().sub_char3(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return wg_rqst_prms().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		wg_rqst_prms().can_flg(value);
	}

}

