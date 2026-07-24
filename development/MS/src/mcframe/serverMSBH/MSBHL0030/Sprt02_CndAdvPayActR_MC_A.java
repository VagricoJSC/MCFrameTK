package mcframe.serverMSBH.MSBHL0030;

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
 * ブロック"Sprt02_CndAdvPayAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt02_CndAdvPayActR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public static final String $xrate_base_dt = "xrate_base_dt";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta xrate_base_dt_META = createCommonMeta($xrate_base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Sprt02_CndAdvPayActR> constMetas = new ConstMetaList<Sprt02_CndAdvPayActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			pay_xrate_META,
			xrate_base_dt_META
		},
		new String[][]{
			{
			},
			{
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
	protected Sprt02_CndAdvPayActR_MC_A(ConstMetaList<? extends Sprt02_CndAdvPayActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt02_CndAdvPayActR clone() {
		return (Sprt02_CndAdvPayActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt02_CndAdvPayActR createInstance() {
		return (Sprt02_CndAdvPayActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt02_CndAdvPayActR getValues(String... names) {
		return (Sprt02_CndAdvPayActR) super.getValues(names);
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
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 1, $adv_pay_act_no);
	}

	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 1, $adv_pay_act_no, value);
	}


	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 2, $adv_pay_act_seq);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 2, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 2, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 2, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 2, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 2, $adv_pay_act_seq, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 3, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 3, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 3, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 3, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 3, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 3, $pay_xrate, value);
	}


	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCDate xrate_base_dt() {
		return getConstDate(offset + 4, $xrate_base_dt);
	}

	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public void xrate_base_dt(MCDate value) {
		setConstDate(offset + 4, $xrate_base_dt, value);
	}


	public String getString(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

