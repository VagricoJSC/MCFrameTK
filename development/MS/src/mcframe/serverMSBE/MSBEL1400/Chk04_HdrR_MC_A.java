package mcframe.serverMSBE.MSBEL1400;

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
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public static final String $ship_inst_rev = "ship_inst_rev";
	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public static final String $ship_inst_upd_cntr = "ship_inst_upd_cntr";
	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public static final String $dlv_prnt_btn_flg = "dlv_prnt_btn_flg";
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public static final String $adv_prnt_btn_flg = "adv_prnt_btn_flg";
	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public static final String $inst_prnt_btn_flg = "inst_prnt_btn_flg";
	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public static final String $pick_prnt_btn_flg = "pick_prnt_btn_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";


	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_rev_META = createCommonMeta($ship_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_inst_upd_cntr_META = createCommonMeta($ship_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta dlv_prnt_btn_flg_META = createCommonMeta($dlv_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnt_btn_flg_META = createCommonMeta($adv_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_btn_flg_META = createCommonMeta($inst_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_prnt_btn_flg_META = createCommonMeta($pick_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Chk04_HdrR> constMetas = new ConstMetaList<Chk04_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trn_typ_META,
			ship_inst_no_META,
			ship_inst_rev_META,
			ship_inst_upd_cntr_META,
			dlv_prnt_btn_flg_META,
			adv_prnt_btn_flg_META,
			inst_prnt_btn_flg_META,
			pick_prnt_btn_flg_META,
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
				{$ship_inst_no, "E"},	// ship_inst_no
				{$ship_inst_rev, "E"}	// ship_inst_rev
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
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 0, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 0, $trn_typ, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 1, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 1, $ship_inst_no, value);
	}


	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public MCNumber ship_inst_rev() {
		return getConstNumber(offset + 2, $ship_inst_rev);
	}

	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(MCNumber value) {
		setConstNumber(offset + 2, $ship_inst_rev, value);
	}

	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(int value) {
		setConstNumber(offset + 2, $ship_inst_rev, value);
	}

	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(long value) {
		setConstNumber(offset + 2, $ship_inst_rev, value);
	}

	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(float value) {
		setConstNumber(offset + 2, $ship_inst_rev, value);
	}

	/**
	 * Shipping order rev. number 出荷指図改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(double value) {
		setConstNumber(offset + 2, $ship_inst_rev, value);
	}


	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_inst_upd_cntr() {
		return getConstNumber(offset + 3, $ship_inst_upd_cntr);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(int value) {
		setConstNumber(offset + 3, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(long value) {
		setConstNumber(offset + 3, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(float value) {
		setConstNumber(offset + 3, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(double value) {
		setConstNumber(offset + 3, $ship_inst_upd_cntr, value);
	}


	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public boolean dlv_prnt_btn_flg() {
		return getConstBoolean(offset + 4, $dlv_prnt_btn_flg);
	}

	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public void dlv_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 4, $dlv_prnt_btn_flg, value);
	}


	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public boolean adv_prnt_btn_flg() {
		return getConstBoolean(offset + 5, $adv_prnt_btn_flg);
	}

	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public void adv_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 5, $adv_prnt_btn_flg, value);
	}


	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public boolean inst_prnt_btn_flg() {
		return getConstBoolean(offset + 6, $inst_prnt_btn_flg);
	}

	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public void inst_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 6, $inst_prnt_btn_flg, value);
	}


	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public boolean pick_prnt_btn_flg() {
		return getConstBoolean(offset + 7, $pick_prnt_btn_flg);
	}

	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public void pick_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 7, $pick_prnt_btn_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 8, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 8, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 9, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 9, $peg_no, value);
	}


	public String getString(String name) {
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_btn_flg();
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return adv_prnt_btn_flg();
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			return inst_prnt_btn_flg();
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pick_prnt_btn_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_btn_flg();
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return adv_prnt_btn_flg();
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			return inst_prnt_btn_flg();
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pick_prnt_btn_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_prnt_btn_flg(value);
			return;
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			adv_prnt_btn_flg(value);
			return;
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			inst_prnt_btn_flg(value);
			return;
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			pick_prnt_btn_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_prnt_btn_flg(value);
			return;
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			adv_prnt_btn_flg(value);
			return;
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			inst_prnt_btn_flg(value);
			return;
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			pick_prnt_btn_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

