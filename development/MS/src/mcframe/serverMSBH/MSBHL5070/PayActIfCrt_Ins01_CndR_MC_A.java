package mcframe.serverMSBH.MSBHL5070;

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
 * ブロック"PayActIfCrt_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PayActIfCrt_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	/**
	 * AP exchange rate revaluation history No. 債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public static final String $ap_xrate_rev_his_no = "ap_xrate_rev_his_no";
	/**
	 * Reference AP exchange rate revaluation history No. 参照債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public static final String $ref_ap_xrate_rev_his_no = "ref_ap_xrate_rev_his_no";


	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ap_xrate_rev_his_no_META = createCommonMeta($ap_xrate_rev_his_no, mcframe.commonMA.meta.MA_META.AP_XRATE_REV_HIST_NO);
	public static final MCMeta ref_ap_xrate_rev_his_no_META = createCommonMeta($ref_ap_xrate_rev_his_no, mcframe.commonMA.meta.MA_META.AP_XRATE_REV_HIST_NO);

	protected static final ConstMetaList<PayActIfCrt_Ins01_CndR> constMetas = new ConstMetaList<PayActIfCrt_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_act_d_no_META,
			pay_act_d_seq_META,
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			ap_xrate_rev_his_no_META,
			ref_ap_xrate_rev_his_no_META
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
	protected PayActIfCrt_Ins01_CndR_MC_A(ConstMetaList<? extends PayActIfCrt_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayActIfCrt_Ins01_CndR clone() {
		return (PayActIfCrt_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayActIfCrt_Ins01_CndR createInstance() {
		return (PayActIfCrt_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayActIfCrt_Ins01_CndR getValues(String... names) {
		return (PayActIfCrt_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 0, $pay_act_d_no);
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 0, $pay_act_d_no, value);
	}


	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 1, $pay_act_d_seq);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}


	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 2, $adv_pay_act_no);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 2, $adv_pay_act_no, value);
	}


	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 3, $adv_pay_act_seq);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 3, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 3, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 3, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 3, $adv_pay_act_seq, value);
	}


	/**
	 * AP exchange rate revaluation history No. 債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public String ap_xrate_rev_his_no() {
		return getConstString(offset + 4, $ap_xrate_rev_his_no);
	}

	/**
	 * AP exchange rate revaluation history No. 債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public void ap_xrate_rev_his_no(String value) {
		setConstString(offset + 4, $ap_xrate_rev_his_no, value);
	}


	/**
	 * Reference AP exchange rate revaluation history No. 参照債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public String ref_ap_xrate_rev_his_no() {
		return getConstString(offset + 5, $ref_ap_xrate_rev_his_no);
	}

	/**
	 * Reference AP exchange rate revaluation history No. 参照債務為替レート評価替履歴ＮＯ.<p>
	 *
	 */
	public void ref_ap_xrate_rev_his_no(String value) {
		setConstString(offset + 5, $ref_ap_xrate_rev_his_no, value);
	}


	public String getString(String name) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ap_xrate_rev_his_no();
		}
		if ($ref_ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ref_ap_xrate_rev_his_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ap_xrate_rev_his_no();
		}
		if ($ref_ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ref_ap_xrate_rev_his_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ap_xrate_rev_his_no(value);
			return;
		}
		if ($ref_ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ref_ap_xrate_rev_his_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ap_xrate_rev_his_no(value);
			return;
		}
		if ($ref_ap_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ref_ap_xrate_rev_his_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

