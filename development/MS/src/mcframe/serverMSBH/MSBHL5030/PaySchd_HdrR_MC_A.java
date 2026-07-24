package mcframe.serverMSBH.MSBHL5030;

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
 * ブロック"PaySchd_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_HdrR_MC_A extends MCConstRow {

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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	public static final String $pay_chk = "pay_chk";
	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	/**
	 * Not reacquire payment result 支払実績再取得しない.<p>
	 *
	 */
	public static final String $pay_act_not_ref_flg = "pay_act_not_ref_flg";
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public static final String $aprv_rvrs_flg = "aprv_rvrs_flg";

	public static final String $pay_chk_mng_no = $pay_chk + ".pay_chk_mng_no";
	public static final String $pay_chk_no = $pay_chk + ".pay_chk_no";
	public static final String $reg_dt = $pay_chk + ".reg_dt";
	public static final String $bsppl_cd = $pay_chk + ".bsppl_cd";
	public static final String $bsppl_usr_cd = $pay_chk + ".bsppl_usr_cd";
	public static final String $bsppl_dpt_cd = $pay_chk + ".bsppl_dpt_cd";
	public static final String $purc_act_no = $pay_chk + ".purc_act_no";
	public static final String $rcpt_iv_mng_no = $pay_chk + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $pay_chk + ".rcpt_iv_no";
	public static final String $wrk_no = $pay_chk + ".wrk_no";
	public static final String $pay_spot_flg = $pay_chk + ".pay_spot_flg";
	public static final String $bsppl_cl_day = $pay_chk + ".bsppl_cl_day";
	public static final String $bsppl_cl_dt = $pay_chk + ".bsppl_cl_dt";
	public static final String $trd_cur_cd = $pay_chk + ".trd_cur_cd";
	public static final String $pay_ntc_rev = $pay_chk + ".pay_ntc_rev";
	public static final String $pay_xrate = $pay_chk + ".pay_xrate";
	public static final String $amt = $pay_chk + ".amt";
	public static final String $com_paid = $pay_chk + ".com_paid";
	public static final String $com_paid_tax_amt = $pay_chk + ".com_paid_tax_amt";
	public static final String $pay_sts_typ = $pay_chk + ".pay_sts_typ";
	public static final String $batch_pay_schd_cl_flg = $pay_chk + ".batch_pay_schd_cl_flg";
	public static final String $man_reg_flg = $pay_chk + ".man_reg_flg";
	public static final String $aprv_flg = $pay_chk + ".aprv_flg";
	public static final String $aprv_no = $pay_chk + ".aprv_no";
	public static final String $aprv_sts_typ = $pay_chk + ".aprv_sts_typ";
	public static final String $pay_schd_d_print_rmrks = $pay_chk + ".pay_schd_d_print_rmrks";
	public static final String $intr_rmrks = $pay_chk + ".intr_rmrks";
	public static final String $sub_char1 = $pay_chk + ".sub_char1";
	public static final String $sub_char2 = $pay_chk + ".sub_char2";
	public static final String $sub_char3 = $pay_chk + ".sub_char3";
	public static final String $upd_cntr = $pay_chk + ".upd_cntr";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_chk_META = createInnerRowMeta($pay_chk, mcframe.serverMS.dbc.MST_PAY_CHK_R.class);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_act_not_ref_flg_META = createCommonMeta($pay_act_not_ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_rvrs_flg_META = createCommonMeta($aprv_rvrs_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PaySchd_HdrR> constMetas = new ConstMetaList<PaySchd_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			pay_chk_META,
			upd_cntr_chk_flg_META,
			purc_interim_cl_flg_META,
			pay_act_not_ref_flg_META,
			aprv_rvrs_flg_META
		},
		new String[][]{
			{
				"pay_chk_mng_no",
				"pay_chk_no",
				"reg_dt",
				"bsppl_cd",
				"bsppl_usr_cd",
				"bsppl_dpt_cd",
				"purc_act_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"wrk_no",
				"pay_spot_flg",
				"bsppl_cl_day",
				"bsppl_cl_dt",
				"trd_cur_cd",
				"pay_ntc_rev",
				"pay_xrate",
				"amt",
				"com_paid",
				"com_paid_tax_amt",
				"pay_sts_typ",
				"batch_pay_schd_cl_flg",
				"man_reg_flg",
				"aprv_flg",
				"aprv_no",
				"aprv_sts_typ",
				"pay_schd_d_print_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"upd_cntr"
			},
			{
				$pay_chk_mng_no,
				$pay_chk_no,
				$reg_dt,
				$bsppl_cd,
				$bsppl_usr_cd,
				$bsppl_dpt_cd,
				$purc_act_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$wrk_no,
				$pay_spot_flg,
				$bsppl_cl_day,
				$bsppl_cl_dt,
				$trd_cur_cd,
				$pay_ntc_rev,
				$pay_xrate,
				$amt,
				$com_paid,
				$com_paid_tax_amt,
				$pay_sts_typ,
				$batch_pay_schd_cl_flg,
				$man_reg_flg,
				$aprv_flg,
				$aprv_no,
				$aprv_sts_typ,
				$pay_schd_d_print_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$upd_cntr
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
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
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$pay_chk + ".bsppl_cd", "MA.MAUAL0010.Bp"},	// pay_chk.bsppl_cd
				{$pay_chk + ".bsppl_usr_cd", "MA.MAUAL0010.Usr"},	// pay_chk.bsppl_usr_cd
				{$pay_chk + ".bsppl_dpt_cd", "MA.MAUAL0010.Dpt"},	// pay_chk.bsppl_dpt_cd
				{$pay_chk + ".trd_cur_cd", "MA.MAUAL0010.Cur"}	// pay_chk.trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$pay_chk + ".bsppl_cd", "purc_interim_cl_flg"}	// pay_chk.bsppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pay_chk + ".bsppl_cd", "MAC_BP_IS_SRCH_TYP.BSPPL"},	// pay_chk.bsppl_cd
				{$pay_chk + ".bsppl_usr_cd", "true"},	// pay_chk.bsppl_usr_cd
				{$pay_chk + ".bsppl_dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP"}	// pay_chk.bsppl_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pay_chk + ".bsppl_cd", "bp_is_srch_typ"},	// pay_chk.bsppl_cd
				{$pay_chk + ".bsppl_usr_cd", "referring_usr_acl_flg"},	// pay_chk.bsppl_usr_cd
				{$pay_chk + ".bsppl_dpt_cd", "dpt_is_srch_typ"}	// pay_chk.bsppl_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected PaySchd_HdrR_MC_A(ConstMetaList<? extends PaySchd_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_HdrR clone() {
		return (PaySchd_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_HdrR createInstance() {
		return (PaySchd_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_HdrR getValues(String... names) {
		return (PaySchd_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
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


	public mcframe.serverMS.dbc.MST_PAY_CHK_R pay_chk(){
		return (mcframe.serverMS.dbc.MST_PAY_CHK_R) getConstInnerRow(offset + 3, $pay_chk);
	}
	
	public void pay_chk(mcframe.serverMS.dbc.MST_PAY_CHK_R row){
		setConstInnerRow(offset + 3, $pay_chk, row);
	}


	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 4, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 4, $upd_cntr_chk_flg, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 5, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_interim_cl_flg, value);
	}


	/**
	 * Not reacquire payment result 支払実績再取得しない.<p>
	 *
	 */
	public boolean pay_act_not_ref_flg() {
		return getConstBoolean(offset + 6, $pay_act_not_ref_flg);
	}

	/**
	 * Not reacquire payment result 支払実績再取得しない.<p>
	 *
	 */
	public void pay_act_not_ref_flg(boolean value) {
		setConstBoolean(offset + 6, $pay_act_not_ref_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_rvrs_flg() {
		return getConstBoolean(offset + 7, $aprv_rvrs_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_rvrs_flg(boolean value) {
		setConstBoolean(offset + 7, $aprv_rvrs_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			return pay_act_not_ref_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			return pay_act_not_ref_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			pay_act_not_ref_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			pay_act_not_ref_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pay_chk.equalsIgnoreCase(name)) {
			return pay_chk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_chk.equalsIgnoreCase(name)) {
			pay_chk(
				((MCContainerMeta) pay_chk_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_CHK_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return pay_chk().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		pay_chk().pay_chk_mng_no(value);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return pay_chk().pay_chk_no();
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		pay_chk().pay_chk_no(value);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return pay_chk().reg_dt();
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		pay_chk().reg_dt(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return pay_chk().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		pay_chk().bsppl_cd(value);
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public String bsppl_usr_cd() {
		return pay_chk().bsppl_usr_cd();
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		pay_chk().bsppl_usr_cd(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return pay_chk().bsppl_dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		pay_chk().bsppl_dpt_cd(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pay_chk().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pay_chk().purc_act_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return pay_chk().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		pay_chk().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return pay_chk().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		pay_chk().rcpt_iv_no(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return pay_chk().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		pay_chk().wrk_no(value);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return pay_chk().pay_spot_flg();
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		pay_chk().pay_spot_flg(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return pay_chk().bsppl_cl_day();
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return pay_chk().bsppl_cl_dt();
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		pay_chk().bsppl_cl_dt(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pay_chk().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pay_chk().trd_cur_cd(value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return pay_chk().pay_ntc_rev();
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		pay_chk().pay_ntc_rev(value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		pay_chk().pay_ntc_rev(value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		pay_chk().pay_ntc_rev(value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		pay_chk().pay_ntc_rev(value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		pay_chk().pay_ntc_rev(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return pay_chk().pay_xrate();
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return pay_chk().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		pay_chk().amt(value);
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public MCNumber com_paid() {
		return pay_chk().com_paid();
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		pay_chk().com_paid(value);
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public void com_paid(int value) {
		pay_chk().com_paid(value);
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public void com_paid(long value) {
		pay_chk().com_paid(value);
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public void com_paid(float value) {
		pay_chk().com_paid(value);
	}

	/**
	 * Fee 手数料.<p>
	 *
	 */
	public void com_paid(double value) {
		pay_chk().com_paid(value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public MCNumber com_paid_tax_amt() {
		return pay_chk().com_paid_tax_amt();
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(MCNumber value) {
		pay_chk().com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(int value) {
		pay_chk().com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(long value) {
		pay_chk().com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(float value) {
		pay_chk().com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(double value) {
		pay_chk().com_paid_tax_amt(value);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return pay_chk().pay_sts_typ();
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		pay_chk().pay_sts_typ(value);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return pay_chk().batch_pay_schd_cl_flg();
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		pay_chk().batch_pay_schd_cl_flg(value);
	}

	/**
	 * Manual entry マニュアル登録.<p>
	 *
	 */
	public boolean man_reg_flg() {
		return pay_chk().man_reg_flg();
	}

	/**
	 * Manual entry マニュアル登録.<p>
	 *
	 */
	public void man_reg_flg(boolean value) {
		pay_chk().man_reg_flg(value);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return pay_chk().aprv_flg();
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		pay_chk().aprv_flg(value);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return pay_chk().aprv_no();
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		pay_chk().aprv_no(value);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return pay_chk().aprv_sts_typ();
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		pay_chk().aprv_sts_typ(value);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return pay_chk().pay_schd_d_print_rmrks();
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		pay_chk().pay_schd_d_print_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return pay_chk().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pay_chk().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pay_chk().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pay_chk().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pay_chk().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pay_chk().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pay_chk().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pay_chk().sub_char3(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return pay_chk().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		pay_chk().upd_cntr(value);
	}

}

