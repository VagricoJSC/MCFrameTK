package mcframe.serverMSBD.MSBDL0090;

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
 * ブロック"Srch01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public static final String $po_schd_upd_cntr = "po_schd_upd_cntr";
	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public static final String $po_send_if_upd_cntr = "po_send_if_upd_cntr";


	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_schd_upd_cntr_META = createCommonMeta($po_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta po_send_if_upd_cntr_META = createCommonMeta($po_send_if_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_no_META,
			po_d_no_META,
			po_schd_no_META,
			po_schd_upd_cntr_META,
			arr_pr_upd_cntr_META,
			data_no_META,
			data_lno_META,
			po_send_if_upd_cntr_META
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
	protected Srch01_Rslt2R_MC_A(ConstMetaList<? extends Srch01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R clone() {
		return (Srch01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R createInstance() {
		return (Srch01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R getValues(String... names) {
		return (Srch01_Rslt2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 0, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 0, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 1, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 1, $po_d_no, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 2, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 2, $po_schd_no, value);
	}


	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public MCNumber po_schd_upd_cntr() {
		return getConstNumber(offset + 3, $po_schd_upd_cntr);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(int value) {
		setConstNumber(offset + 3, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(long value) {
		setConstNumber(offset + 3, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(float value) {
		setConstNumber(offset + 3, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(double value) {
		setConstNumber(offset + 3, $po_schd_upd_cntr, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 4, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 4, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 4, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 4, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 4, $arr_pr_upd_cntr, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 5, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 5, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 5, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 5, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 5, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 5, $data_no, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 6, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 6, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 6, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 6, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 6, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 6, $data_lno, value);
	}


	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public MCNumber po_send_if_upd_cntr() {
		return getConstNumber(offset + 7, $po_send_if_upd_cntr);
	}

	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public void po_send_if_upd_cntr(MCNumber value) {
		setConstNumber(offset + 7, $po_send_if_upd_cntr, value);
	}

	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public void po_send_if_upd_cntr(int value) {
		setConstNumber(offset + 7, $po_send_if_upd_cntr, value);
	}

	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public void po_send_if_upd_cntr(long value) {
		setConstNumber(offset + 7, $po_send_if_upd_cntr, value);
	}

	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public void po_send_if_upd_cntr(float value) {
		setConstNumber(offset + 7, $po_send_if_upd_cntr, value);
	}

	/**
	 * PO export IF update counter 発注送信ＩＦ更新カウンタ.<p>
	 *
	 */
	public void po_send_if_upd_cntr(double value) {
		setConstNumber(offset + 7, $po_send_if_upd_cntr, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			return po_send_if_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			return po_send_if_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($po_send_if_upd_cntr.equalsIgnoreCase(name)) {
			po_send_if_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

