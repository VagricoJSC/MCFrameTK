package mcframe.serverMSBE.MSBEL5930;

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
 * ブロック"ArrAct_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrAct_HdrR_MC_A extends MCConstRow {

	/**
	 * Create subcontracting mfg. result 外注製造実績作成.<p>
	 *
	 */
	public static final String $outsrc_act_flg = "outsrc_act_flg";
	/**
	 * Purchase result generation 仕入実績作成.<p>
	 *
	 */
	public static final String $purc_act_flg = "purc_act_flg";
	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public static final String $sls_act_flg = "sls_act_flg";
	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public static final String $io_act_flg = "io_act_flg";


	public static final MCMeta outsrc_act_flg_META = createCommonMeta($outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_flg_META = createCommonMeta($purc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_flg_META = createCommonMeta($sls_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_act_flg_META = createCommonMeta($io_act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ArrAct_HdrR> constMetas = new ConstMetaList<ArrAct_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			outsrc_act_flg_META,
			purc_act_flg_META,
			sls_act_flg_META,
			io_act_flg_META
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
	protected ArrAct_HdrR_MC_A(ConstMetaList<? extends ArrAct_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_HdrR clone() {
		return (ArrAct_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_HdrR createInstance() {
		return (ArrAct_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_HdrR getValues(String... names) {
		return (ArrAct_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Create subcontracting mfg. result 外注製造実績作成.<p>
	 *
	 */
	public boolean outsrc_act_flg() {
		return getConstBoolean(offset + 0, $outsrc_act_flg);
	}

	/**
	 * Create subcontracting mfg. result 外注製造実績作成.<p>
	 *
	 */
	public void outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 0, $outsrc_act_flg, value);
	}


	/**
	 * Purchase result generation 仕入実績作成.<p>
	 *
	 */
	public boolean purc_act_flg() {
		return getConstBoolean(offset + 1, $purc_act_flg);
	}

	/**
	 * Purchase result generation 仕入実績作成.<p>
	 *
	 */
	public void purc_act_flg(boolean value) {
		setConstBoolean(offset + 1, $purc_act_flg, value);
	}


	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public boolean sls_act_flg() {
		return getConstBoolean(offset + 2, $sls_act_flg);
	}

	/**
	 * Create Sales Results 売上実績作成.<p>
	 *
	 */
	public void sls_act_flg(boolean value) {
		setConstBoolean(offset + 2, $sls_act_flg, value);
	}


	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public boolean io_act_flg() {
		return getConstBoolean(offset + 3, $io_act_flg);
	}

	/**
	 * Create GR/GI result 受払実績作成.<p>
	 *
	 */
	public void io_act_flg(boolean value) {
		setConstBoolean(offset + 3, $io_act_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			return outsrc_act_flg();
		}
		if ($purc_act_flg.equalsIgnoreCase(name)) {
			return purc_act_flg();
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			return sls_act_flg();
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			return io_act_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			return outsrc_act_flg();
		}
		if ($purc_act_flg.equalsIgnoreCase(name)) {
			return purc_act_flg();
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			return sls_act_flg();
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			return io_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			outsrc_act_flg(value);
			return;
		}
		if ($purc_act_flg.equalsIgnoreCase(name)) {
			purc_act_flg(value);
			return;
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			sls_act_flg(value);
			return;
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			io_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			outsrc_act_flg(value);
			return;
		}
		if ($purc_act_flg.equalsIgnoreCase(name)) {
			purc_act_flg(value);
			return;
		}
		if ($sls_act_flg.equalsIgnoreCase(name)) {
			sls_act_flg(value);
			return;
		}
		if ($io_act_flg.equalsIgnoreCase(name)) {
			io_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

