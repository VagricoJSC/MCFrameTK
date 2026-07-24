package mcframe.serverMSBG.MSBGL0210;

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
 * ブロック"Del01_BillD"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Del01_BillDR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public static final String $hdr_dtl_peg = "hdr_dtl_peg";
	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public static final String $parent_bill_d_no = "parent_bill_d_no";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_upd_cntr = "bill_d_upd_cntr";
	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_appl_bal_upd_cntr = "bill_d_appl_bal_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dtl_peg_META = createCommonMeta($hdr_dtl_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bill_d_upd_cntr_META = createCommonMeta($bill_d_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta bill_d_appl_bal_upd_cntr_META = createCommonMeta($bill_d_appl_bal_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Del01_BillDR> constMetas = new ConstMetaList<Del01_BillDR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			hdr_dtl_peg_META,
			grp_seq_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			bill_mng_no_META,
			bill_d_upd_cntr_META,
			bill_d_appl_bal_upd_cntr_META
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
	protected Del01_BillDR_MC_A(ConstMetaList<? extends Del01_BillDR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_BillDR clone() {
		return (Del01_BillDR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_BillDR createInstance() {
		return (Del01_BillDR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_BillDR getValues(String... names) {
		return (Del01_BillDR) super.getValues(names);
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg() {
		return getConstNumber(offset + 2, $hdr_dtl_peg);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(MCNumber value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(int value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(long value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(float value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(double value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}


	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 3, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 4, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 4, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 5, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 5, $parent_bill_d_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 6, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 6, $bill_mng_no, value);
	}


	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_upd_cntr() {
		return getConstNumber(offset + 7, $bill_d_upd_cntr);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 7, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(int value) {
		setConstNumber(offset + 7, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(long value) {
		setConstNumber(offset + 7, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(float value) {
		setConstNumber(offset + 7, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(double value) {
		setConstNumber(offset + 7, $bill_d_upd_cntr, value);
	}


	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_appl_bal_upd_cntr() {
		return getConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(MCNumber value) {
		setConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(int value) {
		setConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(long value) {
		setConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(float value) {
		setConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(double value) {
		setConstNumber(offset + 8, $bill_d_appl_bal_upd_cntr, value);
	}


	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

