package mcframe.serverMGBE.MGBEL0200;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MGBEL_FixStdUpriSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBEL_FixStdUpriSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBEL0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBEL_FixStdUpriSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBEL0200_Srch01_INFO;
		this.aSrch01 = ((MGBEL_FixStdUpriSrch)this).new Srch01();
	}

	public static MGBEL_FixStdUpriSrch.Srch01 crtSrch01() {
		MGBEL_FixStdUpriSrch lgc = new MGBEL_FixStdUpriSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0200.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBE.MGBEL0200.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0200.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBE.MGBEL0200.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0200.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0200.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 確定標準単価を検索する。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0200.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0200.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0200.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBE.MGBEL0200.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBEL_FixStdUpriSrch)MGBEL_FixStdUpriSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0200.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBE.MGBEL0200.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0200.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBE.MGBEL0200.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0200.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0200.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0200.Srch01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0200.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>qty_unit</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>var_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0200.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_FixStdUpriSrch)MGBEL_FixStdUpriSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}