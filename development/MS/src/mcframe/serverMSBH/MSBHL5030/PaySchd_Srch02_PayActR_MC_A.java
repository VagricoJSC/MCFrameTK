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
 * ブロック"PaySchd_Srch02_PayAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_Srch02_PayActR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	public static final String $pay_act_d = "pay_act_d";
	public static final String $pay_chk = "pay_chk";

	public static final String $pay_act_d_no = $pay_act_d + ".pay_act_d_no";
	public static final String $pay_act_d_seq = $pay_act_d + ".pay_act_d_seq";
	public static final String $pay_chk_mng_no = $pay_chk + ".pay_chk_mng_no";
	public static final String $upd_cntr = $pay_chk + ".upd_cntr";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pay_act_d_META = createInnerRowMeta($pay_act_d, mcframe.serverMS.dbc.MST_PAY_ACT_D_R.class);
	public static final MCMeta pay_chk_META = createInnerRowMeta($pay_chk, mcframe.serverMS.dbc.MST_PAY_CHK_R.class);

	protected static final ConstMetaList<PaySchd_Srch02_PayActR> constMetas = new ConstMetaList<PaySchd_Srch02_PayActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			pay_act_d_META,
			pay_chk_META
		},
		new String[][]{
			{
				"pay_act_d_no",
				"pay_act_d_seq",
				"pay_chk_mng_no",
				"upd_cntr"
			},
			{
				$pay_act_d_no,
				$pay_act_d_seq,
				$pay_chk_mng_no,
				$upd_cntr
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
	protected PaySchd_Srch02_PayActR_MC_A(ConstMetaList<? extends PaySchd_Srch02_PayActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_PayActR clone() {
		return (PaySchd_Srch02_PayActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_PayActR createInstance() {
		return (PaySchd_Srch02_PayActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_PayActR getValues(String... names) {
		return (PaySchd_Srch02_PayActR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_PAY_ACT_D_R pay_act_d(){
		return (mcframe.serverMS.dbc.MST_PAY_ACT_D_R) getConstInnerRow(offset + 1, $pay_act_d);
	}
	
	public void pay_act_d(mcframe.serverMS.dbc.MST_PAY_ACT_D_R row){
		setConstInnerRow(offset + 1, $pay_act_d, row);
	}


	public mcframe.serverMS.dbc.MST_PAY_CHK_R pay_chk(){
		return (mcframe.serverMS.dbc.MST_PAY_CHK_R) getConstInnerRow(offset + 2, $pay_chk);
	}
	
	public void pay_chk(mcframe.serverMS.dbc.MST_PAY_CHK_R row){
		setConstInnerRow(offset + 2, $pay_chk, row);
	}


	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
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

	public MCRow getInnerRow(String name) {
		if ($pay_act_d.equalsIgnoreCase(name)) {
			return pay_act_d();
		}
		if ($pay_chk.equalsIgnoreCase(name)) {
			return pay_chk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_act_d.equalsIgnoreCase(name)) {
			pay_act_d(
				((MCContainerMeta) pay_act_d_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_ACT_D_R.class, value)
			);
			return;
		}
		if ($pay_chk.equalsIgnoreCase(name)) {
			pay_chk(
				((MCContainerMeta) pay_chk_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_CHK_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return pay_act_d().pay_act_d_no();
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		pay_act_d().pay_act_d_no(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return pay_act_d().pay_act_d_seq();
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		pay_act_d().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		pay_act_d().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		pay_act_d().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		pay_act_d().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		pay_act_d().pay_act_d_seq(value);
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
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return pay_chk().upd_cntr();
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		pay_chk().upd_cntr(value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		pay_chk().upd_cntr(value);
	}

}

