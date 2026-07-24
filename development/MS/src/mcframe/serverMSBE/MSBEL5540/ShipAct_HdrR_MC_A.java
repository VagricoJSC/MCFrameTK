package mcframe.serverMSBE.MSBEL5540;

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
 * ブロック"ShipAct_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipAct_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Shipping result 出荷実績.<p>
	 *
	 */
	public static final String $sa = "sa";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
	/**
	 * Delivery note immediate issued 納品書即時発行済.<p>
	 *
	 */
	public static final String $dlv_slip_prnted_flg = "dlv_slip_prnted_flg";
	/**
	 * Shipping guide immediately issued 出荷案内書即時発行済.<p>
	 *
	 */
	public static final String $ship_adv_prnted_flg = "ship_adv_prnted_flg";
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";
	/**
	 * Create delivery slip 納品伝票作成.<p>
	 *
	 */
	public static final String $dlv_slip_flg = "dlv_slip_flg";
	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public static final String $io_act_flg = "io_act_flg";
	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public static final String $sls_act_flg = "sls_act_flg";
	/**
	 * Synchronous 同期.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Shipping completion check not required 出荷完了チェック不要.<p>
	 *
	 */
	public static final String $ship_cmpl_no_chk_flg = "ship_cmpl_no_chk_flg";
	/**
	 * Unplanned invoice transaction sales 計画外インボイス取引売上.<p>
	 *
	 */
	public static final String $uplnd_iv_sls_flg = "uplnd_iv_sls_flg";
	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public static final String $sls_dtl_mod_flg = "sls_dtl_mod_flg";
	/**
	 * Reference shipping result No. 参照出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_ship_act_no = "ref_ship_act_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";

	public static final String $ship_act_no = $sa + ".ship_act_no";
	public static final String $ship_act_rev = $sa + ".ship_act_rev";
	public static final String $ship_inst_no = $sa + ".ship_inst_no";
	public static final String $ac_dt = $sa + ".ac_dt";
	public static final String $ship_tm = $sa + ".ship_tm";
	public static final String $dlv_tm = $sa + ".dlv_tm";
	public static final String $rqst_dpt_cd = $sa + ".rqst_dpt_cd";
	public static final String $rqst_usr_cd = $sa + ".rqst_usr_cd";
	public static final String $ship_fr_lg_grp_cd = $sa + ".ship_fr_lg_grp_cd";
	public static final String $wg_cd = $sa + ".wg_cd";
	public static final String $ship_term_cd = $sa + ".ship_term_cd";
	public static final String $ship_dpt_cd = $sa + ".ship_dpt_cd";
	public static final String $ship_usr_cd = $sa + ".ship_usr_cd";
	public static final String $ship_to_lg_grp_cd = $sa + ".ship_to_lg_grp_cd";
	public static final String $cst_cd = $sa + ".cst_cd";
	public static final String $ship_to_id_typ = $sa + ".ship_to_id_typ";
	public static final String $ship_to_id_cd = $sa + ".ship_to_id_cd";
	public static final String $ship_to_id_nm = $sa + ".ship_to_id_nm";
	public static final String $ship_to_zip_cd = $sa + ".ship_to_zip_cd";
	public static final String $ship_to_addr1 = $sa + ".ship_to_addr1";
	public static final String $ship_to_addr2 = $sa + ".ship_to_addr2";
	public static final String $ship_to_addr3 = $sa + ".ship_to_addr3";
	public static final String $ship_to_addr4 = $sa + ".ship_to_addr4";
	public static final String $ship_to_cntct_dpt = $sa + ".ship_to_cntct_dpt";
	public static final String $ship_to_cntct_psn = $sa + ".ship_to_cntct_psn";
	public static final String $ship_to_tel = $sa + ".ship_to_tel";
	public static final String $ship_to_fax = $sa + ".ship_to_fax";
	public static final String $ship_to_sundry_flg = $sa + ".ship_to_sundry_flg";
	public static final String $via_dlv_typ = $sa + ".via_dlv_typ";
	public static final String $iv_no = $sa + ".iv_no";
	public static final String $uplnd_flg = $sa + ".uplnd_flg";
	public static final String $intr_rmrks = $sa + ".intr_rmrks";
	public static final String $sub_char1 = $sa + ".sub_char1";
	public static final String $sub_char2 = $sa + ".sub_char2";
	public static final String $sub_char3 = $sa + ".sub_char3";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta sa_META = createInnerRowMeta($sa, mcframe.serverMS.dbc.MST_SHIP_ACT_R.class);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_prnted_flg_META = createCommonMeta($dlv_slip_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnted_flg_META = createCommonMeta($ship_adv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_flg_META = createCommonMeta($dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_act_flg_META = createCommonMeta($io_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_flg_META = createCommonMeta($sls_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cmpl_no_chk_flg_META = createCommonMeta($ship_cmpl_no_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta uplnd_iv_sls_flg_META = createCommonMeta($uplnd_iv_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_mod_flg_META = createCommonMeta($sls_dtl_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_ship_act_no_META = createCommonMeta($ref_ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);

	protected static final ConstMetaList<ShipAct_HdrR> constMetas = new ConstMetaList<ShipAct_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			sa_META,
			can_ac_dt_META,
			dlv_slip_prnt_flg_META,
			ship_adv_prnt_flg_META,
			dlv_slip_prnted_flg_META,
			ship_adv_prnted_flg_META,
			lot_chk_off_flg_META,
			dlv_slip_flg_META,
			io_act_flg_META,
			sls_act_flg_META,
			sync_flg_META,
			peg_no_META,
			err_flg_META,
			ship_cmpl_no_chk_flg_META,
			uplnd_iv_sls_flg_META,
			sls_dtl_mod_flg_META,
			ref_ship_act_no_META,
			dlv_slip_no_META
		},
		new String[][]{
			{
				"ship_act_no",
				"ship_act_rev",
				"ship_inst_no",
				"ac_dt",
				"ship_tm",
				"dlv_tm",
				"rqst_dpt_cd",
				"rqst_usr_cd",
				"ship_fr_lg_grp_cd",
				"wg_cd",
				"ship_term_cd",
				"ship_dpt_cd",
				"ship_usr_cd",
				"ship_to_lg_grp_cd",
				"cst_cd",
				"ship_to_id_typ",
				"ship_to_id_cd",
				"ship_to_id_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"ship_to_sundry_flg",
				"via_dlv_typ",
				"iv_no",
				"uplnd_flg",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$ship_act_no,
				$ship_act_rev,
				$ship_inst_no,
				$ac_dt,
				$ship_tm,
				$dlv_tm,
				$rqst_dpt_cd,
				$rqst_usr_cd,
				$ship_fr_lg_grp_cd,
				$wg_cd,
				$ship_term_cd,
				$ship_dpt_cd,
				$ship_usr_cd,
				$ship_to_lg_grp_cd,
				$cst_cd,
				$ship_to_id_typ,
				$ship_to_id_cd,
				$ship_to_id_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$ship_to_sundry_flg,
				$via_dlv_typ,
				$iv_no,
				$uplnd_flg,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected ShipAct_HdrR_MC_A(ConstMetaList<? extends ShipAct_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_HdrR clone() {
		return (ShipAct_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_HdrR createInstance() {
		return (ShipAct_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_HdrR getValues(String... names) {
		return (ShipAct_HdrR) super.getValues(names);
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
	 * Shipping result 出荷実績.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_SHIP_ACT_R sa(){
		return (mcframe.serverMS.dbc.MST_SHIP_ACT_R) getConstInnerRow(offset + 1, $sa);
	}
	
	/**
	 * Shipping result 出荷実績.<p>
	 *
	 */
	public void sa(mcframe.serverMS.dbc.MST_SHIP_ACT_R row){
		setConstInnerRow(offset + 1, $sa, row);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 2, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 2, $can_ac_dt, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 3, $dlv_slip_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 4, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $ship_adv_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issued 納品書即時発行済.<p>
	 *
	 */
	public boolean dlv_slip_prnted_flg() {
		return getConstBoolean(offset + 5, $dlv_slip_prnted_flg);
	}

	/**
	 * Delivery note immediate issued 納品書即時発行済.<p>
	 *
	 */
	public void dlv_slip_prnted_flg(boolean value) {
		setConstBoolean(offset + 5, $dlv_slip_prnted_flg, value);
	}


	/**
	 * Shipping guide immediately issued 出荷案内書即時発行済.<p>
	 *
	 */
	public boolean ship_adv_prnted_flg() {
		return getConstBoolean(offset + 6, $ship_adv_prnted_flg);
	}

	/**
	 * Shipping guide immediately issued 出荷案内書即時発行済.<p>
	 *
	 */
	public void ship_adv_prnted_flg(boolean value) {
		setConstBoolean(offset + 6, $ship_adv_prnted_flg, value);
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 7, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 7, $lot_chk_off_flg, value);
	}


	/**
	 * Create delivery slip 納品伝票作成.<p>
	 *
	 */
	public boolean dlv_slip_flg() {
		return getConstBoolean(offset + 8, $dlv_slip_flg);
	}

	/**
	 * Create delivery slip 納品伝票作成.<p>
	 *
	 */
	public void dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 8, $dlv_slip_flg, value);
	}


	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public boolean io_act_flg() {
		return getConstBoolean(offset + 9, $io_act_flg);
	}

	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public void io_act_flg(boolean value) {
		setConstBoolean(offset + 9, $io_act_flg, value);
	}


	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public boolean sls_act_flg() {
		return getConstBoolean(offset + 10, $sls_act_flg);
	}

	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public void sls_act_flg(boolean value) {
		setConstBoolean(offset + 10, $sls_act_flg, value);
	}


	/**
	 * Synchronous 同期.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 11, $sync_flg);
	}

	/**
	 * Synchronous 同期.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 11, $sync_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 12, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 12, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 13, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 13, $err_flg, value);
	}


	/**
	 * Shipping completion check not required 出荷完了チェック不要.<p>
	 *
	 */
	public boolean ship_cmpl_no_chk_flg() {
		return getConstBoolean(offset + 14, $ship_cmpl_no_chk_flg);
	}

	/**
	 * Shipping completion check not required 出荷完了チェック不要.<p>
	 *
	 */
	public void ship_cmpl_no_chk_flg(boolean value) {
		setConstBoolean(offset + 14, $ship_cmpl_no_chk_flg, value);
	}


	/**
	 * Unplanned invoice transaction sales 計画外インボイス取引売上.<p>
	 *
	 */
	public boolean uplnd_iv_sls_flg() {
		return getConstBoolean(offset + 15, $uplnd_iv_sls_flg);
	}

	/**
	 * Unplanned invoice transaction sales 計画外インボイス取引売上.<p>
	 *
	 */
	public void uplnd_iv_sls_flg(boolean value) {
		setConstBoolean(offset + 15, $uplnd_iv_sls_flg, value);
	}


	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public boolean sls_dtl_mod_flg() {
		return getConstBoolean(offset + 16, $sls_dtl_mod_flg);
	}

	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public void sls_dtl_mod_flg(boolean value) {
		setConstBoolean(offset + 16, $sls_dtl_mod_flg, value);
	}


	/**
	 * Reference shipping result No. 参照出荷実績ＮＯ.<p>
	 *
	 */
	public String ref_ship_act_no() {
		return getConstString(offset + 17, $ref_ship_act_no);
	}

	/**
	 * Reference shipping result No. 参照出荷実績ＮＯ.<p>
	 *
	 */
	public void ref_ship_act_no(String value) {
		setConstString(offset + 17, $ref_ship_act_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 18, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 18, $dlv_slip_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ref_ship_act_no.equalsIgnoreCase(name)) {
			return ref_ship_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
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
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnted_flg();
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnted_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_slip_flg();
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			return io_act_flg();
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			return sls_act_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ship_cmpl_no_chk_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_no_chk_flg();
		}
		if ($uplnd_iv_sls_flg.equalsIgnoreCase(name)) {
			return uplnd_iv_sls_flg();
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			return sls_dtl_mod_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ref_ship_act_no.equalsIgnoreCase(name)) {
			return ref_ship_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
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
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnted_flg();
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnted_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_slip_flg();
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			return io_act_flg();
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			return sls_act_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ship_cmpl_no_chk_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_no_chk_flg();
		}
		if ($uplnd_iv_sls_flg.equalsIgnoreCase(name)) {
			return uplnd_iv_sls_flg();
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			return sls_dtl_mod_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ref_ship_act_no.equalsIgnoreCase(name)) {
			ref_ship_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnted_flg(value);
			return;
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			ship_adv_prnted_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_slip_flg(value);
			return;
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			io_act_flg(value);
			return;
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			sls_act_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ship_cmpl_no_chk_flg.equalsIgnoreCase(name)) {
			ship_cmpl_no_chk_flg(value);
			return;
		}
		if ($uplnd_iv_sls_flg.equalsIgnoreCase(name)) {
			uplnd_iv_sls_flg(value);
			return;
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			sls_dtl_mod_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ref_ship_act_no.equalsIgnoreCase(name)) {
			ref_ship_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnted_flg(value);
			return;
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			ship_adv_prnted_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_slip_flg(value);
			return;
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			io_act_flg(value);
			return;
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			sls_act_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ship_cmpl_no_chk_flg.equalsIgnoreCase(name)) {
			ship_cmpl_no_chk_flg(value);
			return;
		}
		if ($uplnd_iv_sls_flg.equalsIgnoreCase(name)) {
			uplnd_iv_sls_flg(value);
			return;
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			sls_dtl_mod_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sa.equalsIgnoreCase(name)) {
			return sa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sa.equalsIgnoreCase(name)) {
			sa(
				((MCContainerMeta) sa_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return sa().ship_act_no();
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		sa().ship_act_no(value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public MCNumber ship_act_rev() {
		return sa().ship_act_rev();
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(MCNumber value) {
		sa().ship_act_rev(value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(int value) {
		sa().ship_act_rev(value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(long value) {
		sa().ship_act_rev(value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(float value) {
		sa().ship_act_rev(value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(double value) {
		sa().ship_act_rev(value);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return sa().ship_inst_no();
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		sa().ship_inst_no(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return sa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		sa().ac_dt(value);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return sa().ship_tm();
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		sa().ship_tm(value);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return sa().dlv_tm();
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		sa().dlv_tm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return sa().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		sa().rqst_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return sa().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		sa().rqst_usr_cd(value);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return sa().ship_fr_lg_grp_cd();
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		sa().ship_fr_lg_grp_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return sa().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		sa().wg_cd(value);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return sa().ship_term_cd();
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		sa().ship_term_cd(value);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String ship_dpt_cd() {
		return sa().ship_dpt_cd();
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void ship_dpt_cd(String value) {
		sa().ship_dpt_cd(value);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String ship_usr_cd() {
		return sa().ship_usr_cd();
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void ship_usr_cd(String value) {
		sa().ship_usr_cd(value);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return sa().ship_to_lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		sa().ship_to_lg_grp_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sa().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sa().cst_cd(value);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return sa().ship_to_id_typ();
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		sa().ship_to_id_typ(value);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return sa().ship_to_id_cd();
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		sa().ship_to_id_cd(value);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return sa().ship_to_id_nm();
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		sa().ship_to_id_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return sa().ship_to_zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		sa().ship_to_zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return sa().ship_to_addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		sa().ship_to_addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return sa().ship_to_addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		sa().ship_to_addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return sa().ship_to_addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		sa().ship_to_addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return sa().ship_to_addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		sa().ship_to_addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return sa().ship_to_cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		sa().ship_to_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return sa().ship_to_cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		sa().ship_to_cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return sa().ship_to_tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		sa().ship_to_tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return sa().ship_to_fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		sa().ship_to_fax(value);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return sa().ship_to_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		sa().ship_to_sundry_flg(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return sa().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		sa().via_dlv_typ(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return sa().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		sa().iv_no(value);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return sa().uplnd_flg();
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		sa().uplnd_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return sa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		sa().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return sa().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		sa().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return sa().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		sa().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return sa().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		sa().sub_char3(value);
	}

}

