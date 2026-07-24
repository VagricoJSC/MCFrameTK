package mcframe.serverMBBB.MBBBL5030;

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
 * "MBBBL_AutoJnlService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_AutoJnlService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_AutoJnlService.AutoJnl_Chk01 aAutoJnl_Chk01;

	protected void initAutoJnl_Chk01() {
		this.info = PDef.MB_MBBBL5030_AutoJnl_Chk01_INFO;
		this.aAutoJnl_Chk01 = ((MBBBL_AutoJnlService)this).new AutoJnl_Chk01();
	}

	public static MBBBL_AutoJnlService.AutoJnl_Chk01 crtAutoJnl_Chk01() {
		MBBBL_AutoJnlService lgc = new MBBBL_AutoJnlService();
		lgc.initAutoJnl_Chk01();
		return lgc.aAutoJnl_Chk01;
	}

	protected void paramAutoJnl_Chk01(MCParam p) {
		if (this.aAutoJnl_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnl_Chk01.up0());
		p.addDownBlock(aAutoJnl_Chk01.down0());
	}

	protected void doAutoJnl_Chk01() {
		aAutoJnl_Chk01.call();
	};

	/**
	 * AutoJnl_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR createAutoJnl_Chk01_CndR(){
		return mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
	}
	protected MBBBL_AutoJnlService.AutoJnl_Upd01 aAutoJnl_Upd01;

	protected void initAutoJnl_Upd01() {
		this.info = PDef.MB_MBBBL5030_AutoJnl_Upd01_INFO;
		this.aAutoJnl_Upd01 = ((MBBBL_AutoJnlService)this).new AutoJnl_Upd01();
	}

	public static MBBBL_AutoJnlService.AutoJnl_Upd01 crtAutoJnl_Upd01() {
		MBBBL_AutoJnlService lgc = new MBBBL_AutoJnlService();
		lgc.initAutoJnl_Upd01();
		return lgc.aAutoJnl_Upd01;
	}

	protected void paramAutoJnl_Upd01(MCParam p) {
		if (this.aAutoJnl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnl_Upd01.up0());
		p.addDownBlock(aAutoJnl_Upd01.down0());
	}

	protected void doAutoJnl_Upd01() {
		aAutoJnl_Upd01.call();
	};

	/**
	 * AutoJnl_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR createAutoJnl_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
	}
	protected MBBBL_AutoJnlService.AutoJnl_Upd02 aAutoJnl_Upd02;

	protected void initAutoJnl_Upd02() {
		this.info = PDef.MB_MBBBL5030_AutoJnl_Upd02_INFO;
		this.aAutoJnl_Upd02 = ((MBBBL_AutoJnlService)this).new AutoJnl_Upd02();
	}

	public static MBBBL_AutoJnlService.AutoJnl_Upd02 crtAutoJnl_Upd02() {
		MBBBL_AutoJnlService lgc = new MBBBL_AutoJnlService();
		lgc.initAutoJnl_Upd02();
		return lgc.aAutoJnl_Upd02;
	}

	protected void paramAutoJnl_Upd02(MCParam p) {
		if (this.aAutoJnl_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnl_Upd02.up0());
		p.addUpBlock(aAutoJnl_Upd02.up1());
		p.addDownBlock(aAutoJnl_Upd02.down0());
	}

	protected void doAutoJnl_Upd02() {
		aAutoJnl_Upd02.call();
	};

	/**
	 * AutoJnl_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR createAutoJnl_Upd02_CndR(){
		return mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR.create();
	}

	/**
	 * AutoJnl_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR createAutoJnl_Upd02_DtlR(){
		return mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR.create();
	}

	/**
	 * AutoJnl_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR> createAutoJnl_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AutoJnl_Chk01オペレーション.<p>
	 *
	 * 自動仕訳作成前チェック<br>
	 */
	abstract public class AutoJnl_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnl_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected AutoJnl_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();

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
			invoke((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AutoJnl_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR createAutoJnl_Chk01_CndR(){
			return mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_dt</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_rmrks</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_dt</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this).info;
		}


	}
	/**
	 * AutoJnl_Upd01オペレーション.<p>
	 *
	 * 自動で仕訳を作成する。<br>
	 */
	abstract public class AutoJnl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected AutoJnl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();

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
			invoke((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AutoJnl_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR createAutoJnl_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_dt</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_rmrks</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR up0() {
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
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this).info;
		}


	}
	/**
	 * AutoJnl_Upd02オペレーション.<p>
	 *
	 * 仕訳処理を行う。マルチスレッド処理。<br>
	 */
	abstract public class AutoJnl_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnl_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR down0;
		
		
		// コンストラクタ
		protected AutoJnl_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR.create();
			up1 = MCList.create(mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR.class);
			down0 = mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AutoJnl_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR createAutoJnl_Upd02_CndR(){
			return mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR.create();
		}

		/**
		 * AutoJnl_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR createAutoJnl_Upd02_DtlR(){
			return mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR.create();
		}

		/**
		 * AutoJnl_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR> createAutoJnl_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_next</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>mon</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>pre_jnl_seq</td></tr>
		 * 	<tr><td><br></td><td>jnl_unit</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>un_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>inv_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>spot_flg</td></tr>
		 * 	<tr><td><br></td><td>sttl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>project_cd</td></tr>
		 * 	<tr><td><br></td><td>summary_cd0</td></tr>
		 * 	<tr><td><br></td><td>summary_cd1</td></tr>
		 * 	<tr><td><br></td><td>summary_cd2</td></tr>
		 * 	<tr><td><br></td><td>summary_cd3</td></tr>
		 * 	<tr><td><br></td><td>summary_cd4</td></tr>
		 * 	<tr><td><br></td><td>summary_cd5</td></tr>
		 * 	<tr><td><br></td><td>trd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>trd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>trd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_project_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd0</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd1</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd2</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd3</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd4</td></tr>
		 * 	<tr><td><br></td><td>trd_summary_cd5</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_key1</td></tr>
		 * 	<tr><td><br></td><td>jnl_key2</td></tr>
		 * 	<tr><td><br></td><td>jnl_key3</td></tr>
		 * 	<tr><td><br></td><td>jnl_key4</td></tr>
		 * 	<tr><td><br></td><td>jnl_key5</td></tr>
		 * 	<tr><td><br></td><td>jnl_key6</td></tr>
		 * 	<tr><td><br></td><td>jnl_key7</td></tr>
		 * 	<tr><td><br></td><td>jnl_key8</td></tr>
		 * 	<tr><td><br></td><td>jnl_key9</td></tr>
		 * 	<tr><td><br></td><td>jnl_key10</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>tmp_num</td></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>table_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rc</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5030.AutoJnl_Upd02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AutoJnlService)MBBBL_AutoJnlService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}