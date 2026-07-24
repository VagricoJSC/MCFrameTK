package mcframe.serverMSBE.MSBEL1160;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

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
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public static final String $prov_src_act_typ = "prov_src_act_typ";
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public static final String $prov_act_seq = "prov_act_seq";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public static final String $dlv_prnt_tm = "dlv_prnt_tm";
	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public static final String $prov_upd_cntr = "prov_upd_cntr";
	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_no = "xfr_act_no";
	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public static final String $xfr_upd_cntr = "xfr_upd_cntr";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta prov_act_seq_META = createCommonMeta($prov_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_tm_META = createCommonMeta($dlv_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prov_upd_cntr_META = createCommonMeta($prov_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta xfr_act_no_META = createCommonMeta($xfr_act_no, mcframe.commonMA.meta.MA_META.XFR_ACT_NO);
	public static final MCMeta xfr_upd_cntr_META = createCommonMeta($xfr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			prov_src_act_typ_META,
			prov_act_no_META,
			prov_act_seq_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			trn_typ_META,
			dlv_prnt_flg_META,
			dlv_prnt_tm_META,
			prov_upd_cntr_META,
			xfr_act_no_META,
			xfr_upd_cntr_META,
			rtn_sts_typ_META
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 2, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 2, $prov_src_act_typ, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 3, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 3, $prov_act_no, value);
	}


	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public MCNumber prov_act_seq() {
		return getConstNumber(offset + 4, $prov_act_seq);
	}

	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public void prov_act_seq(MCNumber value) {
		setConstNumber(offset + 4, $prov_act_seq, value);
	}

	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public void prov_act_seq(int value) {
		setConstNumber(offset + 4, $prov_act_seq, value);
	}

	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public void prov_act_seq(long value) {
		setConstNumber(offset + 4, $prov_act_seq, value);
	}

	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public void prov_act_seq(float value) {
		setConstNumber(offset + 4, $prov_act_seq, value);
	}

	/**
	 * Supply result sequence number 支給実績連番.<p>
	 *
	 */
	public void prov_act_seq(double value) {
		setConstNumber(offset + 4, $prov_act_seq, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 5, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 5, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 6, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 6, $dlv_slip_d_no, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 7, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 7, $trn_typ, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 8, $dlv_prnt_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 8, $dlv_prnt_flg, value);
	}


	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public MCDate dlv_prnt_tm() {
		return getConstDate(offset + 9, $dlv_prnt_tm);
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public void dlv_prnt_tm(MCDate value) {
		setConstDate(offset + 9, $dlv_prnt_tm, value);
	}


	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public MCNumber prov_upd_cntr() {
		return getConstNumber(offset + 10, $prov_upd_cntr);
	}

	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public void prov_upd_cntr(MCNumber value) {
		setConstNumber(offset + 10, $prov_upd_cntr, value);
	}

	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public void prov_upd_cntr(int value) {
		setConstNumber(offset + 10, $prov_upd_cntr, value);
	}

	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public void prov_upd_cntr(long value) {
		setConstNumber(offset + 10, $prov_upd_cntr, value);
	}

	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public void prov_upd_cntr(float value) {
		setConstNumber(offset + 10, $prov_upd_cntr, value);
	}

	/**
	 * Update counter (Supply result) 更新カウンタ（支給実績）.<p>
	 *
	 */
	public void prov_upd_cntr(double value) {
		setConstNumber(offset + 10, $prov_upd_cntr, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return getConstString(offset + 11, $xfr_act_no);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		setConstString(offset + 11, $xfr_act_no, value);
	}


	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public MCNumber xfr_upd_cntr() {
		return getConstNumber(offset + 12, $xfr_upd_cntr);
	}

	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public void xfr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 12, $xfr_upd_cntr, value);
	}

	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public void xfr_upd_cntr(int value) {
		setConstNumber(offset + 12, $xfr_upd_cntr, value);
	}

	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public void xfr_upd_cntr(long value) {
		setConstNumber(offset + 12, $xfr_upd_cntr, value);
	}

	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public void xfr_upd_cntr(float value) {
		setConstNumber(offset + 12, $xfr_upd_cntr, value);
	}

	/**
	 * Update counter (Movement result) 更新カウンタ（移動実績）.<p>
	 *
	 */
	public void xfr_upd_cntr(double value) {
		setConstNumber(offset + 12, $xfr_upd_cntr, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 13, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 13, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			return prov_act_seq();
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			return prov_upd_cntr();
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			return xfr_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_prnt_tm.equalsIgnoreCase(name)) {
			return dlv_prnt_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			return prov_act_seq();
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			return prov_upd_cntr();
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			return xfr_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_prnt_tm.equalsIgnoreCase(name)) {
			return dlv_prnt_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_prnt_tm.equalsIgnoreCase(name)) {
			dlv_prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prov_act_seq.equalsIgnoreCase(name)) {
			prov_act_seq(value);
			return;
		}
		if ($prov_upd_cntr.equalsIgnoreCase(name)) {
			prov_upd_cntr(value);
			return;
		}
		if ($xfr_upd_cntr.equalsIgnoreCase(name)) {
			xfr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_prnt_tm.equalsIgnoreCase(name)) {
			dlv_prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

