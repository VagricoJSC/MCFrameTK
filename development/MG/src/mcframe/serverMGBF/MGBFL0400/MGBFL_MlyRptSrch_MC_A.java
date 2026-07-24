package mcframe.serverMGBF.MGBFL0400;

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
 * "MGBFL_MlyRptSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_MlyRptSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBFL0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_MlyRptSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0400_Srch01_INFO;
		this.aSrch01 = ((MGBFL_MlyRptSrch)this).new Srch01();
	}

	public static MGBFL_MlyRptSrch.Srch01 crtSrch01() {
		MGBFL_MlyRptSrch lgc = new MGBFL_MlyRptSrch();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0400.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0400.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0400.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMGBF.MGBFL0400.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_DtlR.class);
	}

	/**
	 * Srch01_KeyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0400.Srch01_KeyR createSrch01_KeyR(){
		return mcframe.serverMGBF.MGBFL0400.Srch01_KeyR.create();
	}

	/**
	 * Srch01_KeyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_KeyR> createSrch01_KeyL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_KeyR.class);
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0400.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMGBF.MGBFL0400.Srch01_HdrR.create();
	}

	/**
	 * Srch01_CalcNoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR createSrch01_CalcNoR(){
		return mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR.create();
	}

	/**
	 * Srch01_CalcNoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR> createSrch01_CalcNoL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月別原価レポートを検索する<br>
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
		private final mcframe.serverMGBF.MGBFL0400.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0400.Srch01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0400.Srch01_KeyR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMGBF.MGBFL0400.Srch01_HdrR down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR> down3;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0400.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_DtlR.class);
			down1 = MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_KeyR.class);
			down2 = mcframe.serverMGBF.MGBFL0400.Srch01_HdrR.create();
			down3 = MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBFL_MlyRptSrch)MGBFL_MlyRptSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0400.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMGBF.MGBFL0400.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_DtlR.class);
		}

		/**
		 * Srch01_KeyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_KeyR createSrch01_KeyR(){
			return mcframe.serverMGBF.MGBFL0400.Srch01_KeyR.create();
		}

		/**
		 * Srch01_KeyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_KeyR> createSrch01_KeyL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_KeyR.class);
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMGBF.MGBFL0400.Srch01_HdrR.create();
		}

		/**
		 * Srch01_CalcNoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR createSrch01_CalcNoR(){
			return mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR.create();
		}

		/**
		 * Srch01_CalcNoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR> createSrch01_CalcNoL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_typ</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0400.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>rpt_seq</td></tr>
		 * 	<tr><td><br></td><td>fg_r</td></tr>
		 * 	<tr><td><br></td><td>fg_g</td></tr>
		 * 	<tr><td><br></td><td>fg_b</td></tr>
		 * 	<tr><td><br></td><td>bg_r</td></tr>
		 * 	<tr><td><br></td><td>bg_g</td></tr>
		 * 	<tr><td><br></td><td>bg_b</td></tr>
		 * 	<tr><td><br></td><td>qty_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>rpt_row_view</td></tr>
		 * 	<tr><td><br></td><td>col_all</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cd</td></tr>
		 * 	<tr><td><br></td><td>nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_KeyR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>max_month</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0400.Srch01_HdrR
		 */
		public mcframe.serverMGBF.MGBFL0400.Srch01_HdrR down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0400.Srch01_CalcNoR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_MlyRptSrch)MGBFL_MlyRptSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}