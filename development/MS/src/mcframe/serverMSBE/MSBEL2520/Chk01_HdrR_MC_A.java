package mcframe.serverMSBE.MSBEL2520;

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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_dtl_peg_no = "hdr_dtl_peg_no";
	public static final String $stk_xfr = "stk_xfr";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public static final String $io_upd_flg = "io_upd_flg";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public static final String $old_loc_cd = "old_loc_cd";

	public static final String $stk_xfr_act_no = $stk_xfr + ".stk_xfr_act_no";
	public static final String $trd_cd = $stk_xfr + ".trd_cd";
	public static final String $trd_ptn_typ = $stk_xfr + ".trd_ptn_typ";
	public static final String $loc_cd = $stk_xfr + ".loc_cd";
	public static final String $wg_cd = $stk_xfr + ".wg_cd";
	public static final String $act_usr_cd = $stk_xfr + ".act_usr_cd";
	public static final String $act_dpt_cd = $stk_xfr + ".act_dpt_cd";
	public static final String $stk_xfr_act_tm = $stk_xfr + ".stk_xfr_act_tm";
	public static final String $ac_dt = $stk_xfr + ".ac_dt";
	public static final String $intr_rmrks = $stk_xfr + ".intr_rmrks";
	public static final String $trd_rmrks = $stk_xfr + ".trd_rmrks";
	public static final String $sub_char1 = $stk_xfr + ".sub_char1";
	public static final String $sub_char2 = $stk_xfr + ".sub_char2";
	public static final String $sub_char3 = $stk_xfr + ".sub_char3";
	public static final String $stk_xfr_rsn_cd = $stk_xfr + ".stk_xfr_rsn_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_dtl_peg_no_META = createCommonMeta($hdr_dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_xfr_META = createInnerRowMeta($stk_xfr, mcframe.serverMS.dbc.MST_STK_XFR_ACT_R.class);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_upd_flg_META = createCommonMeta($io_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta old_loc_cd_META = createCommonMeta($old_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_dtl_peg_no_META,
			stk_xfr_META,
			str_ln_tgt_flg_META,
			sppl_cd_META,
			can_ac_dt_META,
			upd_cntr_META,
			prnt_flg_META,
			io_upd_flg_META,
			err_flg_META,
			dlv_slip_no_META,
			data_crud_typ_META,
			old_loc_cd_META
		},
		new String[][]{
			{
				"stk_xfr_act_no",
				"trd_cd",
				"trd_ptn_typ",
				"loc_cd",
				"wg_cd",
				"act_usr_cd",
				"act_dpt_cd",
				"stk_xfr_act_tm",
				"ac_dt",
				"intr_rmrks",
				"trd_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"stk_xfr_rsn_cd"
			},
			{
				$stk_xfr_act_no,
				$trd_cd,
				$trd_ptn_typ,
				$loc_cd,
				$wg_cd,
				$act_usr_cd,
				$act_dpt_cd,
				$stk_xfr_act_tm,
				$ac_dt,
				$intr_rmrks,
				$trd_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$stk_xfr_rsn_cd
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$stk_xfr + ".stk_xfr_act_no", "E"}	// stk_xfr.stk_xfr_act_no
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$hdr_dtl_peg_no, "E"},	// hdr_dtl_peg_no
				{$stk_xfr + ".trd_cd", "E"},	// stk_xfr.trd_cd
				{$stk_xfr + ".trd_ptn_typ", "E"},	// stk_xfr.trd_ptn_typ
				{$stk_xfr + ".loc_cd", "E"},	// stk_xfr.loc_cd
				{$stk_xfr + ".wg_cd", "E"},	// stk_xfr.wg_cd
				{$stk_xfr + ".stk_xfr_act_tm", "E"},	// stk_xfr.stk_xfr_act_tm
				{$stk_xfr + ".ac_dt", "E"},	// stk_xfr.ac_dt
				{$stk_xfr + ".stk_xfr_rsn_cd", "E"}	// stk_xfr.stk_xfr_rsn_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$stk_xfr + ".stk_xfr_act_tm", "tmBfToday"},	// stk_xfr.stk_xfr_act_tm
				{$stk_xfr + ".ac_dt", "bfToday"}	// stk_xfr.ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_xfr + ".trd_ptn_typ", "MAC_TRD_PTN_TYP"}	// stk_xfr.trd_ptn_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$stk_xfr + ".trd_cd", "MA.MAUAL0010.Trd"},	// stk_xfr.trd_cd
				{$stk_xfr + ".loc_cd", "MA.MAUAL0010.Loc"},	// stk_xfr.loc_cd
				{$stk_xfr + ".wg_cd", "MA.MAUAL0010.Wg"},	// stk_xfr.wg_cd
				{$stk_xfr + ".act_usr_cd", "MA.MAUAL0010.Usr"},	// stk_xfr.act_usr_cd
				{$stk_xfr + ".act_dpt_cd", "MA.MAUAL0010.Dpt"},	// stk_xfr.act_dpt_cd
				{$stk_xfr + ".stk_xfr_rsn_cd", "MA.MAUAL0010.StkXfrBizRsn"}	// stk_xfr.stk_xfr_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$stk_xfr + ".loc_cd", "str_ln_tgt_flg;sppl_cd"}	// stk_xfr.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$stk_xfr + ".loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM"},	// stk_xfr.loc_cd
				{$stk_xfr + ".act_dpt_cd", "ac_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"}	// stk_xfr.act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$stk_xfr + ".loc_cd", "loc_is_srch_typ"},	// stk_xfr.loc_cd
				{$stk_xfr + ".act_dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// stk_xfr.act_dpt_cd
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_STK_XFR_ACT_R stk_xfr(){
		return (mcframe.serverMS.dbc.MST_STK_XFR_ACT_R) getConstInnerRow(offset + 2, $stk_xfr);
	}
	
	public void stk_xfr(mcframe.serverMS.dbc.MST_STK_XFR_ACT_R row){
		setConstInnerRow(offset + 2, $stk_xfr, row);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 3, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 3, $str_ln_tgt_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 4, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 4, $sppl_cd, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 5, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 5, $can_ac_dt, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 6, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}


	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 7, $prnt_flg);
	}

	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $prnt_flg, value);
	}


	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public boolean io_upd_flg() {
		return getConstBoolean(offset + 8, $io_upd_flg);
	}

	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public void io_upd_flg(boolean value) {
		setConstBoolean(offset + 8, $io_upd_flg, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 9, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 9, $err_flg, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 10, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 10, $dlv_slip_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 11, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 11, $data_crud_typ, value);
	}


	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public String old_loc_cd() {
		return getConstString(offset + 12, $old_loc_cd);
	}

	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public void old_loc_cd(String value) {
		setConstString(offset + 12, $old_loc_cd, value);
	}


	public String getString(String name) {
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			return old_loc_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			return io_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			return old_loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			return io_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			old_loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			io_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			old_loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			io_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($stk_xfr.equalsIgnoreCase(name)) {
			return stk_xfr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($stk_xfr.equalsIgnoreCase(name)) {
			stk_xfr(
				((MCContainerMeta) stk_xfr_META).castInnerRow(mcframe.serverMS.dbc.MST_STK_XFR_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public String stk_xfr_act_no() {
		return stk_xfr().stk_xfr_act_no();
	}

	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public void stk_xfr_act_no(String value) {
		stk_xfr().stk_xfr_act_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return stk_xfr().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		stk_xfr().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return stk_xfr().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		stk_xfr().trd_ptn_typ(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return stk_xfr().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		stk_xfr().loc_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return stk_xfr().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		stk_xfr().wg_cd(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return stk_xfr().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		stk_xfr().act_usr_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return stk_xfr().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		stk_xfr().act_dpt_cd(value);
	}

	/**
	 * Actual inventory transfer date and time 在庫振替実績日時.<p>
	 *
	 */
	public MCDate stk_xfr_act_tm() {
		return stk_xfr().stk_xfr_act_tm();
	}

	/**
	 * Actual inventory transfer date and time 在庫振替実績日時.<p>
	 *
	 */
	public void stk_xfr_act_tm(MCDate value) {
		stk_xfr().stk_xfr_act_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return stk_xfr().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		stk_xfr().ac_dt(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return stk_xfr().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		stk_xfr().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return stk_xfr().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		stk_xfr().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return stk_xfr().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		stk_xfr().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return stk_xfr().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		stk_xfr().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return stk_xfr().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		stk_xfr().sub_char3(value);
	}

	/**
	 * Inventory transfer reason cd. 在庫振替理由ＣＤ.<p>
	 *
	 */
	public String stk_xfr_rsn_cd() {
		return stk_xfr().stk_xfr_rsn_cd();
	}

	/**
	 * Inventory transfer reason cd. 在庫振替理由ＣＤ.<p>
	 *
	 */
	public void stk_xfr_rsn_cd(String value) {
		stk_xfr().stk_xfr_rsn_cd(value);
	}

}

