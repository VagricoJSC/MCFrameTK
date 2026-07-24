package mcframe.serverMAUC.MAUCL5030;

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
 * ブロック"MultiExec_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MultiExec_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * Executed company cd. 実行会社ＣＤ.<p>
	 *
	 */
	public static final String $exec_co_cd = "exec_co_cd";
	/**
	 * Data reference control データ参照制御.<p>
	 *
	 */
	public static final String $data_ref_ctl = "data_ref_ctl";


	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta exec_co_cd_META = createCommonMeta($exec_co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta data_ref_ctl_META = createStringMeta($data_ref_ctl, 50);

	protected static final ConstMetaList<MultiExec_Upd01_DtlR> constMetas = new ConstMetaList<MultiExec_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			if_proc_typ_META,
			exec_co_cd_META,
			data_ref_ctl_META
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
	protected MultiExec_Upd01_DtlR_MC_A(ConstMetaList<? extends MultiExec_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MultiExec_Upd01_DtlR clone() {
		return (MultiExec_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MultiExec_Upd01_DtlR createInstance() {
		return (MultiExec_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MultiExec_Upd01_DtlR getValues(String... names) {
		return (MultiExec_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 0, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 0, $if_proc_typ, value);
	}


	/**
	 * Executed company cd. 実行会社ＣＤ.<p>
	 *
	 */
	public String exec_co_cd() {
		return getConstString(offset + 1, $exec_co_cd);
	}

	/**
	 * Executed company cd. 実行会社ＣＤ.<p>
	 *
	 */
	public void exec_co_cd(String value) {
		setConstString(offset + 1, $exec_co_cd, value);
	}


	/**
	 * Data reference control データ参照制御.<p>
	 *
	 */
	public String data_ref_ctl() {
		return getConstString(offset + 2, $data_ref_ctl);
	}

	/**
	 * Data reference control データ参照制御.<p>
	 *
	 */
	public void data_ref_ctl(String value) {
		setConstString(offset + 2, $data_ref_ctl, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($exec_co_cd.equalsIgnoreCase(name)) {
			return exec_co_cd();
		}
		if ($data_ref_ctl.equalsIgnoreCase(name)) {
			return data_ref_ctl();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($exec_co_cd.equalsIgnoreCase(name)) {
			return exec_co_cd();
		}
		if ($data_ref_ctl.equalsIgnoreCase(name)) {
			return data_ref_ctl();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($exec_co_cd.equalsIgnoreCase(name)) {
			exec_co_cd(value);
			return;
		}
		if ($data_ref_ctl.equalsIgnoreCase(name)) {
			data_ref_ctl(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($exec_co_cd.equalsIgnoreCase(name)) {
			exec_co_cd(value);
			return;
		}
		if ($data_ref_ctl.equalsIgnoreCase(name)) {
			data_ref_ctl(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

