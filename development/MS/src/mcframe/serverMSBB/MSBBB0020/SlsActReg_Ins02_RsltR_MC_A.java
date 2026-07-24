package mcframe.serverMSBB.MSBBB0020;

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
 * ブロック"SlsActReg_Ins02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsActReg_Ins02_RsltR_MC_A extends MCConstRow {

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public static final String $total_num = "total_num";
	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public static final String $ok_num = "ok_num";
	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public static final String $err_num = "err_num";


	public static final MCMeta total_num_META = createNumberMeta($total_num);
	public static final MCMeta ok_num_META = createNumberMeta($ok_num);
	public static final MCMeta err_num_META = createNumberMeta($err_num);

	protected static final ConstMetaList<SlsActReg_Ins02_RsltR> constMetas = new ConstMetaList<SlsActReg_Ins02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			total_num_META,
			ok_num_META,
			err_num_META
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
	protected SlsActReg_Ins02_RsltR_MC_A(ConstMetaList<? extends SlsActReg_Ins02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins02_RsltR clone() {
		return (SlsActReg_Ins02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins02_RsltR createInstance() {
		return (SlsActReg_Ins02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins02_RsltR getValues(String... names) {
		return (SlsActReg_Ins02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public MCNumber total_num() {
		return getConstNumber(offset + 0, $total_num);
	}

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public void total_num(MCNumber value) {
		setConstNumber(offset + 0, $total_num, value);
	}

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public void total_num(int value) {
		setConstNumber(offset + 0, $total_num, value);
	}

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public void total_num(long value) {
		setConstNumber(offset + 0, $total_num, value);
	}

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public void total_num(float value) {
		setConstNumber(offset + 0, $total_num, value);
	}

	/**
	 * Number of processed target 処理対象件数.<p>
	 *
	 */
	public void total_num(double value) {
		setConstNumber(offset + 0, $total_num, value);
	}


	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public MCNumber ok_num() {
		return getConstNumber(offset + 1, $ok_num);
	}

	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public void ok_num(MCNumber value) {
		setConstNumber(offset + 1, $ok_num, value);
	}

	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public void ok_num(int value) {
		setConstNumber(offset + 1, $ok_num, value);
	}

	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public void ok_num(long value) {
		setConstNumber(offset + 1, $ok_num, value);
	}

	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public void ok_num(float value) {
		setConstNumber(offset + 1, $ok_num, value);
	}

	/**
	 * Number of entries 登録件数.<p>
	 *
	 */
	public void ok_num(double value) {
		setConstNumber(offset + 1, $ok_num, value);
	}


	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public MCNumber err_num() {
		return getConstNumber(offset + 2, $err_num);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void err_num(MCNumber value) {
		setConstNumber(offset + 2, $err_num, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void err_num(int value) {
		setConstNumber(offset + 2, $err_num, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void err_num(long value) {
		setConstNumber(offset + 2, $err_num, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void err_num(float value) {
		setConstNumber(offset + 2, $err_num, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void err_num(double value) {
		setConstNumber(offset + 2, $err_num, value);
	}


	public MCNumber getNumber(String name) {
		if ($total_num.equalsIgnoreCase(name)) {
			return total_num();
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			return ok_num();
		}
		if ($err_num.equalsIgnoreCase(name)) {
			return err_num();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($total_num.equalsIgnoreCase(name)) {
			return total_num();
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			return ok_num();
		}
		if ($err_num.equalsIgnoreCase(name)) {
			return err_num();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($total_num.equalsIgnoreCase(name)) {
			total_num(value);
			return;
		}
		if ($ok_num.equalsIgnoreCase(name)) {
			ok_num(value);
			return;
		}
		if ($err_num.equalsIgnoreCase(name)) {
			err_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

