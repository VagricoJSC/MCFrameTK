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
 * ブロック"Srch_Io_Schd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch_Io_SchdR_MC_A extends MCConstRow {

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public static final String $io_schd_seq = "io_schd_seq";


	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_seq_META = createCommonMeta($io_schd_seq, mcframe.commonMA.meta.MA_META.INT3);

	protected static final ConstMetaList<Srch_Io_SchdR> constMetas = new ConstMetaList<Srch_Io_SchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			io_schd_typ_META,
			io_schd_sts_typ_META,
			io_schd_no_META,
			io_schd_seq_META
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
	protected Srch_Io_SchdR_MC_A(ConstMetaList<? extends Srch_Io_SchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_Io_SchdR clone() {
		return (Srch_Io_SchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_Io_SchdR createInstance() {
		return (Srch_Io_SchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_Io_SchdR getValues(String... names) {
		return (Srch_Io_SchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 0, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 0, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 1, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 1, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 2, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 2, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 3, $io_schd_seq);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}


	public String getString(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

