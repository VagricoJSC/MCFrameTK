package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Lno_List"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lno_ListR_MC_A extends MCConstRow {

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public static final String $gi_lno = "gi_lno";
	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public static final String $gr_lno = "gr_lno";


	public static final MCMeta gi_lno_META = createNumberMeta($gi_lno);
	public static final MCMeta gr_lno_META = createNumberMeta($gr_lno);

	protected static final ConstMetaList<Lno_ListR> constMetas = new ConstMetaList<Lno_ListR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			gi_lno_META,
			gr_lno_META
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
	protected Lno_ListR_MC_A(ConstMetaList<? extends Lno_ListR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lno_ListR clone() {
		return (Lno_ListR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lno_ListR createInstance() {
		return (Lno_ListR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lno_ListR getValues(String... names) {
		return (Lno_ListR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public MCNumber gi_lno() {
		return getConstNumber(offset + 0, $gi_lno);
	}

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public void gi_lno(MCNumber value) {
		setConstNumber(offset + 0, $gi_lno, value);
	}

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public void gi_lno(int value) {
		setConstNumber(offset + 0, $gi_lno, value);
	}

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public void gi_lno(long value) {
		setConstNumber(offset + 0, $gi_lno, value);
	}

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public void gi_lno(float value) {
		setConstNumber(offset + 0, $gi_lno, value);
	}

	/**
	 * GI row No. 出庫行番号.<p>
	 *
	 */
	public void gi_lno(double value) {
		setConstNumber(offset + 0, $gi_lno, value);
	}


	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public MCNumber gr_lno() {
		return getConstNumber(offset + 1, $gr_lno);
	}

	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public void gr_lno(MCNumber value) {
		setConstNumber(offset + 1, $gr_lno, value);
	}

	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public void gr_lno(int value) {
		setConstNumber(offset + 1, $gr_lno, value);
	}

	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public void gr_lno(long value) {
		setConstNumber(offset + 1, $gr_lno, value);
	}

	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public void gr_lno(float value) {
		setConstNumber(offset + 1, $gr_lno, value);
	}

	/**
	 * GR row number 入庫行番号.<p>
	 *
	 */
	public void gr_lno(double value) {
		setConstNumber(offset + 1, $gr_lno, value);
	}


	public MCNumber getNumber(String name) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			return gi_lno();
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			return gr_lno();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			return gi_lno();
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			return gr_lno();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($gi_lno.equalsIgnoreCase(name)) {
			gi_lno(value);
			return;
		}
		if ($gr_lno.equalsIgnoreCase(name)) {
			gr_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

