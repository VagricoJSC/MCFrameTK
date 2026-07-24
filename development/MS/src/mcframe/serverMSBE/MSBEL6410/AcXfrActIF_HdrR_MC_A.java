package mcframe.serverMSBE.MSBEL6410;

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
 * ブロック"AcXfrActIF_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AcXfrActIF_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_dtl_peg_no = "hdr_dtl_peg_no";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_act_no = "acxfr_act_no";
	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public static final String $acxfr_act_rev = "acxfr_act_rev";
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
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_no = "acxfr_inst_no";
	/**
	 * Actual other accounting transfer date and time 他勘定振替実績日時.<p>
	 *
	 */
	public static final String $acxfr_act_tm = "acxfr_act_tm";
	/**
	 * Other accounting transfer recording date 他勘定振替計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public static final String $intr_rmrks_upd_flg = "intr_rmrks_upd_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Update transaction remarks 取引備考更新.<p>
	 *
	 */
	public static final String $trd_rmrks_upd_flg = "trd_rmrks_upd_flg";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Slip issue flg. 伝票発行ＦＬＧ.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $acxfr_inst_upd_cntr = "acxfr_inst_upd_cntr";
	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $acxfr_act_upd_cntr = "acxfr_act_upd_cntr";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_dtl_peg_no_META = createCommonMeta($hdr_dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta acxfr_act_no_META = createCommonMeta($acxfr_act_no, mcframe.commonMA.meta.MA_META.ACXFR_ACT_NO);
	public static final MCMeta acxfr_act_rev_META = createCommonMeta($acxfr_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta acxfr_inst_no_META = createCommonMeta($acxfr_inst_no, mcframe.commonMA.meta.MA_META.ACXFR_INST_NO);
	public static final MCMeta acxfr_act_tm_META = createCommonMeta($acxfr_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta intr_rmrks_upd_flg_META = createCommonMeta($intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_ACT_INTR_RMRKS);
	public static final MCMeta trd_rmrks_upd_flg_META = createCommonMeta($trd_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR3);
	public static final MCMeta acxfr_inst_upd_cntr_META = createCommonMeta($acxfr_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta acxfr_act_upd_cntr_META = createCommonMeta($acxfr_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<AcXfrActIF_HdrR> constMetas = new ConstMetaList<AcXfrActIF_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_dtl_peg_no_META,
			rtn_sts_typ_META,
			acxfr_act_no_META,
			acxfr_act_rev_META,
			trd_cd_META,
			trd_ptn_typ_META,
			loc_cd_META,
			wg_cd_META,
			acxfr_inst_no_META,
			acxfr_act_tm_META,
			ac_dt_META,
			can_ac_dt_META,
			act_usr_cd_META,
			act_dpt_cd_META,
			intr_rmrks_upd_flg_META,
			intr_rmrks_META,
			trd_rmrks_upd_flg_META,
			trd_rmrks_META,
			prnt_flg_META,
			sub_char1_upd_flg_META,
			sub_char1_META,
			sub_char2_upd_flg_META,
			sub_char2_META,
			sub_char3_upd_flg_META,
			sub_char3_META,
			acxfr_inst_upd_cntr_META,
			acxfr_act_upd_cntr_META,
			err_flg_META,
			peg_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$data_crud_typ, "E"},	// data_crud_typ
				{$hdr_dtl_peg_no, "E"}	// hdr_dtl_peg_no
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$data_crud_typ, "MAC_DATA_CRUD_TYP"},	// data_crud_typ
				{$trd_ptn_typ, "MAC_TRD_PTN_TYP"}	// trd_ptn_typ
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$acxfr_act_tm, "tmBfToday"},	// acxfr_act_tm
				{$ac_dt, "bfToday"}	// ac_dt
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$act_usr_cd, "MA.MAUAL0010.Usr"},	// act_usr_cd
				{$act_dpt_cd, "MA.MAUAL0010.Dpt"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$loc_cd, "wg_cd"}	// loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$act_dpt_cd, "act_usr_cd;ac_dt;MAC_DPT_IS_SRCH_TYP.SCE"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$act_dpt_cd, "usr_cd;dt;dpt_is_srch_typ"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
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
	protected AcXfrActIF_HdrR_MC_A(ConstMetaList<? extends AcXfrActIF_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcXfrActIF_HdrR clone() {
		return (AcXfrActIF_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcXfrActIF_HdrR createInstance() {
		return (AcXfrActIF_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcXfrActIF_HdrR getValues(String... names) {
		return (AcXfrActIF_HdrR) super.getValues(names);
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
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg_no() {
		return getConstNumber(offset + 1, $hdr_dtl_peg_no);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public String acxfr_act_no() {
		return getConstString(offset + 3, $acxfr_act_no);
	}

	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public void acxfr_act_no(String value) {
		setConstString(offset + 3, $acxfr_act_no, value);
	}


	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public MCNumber acxfr_act_rev() {
		return getConstNumber(offset + 4, $acxfr_act_rev);
	}

	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public void acxfr_act_rev(MCNumber value) {
		setConstNumber(offset + 4, $acxfr_act_rev, value);
	}

	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public void acxfr_act_rev(int value) {
		setConstNumber(offset + 4, $acxfr_act_rev, value);
	}

	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public void acxfr_act_rev(long value) {
		setConstNumber(offset + 4, $acxfr_act_rev, value);
	}

	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public void acxfr_act_rev(float value) {
		setConstNumber(offset + 4, $acxfr_act_rev, value);
	}

	/**
	 * Other accounting transfer result No. rev. number 他勘定振替実績ＮＯ改訂番号.<p>
	 *
	 */
	public void acxfr_act_rev(double value) {
		setConstNumber(offset + 4, $acxfr_act_rev, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 5, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 5, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public String acxfr_inst_no() {
		return getConstString(offset + 9, $acxfr_inst_no);
	}

	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public void acxfr_inst_no(String value) {
		setConstString(offset + 9, $acxfr_inst_no, value);
	}


	/**
	 * Actual other accounting transfer date and time 他勘定振替実績日時.<p>
	 *
	 */
	public MCDate acxfr_act_tm() {
		return getConstDate(offset + 10, $acxfr_act_tm);
	}

	/**
	 * Actual other accounting transfer date and time 他勘定振替実績日時.<p>
	 *
	 */
	public void acxfr_act_tm(MCDate value) {
		setConstDate(offset + 10, $acxfr_act_tm, value);
	}


	/**
	 * Other accounting transfer recording date 他勘定振替計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 11, $ac_dt);
	}

	/**
	 * Other accounting transfer recording date 他勘定振替計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 11, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 12, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 12, $can_ac_dt, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 13, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 13, $act_usr_cd, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 14, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 14, $act_dpt_cd, value);
	}


	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 15, $intr_rmrks_upd_flg);
	}

	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 15, $intr_rmrks_upd_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 16, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 16, $intr_rmrks, value);
	}


	/**
	 * Update transaction remarks 取引備考更新.<p>
	 *
	 */
	public boolean trd_rmrks_upd_flg() {
		return getConstBoolean(offset + 17, $trd_rmrks_upd_flg);
	}

	/**
	 * Update transaction remarks 取引備考更新.<p>
	 *
	 */
	public void trd_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 17, $trd_rmrks_upd_flg, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 18, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 18, $trd_rmrks, value);
	}


	/**
	 * Slip issue flg. 伝票発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 19, $prnt_flg);
	}

	/**
	 * Slip issue flg. 伝票発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 19, $prnt_flg, value);
	}


	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 20, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 20, $sub_char1_upd_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}


	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 22, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 22, $sub_char2_upd_flg, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 23, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 23, $sub_char2, value);
	}


	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 24, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 24, $sub_char3_upd_flg, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 25, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 25, $sub_char3, value);
	}


	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber acxfr_inst_upd_cntr() {
		return getConstNumber(offset + 26, $acxfr_inst_upd_cntr);
	}

	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $acxfr_inst_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_inst_upd_cntr(int value) {
		setConstNumber(offset + 26, $acxfr_inst_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_inst_upd_cntr(long value) {
		setConstNumber(offset + 26, $acxfr_inst_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_inst_upd_cntr(float value) {
		setConstNumber(offset + 26, $acxfr_inst_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer order header 他勘定振替指図ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_inst_upd_cntr(double value) {
		setConstNumber(offset + 26, $acxfr_inst_upd_cntr, value);
	}


	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber acxfr_act_upd_cntr() {
		return getConstNumber(offset + 27, $acxfr_act_upd_cntr);
	}

	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $acxfr_act_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_act_upd_cntr(int value) {
		setConstNumber(offset + 27, $acxfr_act_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_act_upd_cntr(long value) {
		setConstNumber(offset + 27, $acxfr_act_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_act_upd_cntr(float value) {
		setConstNumber(offset + 27, $acxfr_act_upd_cntr, value);
	}

	/**
	 * Update counter for other accounting transfer result header 他勘定振替実績ヘッダ更新カウンタ.<p>
	 *
	 */
	public void acxfr_act_upd_cntr(double value) {
		setConstNumber(offset + 27, $acxfr_act_upd_cntr, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 28, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 28, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 29, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 29, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 29, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 29, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 29, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 29, $peg_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			return acxfr_act_rev();
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			return acxfr_inst_upd_cntr();
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			return acxfr_act_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($acxfr_act_tm.equalsIgnoreCase(name)) {
			return acxfr_act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			return acxfr_act_rev();
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			return acxfr_inst_upd_cntr();
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			return acxfr_act_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($acxfr_act_tm.equalsIgnoreCase(name)) {
			return acxfr_act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($acxfr_act_tm.equalsIgnoreCase(name)) {
			acxfr_act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($acxfr_act_rev.equalsIgnoreCase(name)) {
			acxfr_act_rev(value);
			return;
		}
		if ($acxfr_inst_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_inst_upd_cntr(value);
			return;
		}
		if ($acxfr_act_upd_cntr.equalsIgnoreCase(name)) {
			acxfr_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($acxfr_act_tm.equalsIgnoreCase(name)) {
			acxfr_act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

