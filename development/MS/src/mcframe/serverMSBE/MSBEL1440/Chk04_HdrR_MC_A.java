package mcframe.serverMSBE.MSBEL1440;

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
 * ブロック"Chk04_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk04_HdrR_MC_A extends MCConstRow {

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public static final String $ship_act_rev = "ship_act_rev";
	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
	/**
	 * Delivery note issued 納品伝票発行済.<p>
	 *
	 */
	public static final String $dlv_slip_prnted_flg = "dlv_slip_prnted_flg";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $ship_adv_prnted_flg = "ship_adv_prnted_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public static final String $ship_act_upd_cntr = "ship_act_upd_cntr";


	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_rev_META = createCommonMeta($ship_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_prnted_flg_META = createCommonMeta($dlv_slip_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnted_flg_META = createCommonMeta($ship_adv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_act_upd_cntr_META = createCommonMeta($ship_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk04_HdrR> constMetas = new ConstMetaList<Chk04_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ship_act_no_META,
			ship_act_rev_META,
			dlv_slip_prnt_flg_META,
			ship_adv_prnt_flg_META,
			dlv_slip_prnted_flg_META,
			ship_adv_prnted_flg_META,
			can_flg_META,
			err_flg_META,
			ship_act_upd_cntr_META
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
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ship_act_no, "E"},	// ship_act_no
				{$ship_act_rev, "E"}	// ship_act_rev
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$dlv_slip_prnt_flg, "G"},	// dlv_slip_prnt_flg
				{$ship_adv_prnt_flg, "G"}	// ship_adv_prnt_flg
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
	protected Chk04_HdrR_MC_A(ConstMetaList<? extends Chk04_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_HdrR clone() {
		return (Chk04_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_HdrR createInstance() {
		return (Chk04_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_HdrR getValues(String... names) {
		return (Chk04_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 0, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 0, $ship_act_no, value);
	}


	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public MCNumber ship_act_rev() {
		return getConstNumber(offset + 1, $ship_act_rev);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(MCNumber value) {
		setConstNumber(offset + 1, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(int value) {
		setConstNumber(offset + 1, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(long value) {
		setConstNumber(offset + 1, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(float value) {
		setConstNumber(offset + 1, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(double value) {
		setConstNumber(offset + 1, $ship_act_rev, value);
	}


	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 2, $dlv_slip_prnt_flg);
	}

	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 3, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $ship_adv_prnt_flg, value);
	}


	/**
	 * Delivery note issued 納品伝票発行済.<p>
	 *
	 */
	public boolean dlv_slip_prnted_flg() {
		return getConstBoolean(offset + 4, $dlv_slip_prnted_flg);
	}

	/**
	 * Delivery note issued 納品伝票発行済.<p>
	 *
	 */
	public void dlv_slip_prnted_flg(boolean value) {
		setConstBoolean(offset + 4, $dlv_slip_prnted_flg, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean ship_adv_prnted_flg() {
		return getConstBoolean(offset + 5, $ship_adv_prnted_flg);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void ship_adv_prnted_flg(boolean value) {
		setConstBoolean(offset + 5, $ship_adv_prnted_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 6, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 6, $can_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 7, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 7, $err_flg, value);
	}


	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_act_upd_cntr() {
		return getConstNumber(offset + 8, $ship_act_upd_cntr);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 8, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(int value) {
		setConstNumber(offset + 8, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(long value) {
		setConstNumber(offset + 8, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(float value) {
		setConstNumber(offset + 8, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(double value) {
		setConstNumber(offset + 8, $ship_act_upd_cntr, value);
	}


	public String getString(String name) {
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			return ship_act_upd_cntr();
		}
		return super.getNumber(name);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			return ship_act_upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

