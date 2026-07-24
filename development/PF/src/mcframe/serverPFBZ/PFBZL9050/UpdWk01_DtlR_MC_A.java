package mcframe.serverPFBZ.PFBZL9050;

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
 * ブロック"UpdWk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class UpdWk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIfWk = "sdrvIfWk";

	public static final String $data_no = $sdrvIfWk + ".data_no";
	public static final String $if_proc_typ = $sdrvIfWk + ".if_proc_typ";
	public static final String $ext_sys_cd = $sdrvIfWk + ".ext_sys_cd";

	public static final MCMeta sdrvIfWk_META = createInnerRowMeta($sdrvIfWk, mcframe.serverPF.dbc.PFW_SDRV_IF_R.class);

	protected static final ConstMetaList<UpdWk01_DtlR> constMetas = new ConstMetaList<UpdWk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIfWk_META
		},
		new String[][]{
			{
				"data_no",
				"if_proc_typ",
				"ext_sys_cd"
			},
			{
				$data_no,
				$if_proc_typ,
				$ext_sys_cd
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
	protected UpdWk01_DtlR_MC_A(ConstMetaList<? extends UpdWk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UpdWk01_DtlR clone() {
		return (UpdWk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UpdWk01_DtlR createInstance() {
		return (UpdWk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UpdWk01_DtlR getValues(String... names) {
		return (UpdWk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFW_SDRV_IF_R sdrvIfWk(){
		return (mcframe.serverPF.dbc.PFW_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIfWk);
	}
	
	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public void sdrvIfWk(mcframe.serverPF.dbc.PFW_SDRV_IF_R row){
		setConstInnerRow(offset + 0, $sdrvIfWk, row);
	}






	public MCRow getInnerRow(String name) {
		if ($sdrvIfWk.equalsIgnoreCase(name)) {
			return sdrvIfWk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sdrvIfWk.equalsIgnoreCase(name)) {
			sdrvIfWk(
				((MCContainerMeta) sdrvIfWk_META).castInnerRow(mcframe.serverPF.dbc.PFW_SDRV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sdrvIfWk().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sdrvIfWk().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sdrvIfWk().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sdrvIfWk().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sdrvIfWk().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sdrvIfWk().data_no(value);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return sdrvIfWk().if_proc_typ();
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		sdrvIfWk().if_proc_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return sdrvIfWk().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		sdrvIfWk().ext_sys_cd(value);
	}

}

