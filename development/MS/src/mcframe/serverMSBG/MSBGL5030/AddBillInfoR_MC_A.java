package mcframe.serverMSBG.MSBGL5030;

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
 * ブロック"AddBillInfo"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AddBillInfoR_MC_A extends MCConstRow {

	/**
	 * Billing amount 請求額.<p>
	 *
	 */
	public static final String $add_bill = "add_bill";
	/**
	 * Unbilled amount 未請求額.<p>
	 *
	 */
	public static final String $add_not_bill = "add_not_bill";
	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public static final String $prnt_typ = "prnt_typ";


	public static final MCMeta add_bill_META = createInnerRowMeta($add_bill, mcframe.serverMS.dbc.MST_BILL_ACST_R.class);
	public static final MCMeta add_not_bill_META = createInnerRowMeta($add_not_bill, mcframe.serverMS.dbc.MST_BILL_ACST_R.class);
	public static final MCMeta prnt_typ_META = createCommonMeta($prnt_typ, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<AddBillInfoR> constMetas = new ConstMetaList<AddBillInfoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			add_bill_META,
			add_not_bill_META,
			prnt_typ_META
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
	protected AddBillInfoR_MC_A(ConstMetaList<? extends AddBillInfoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AddBillInfoR clone() {
		return (AddBillInfoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AddBillInfoR createInstance() {
		return (AddBillInfoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AddBillInfoR getValues(String... names) {
		return (AddBillInfoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing amount 請求額.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_BILL_ACST_R add_bill(){
		return (mcframe.serverMS.dbc.MST_BILL_ACST_R) getConstInnerRow(offset + 0, $add_bill);
	}
	
	/**
	 * Billing amount 請求額.<p>
	 *
	 */
	public void add_bill(mcframe.serverMS.dbc.MST_BILL_ACST_R row){
		setConstInnerRow(offset + 0, $add_bill, row);
	}


	/**
	 * Unbilled amount 未請求額.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_BILL_ACST_R add_not_bill(){
		return (mcframe.serverMS.dbc.MST_BILL_ACST_R) getConstInnerRow(offset + 1, $add_not_bill);
	}
	
	/**
	 * Unbilled amount 未請求額.<p>
	 *
	 */
	public void add_not_bill(mcframe.serverMS.dbc.MST_BILL_ACST_R row){
		setConstInnerRow(offset + 1, $add_not_bill, row);
	}


	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public MCNumber prnt_typ() {
		return getConstNumber(offset + 2, $prnt_typ);
	}

	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public void prnt_typ(MCNumber value) {
		setConstNumber(offset + 2, $prnt_typ, value);
	}

	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public void prnt_typ(int value) {
		setConstNumber(offset + 2, $prnt_typ, value);
	}

	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public void prnt_typ(long value) {
		setConstNumber(offset + 2, $prnt_typ, value);
	}

	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public void prnt_typ(float value) {
		setConstNumber(offset + 2, $prnt_typ, value);
	}

	/**
	 * Issue type 発行区分.<p>
	 *
	 */
	public void prnt_typ(double value) {
		setConstNumber(offset + 2, $prnt_typ, value);
	}


	public MCNumber getNumber(String name) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			return prnt_typ();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			return prnt_typ();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prnt_typ.equalsIgnoreCase(name)) {
			prnt_typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($add_bill.equalsIgnoreCase(name)) {
			return add_bill();
		}
		if ($add_not_bill.equalsIgnoreCase(name)) {
			return add_not_bill();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($add_bill.equalsIgnoreCase(name)) {
			add_bill(
				((MCContainerMeta) add_bill_META).castInnerRow(mcframe.serverMS.dbc.MST_BILL_ACST_R.class, value)
			);
			return;
		}
		if ($add_not_bill.equalsIgnoreCase(name)) {
			add_not_bill(
				((MCContainerMeta) add_not_bill_META).castInnerRow(mcframe.serverMS.dbc.MST_BILL_ACST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


}

