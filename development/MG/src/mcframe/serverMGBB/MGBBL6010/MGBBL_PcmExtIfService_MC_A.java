package mcframe.serverMGBB.MGBBL6010;

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
 * "MGBBL_PcmExtIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBL_PcmExtIfService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBBL6010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBL_PcmExtIfService.PcmExtIf_Chk01 aPcmExtIf_Chk01;

	protected void initPcmExtIf_Chk01() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Chk01_INFO;
		this.aPcmExtIf_Chk01 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Chk01();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Chk01 crtPcmExtIf_Chk01() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Chk01();
		return lgc.aPcmExtIf_Chk01;
	}

	protected void paramPcmExtIf_Chk01(MCParam p) {
		if (this.aPcmExtIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Chk01.up0());
		p.addDownBlock(aPcmExtIf_Chk01.down0());
	}

	protected void doPcmExtIf_Chk01() {
		aPcmExtIf_Chk01.call();
	};

	/**
	 * PcmExtIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Chk01_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}
	protected MGBBL_PcmExtIfService.PcmExtIf_Upd01 aPcmExtIf_Upd01;

	protected void initPcmExtIf_Upd01() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Upd01_INFO;
		this.aPcmExtIf_Upd01 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Upd01();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Upd01 crtPcmExtIf_Upd01() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Upd01();
		return lgc.aPcmExtIf_Upd01;
	}

	protected void paramPcmExtIf_Upd01(MCParam p) {
		if (this.aPcmExtIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd01.up0());
		p.addDownBlock(aPcmExtIf_Upd01.down0());
	}

	protected void doPcmExtIf_Upd01() {
		aPcmExtIf_Upd01.call();
	};

	/**
	 * PcmExtIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd01_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}
	protected MGBBL_PcmExtIfService.PcmExtIf_Upd02 aPcmExtIf_Upd02;

	protected void initPcmExtIf_Upd02() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Upd02_INFO;
		this.aPcmExtIf_Upd02 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Upd02();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Upd02 crtPcmExtIf_Upd02() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Upd02();
		return lgc.aPcmExtIf_Upd02;
	}

	protected void paramPcmExtIf_Upd02(MCParam p) {
		if (this.aPcmExtIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd02.up0());
		p.addDownBlock(aPcmExtIf_Upd02.down0());
	}

	protected void doPcmExtIf_Upd02() {
		aPcmExtIf_Upd02.call();
	};

	/**
	 * PcmExtIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd02_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}
	protected MGBBL_PcmExtIfService.PcmExtIf_Upd03 aPcmExtIf_Upd03;

	protected void initPcmExtIf_Upd03() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Upd03_INFO;
		this.aPcmExtIf_Upd03 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Upd03();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Upd03 crtPcmExtIf_Upd03() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Upd03();
		return lgc.aPcmExtIf_Upd03;
	}

	protected void paramPcmExtIf_Upd03(MCParam p) {
		if (this.aPcmExtIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd03.up0());
		p.addDownBlock(aPcmExtIf_Upd03.down0());
	}

	protected void doPcmExtIf_Upd03() {
		aPcmExtIf_Upd03.call();
	};

	/**
	 * PcmExtIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd03_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}
	protected MGBBL_PcmExtIfService.PcmExtIf_Upd04 aPcmExtIf_Upd04;

	protected void initPcmExtIf_Upd04() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Upd04_INFO;
		this.aPcmExtIf_Upd04 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Upd04();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Upd04 crtPcmExtIf_Upd04() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Upd04();
		return lgc.aPcmExtIf_Upd04;
	}

	protected void paramPcmExtIf_Upd04(MCParam p) {
		if (this.aPcmExtIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd04.up0());
		p.addDownBlock(aPcmExtIf_Upd04.down0());
	}

	protected void doPcmExtIf_Upd04() {
		aPcmExtIf_Upd04.call();
	};

	/**
	 * PcmExtIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd04_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}
	protected MGBBL_PcmExtIfService.PcmExtIf_Upd05 aPcmExtIf_Upd05;

	protected void initPcmExtIf_Upd05() {
		this.info = PDef.MG_MGBBL6010_PcmExtIf_Upd05_INFO;
		this.aPcmExtIf_Upd05 = ((MGBBL_PcmExtIfService)this).new PcmExtIf_Upd05();
	}

	public static MGBBL_PcmExtIfService.PcmExtIf_Upd05 crtPcmExtIf_Upd05() {
		MGBBL_PcmExtIfService lgc = new MGBBL_PcmExtIfService();
		lgc.initPcmExtIf_Upd05();
		return lgc.aPcmExtIf_Upd05;
	}

	protected void paramPcmExtIf_Upd05(MCParam p) {
		if (this.aPcmExtIf_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd05.up0());
		p.addDownBlock(aPcmExtIf_Upd05.down0());
	}

	protected void doPcmExtIf_Upd05() {
		aPcmExtIf_Upd05.call();
	};

	/**
	 * PcmExtIf_Upd05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd05_CndR(){
		return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PcmExtIf_Chk01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータ取込前チェック<br>
	 */
	abstract public class PcmExtIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Chk01_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>wip_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>wip_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}
	/**
	 * PcmExtIf_Upd01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd01_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>wip_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}
	/**
	 * PcmExtIf_Upd02オペレーション.<p>
	 *
	 * 原価受払実績ＩＦを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd02_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}
	/**
	 * PcmExtIf_Upd03オペレーション.<p>
	 *
	 * 原価工数情報ＩＦを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd03_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}
	/**
	 * PcmExtIf_Upd04オペレーション.<p>
	 *
	 * 原価指図仕掛情報ＩＦを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd04_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}
	/**
	 * PcmExtIf_Upd05オペレーション.<p>
	 *
	 * 原価在庫情報ＩＦを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();

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
			invoke((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmExtIf_Upd05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR createPcmExtIf_Upd05_CndR(){
			return mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL6010.PcmExtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmExtIfService)MGBBL_PcmExtIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}