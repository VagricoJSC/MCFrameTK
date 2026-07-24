package mcframe.serverMSBD.MSBDL5120;

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
 * ブロック"Prms_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prms_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_no = "prms_rcpt_no";
	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public static final String $prms_rcpt_rev = "prms_rcpt_rev";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Receipt schedule applied 入荷予定反映済.<p>
	 *
	 */
	public static final String $arr_schd_refl_flg = "arr_schd_refl_flg";
	/**
	 * Receipt schedule applied date 入荷予定反映日.<p>
	 *
	 */
	public static final String $arr_schd_refl_dt = "arr_schd_refl_dt";
	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public static final String $prms_rcpt_dt = "prms_rcpt_dt";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public static final String $screen_crct_flg = "screen_crct_flg";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_print_flg = "dlv_slip_print_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_print_flg = "purc_ddlv_dlv_slip_print_flg";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_grp_no = "prms_rcpt_grp_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_no_META = createCommonMeta($prms_rcpt_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_NO);
	public static final MCMeta prms_rcpt_rev_META = createCommonMeta($prms_rcpt_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta arr_schd_refl_flg_META = createCommonMeta($arr_schd_refl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_refl_dt_META = createCommonMeta($arr_schd_refl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_rcpt_dt_META = createCommonMeta($prms_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RCPT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR3);
	public static final MCMeta screen_crct_flg_META = createCommonMeta($screen_crct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_print_flg_META = createCommonMeta($dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_slip_print_flg_META = createCommonMeta($purc_ddlv_dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_grp_no_META = createCommonMeta($prms_rcpt_grp_no, mcframe.commonMS.meta.MS_META.PRMS_RCPT_GRP_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);

	protected static final ConstMetaList<Prms_Chk01_HdrR> constMetas = new ConstMetaList<Prms_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			prms_rcpt_no_META,
			prms_rcpt_rev_META,
			po_d_no_META,
			arr_schd_refl_flg_META,
			arr_schd_refl_dt_META,
			prms_rcpt_dt_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			screen_crct_flg_META,
			edi_flg_META,
			is_src_batch_flg_META,
			dlv_slip_print_flg_META,
			purc_ddlv_dlv_slip_print_flg_META,
			indiv_prnt_flg_META,
			prms_rcpt_grp_no_META,
			po_no_META
		},
		new String[][]{
			{
			},
			{
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
	protected Prms_Chk01_HdrR_MC_A(ConstMetaList<? extends Prms_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prms_Chk01_HdrR clone() {
		return (Prms_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prms_Chk01_HdrR createInstance() {
		return (Prms_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prms_Chk01_HdrR getValues(String... names) {
		return (Prms_Chk01_HdrR) super.getValues(names);
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
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
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
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 3, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 3, $prms_rcpt_no, value);
	}


	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public MCNumber prms_rcpt_rev() {
		return getConstNumber(offset + 4, $prms_rcpt_rev);
	}

	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public void prms_rcpt_rev(MCNumber value) {
		setConstNumber(offset + 4, $prms_rcpt_rev, value);
	}

	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public void prms_rcpt_rev(int value) {
		setConstNumber(offset + 4, $prms_rcpt_rev, value);
	}

	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public void prms_rcpt_rev(long value) {
		setConstNumber(offset + 4, $prms_rcpt_rev, value);
	}

	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public void prms_rcpt_rev(float value) {
		setConstNumber(offset + 4, $prms_rcpt_rev, value);
	}

	/**
	 * Order promising result received rev. number 納期回答受領改訂番号.<p>
	 *
	 */
	public void prms_rcpt_rev(double value) {
		setConstNumber(offset + 4, $prms_rcpt_rev, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 5, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 5, $po_d_no, value);
	}


	/**
	 * Receipt schedule applied 入荷予定反映済.<p>
	 *
	 */
	public boolean arr_schd_refl_flg() {
		return getConstBoolean(offset + 6, $arr_schd_refl_flg);
	}

	/**
	 * Receipt schedule applied 入荷予定反映済.<p>
	 *
	 */
	public void arr_schd_refl_flg(boolean value) {
		setConstBoolean(offset + 6, $arr_schd_refl_flg, value);
	}


	/**
	 * Receipt schedule applied date 入荷予定反映日.<p>
	 *
	 */
	public MCDate arr_schd_refl_dt() {
		return getConstDate(offset + 7, $arr_schd_refl_dt);
	}

	/**
	 * Receipt schedule applied date 入荷予定反映日.<p>
	 *
	 */
	public void arr_schd_refl_dt(MCDate value) {
		setConstDate(offset + 7, $arr_schd_refl_dt, value);
	}


	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public MCDate prms_rcpt_dt() {
		return getConstDate(offset + 8, $prms_rcpt_dt);
	}

	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public void prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 8, $prms_rcpt_dt, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 9, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 9, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 10, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 10, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 11, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 11, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 12, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 12, $sub_char3, value);
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
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 14, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 14, $edi_flg, value);
	}


	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 15, $is_src_batch_flg);
	}

	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 15, $is_src_batch_flg, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_print_flg() {
		return getConstBoolean(offset + 16, $dlv_slip_print_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 16, $dlv_slip_print_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean purc_ddlv_dlv_slip_print_flg() {
		return getConstBoolean(offset + 17, $purc_ddlv_dlv_slip_print_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 17, $purc_ddlv_dlv_slip_print_flg, value);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 18, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 18, $indiv_prnt_flg, value);
	}


	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public String prms_rcpt_grp_no() {
		return getConstString(offset + 19, $prms_rcpt_grp_no);
	}

	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public void prms_rcpt_grp_no(String value) {
		setConstString(offset + 19, $prms_rcpt_grp_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 20, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 20, $po_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			return prms_rcpt_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($arr_schd_refl_dt.equalsIgnoreCase(name)) {
			return arr_schd_refl_dt();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			return arr_schd_refl_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			return prms_rcpt_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($arr_schd_refl_dt.equalsIgnoreCase(name)) {
			return arr_schd_refl_dt();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			return arr_schd_refl_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($arr_schd_refl_dt.equalsIgnoreCase(name)) {
			arr_schd_refl_dt(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			arr_schd_refl_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_rcpt_rev.equalsIgnoreCase(name)) {
			prms_rcpt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($arr_schd_refl_dt.equalsIgnoreCase(name)) {
			arr_schd_refl_dt(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			arr_schd_refl_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

