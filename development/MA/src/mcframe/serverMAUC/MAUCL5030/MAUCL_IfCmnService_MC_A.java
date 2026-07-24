package mcframe.serverMAUC.MAUCL5030;

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
 * "MAUCL_IfCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_IfCmnService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_IfCmnService.MultiExec_Upd01 aMultiExec_Upd01;

	protected void initMultiExec_Upd01() {
		this.info = PDef.MA_MAUCL5030_MultiExec_Upd01_INFO;
		this.aMultiExec_Upd01 = ((MAUCL_IfCmnService)this).new MultiExec_Upd01();
	}

	public static MAUCL_IfCmnService.MultiExec_Upd01 crtMultiExec_Upd01() {
		MAUCL_IfCmnService lgc = new MAUCL_IfCmnService();
		lgc.initMultiExec_Upd01();
		return lgc.aMultiExec_Upd01;
	}

	protected void paramMultiExec_Upd01(MCParam p) {
		if (this.aMultiExec_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMultiExec_Upd01.up0());
		p.addDownBlock(aMultiExec_Upd01.down0());
	}

	protected void doMultiExec_Upd01() {
		aMultiExec_Upd01.call();
	};

	/**
	 * MultiExec_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR createMultiExec_Upd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR.create();
	}

	/**
	 * MultiExec_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR createMultiExec_Upd01_RsltR(){
		return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR.create();
	}
	protected MAUCL_IfCmnService.MultiExec_Upd02 aMultiExec_Upd02;

	protected void initMultiExec_Upd02() {
		this.info = PDef.MA_MAUCL5030_MultiExec_Upd02_INFO;
		this.aMultiExec_Upd02 = ((MAUCL_IfCmnService)this).new MultiExec_Upd02();
	}

	public static MAUCL_IfCmnService.MultiExec_Upd02 crtMultiExec_Upd02() {
		MAUCL_IfCmnService lgc = new MAUCL_IfCmnService();
		lgc.initMultiExec_Upd02();
		return lgc.aMultiExec_Upd02;
	}

	protected void paramMultiExec_Upd02(MCParam p) {
		if (this.aMultiExec_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMultiExec_Upd02.up0());
		p.addDownBlock(aMultiExec_Upd02.down0());
	}

	protected void doMultiExec_Upd02() {
		aMultiExec_Upd02.call();
	};

	/**
	 * MultiExec_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR createMultiExec_Upd02_DtlR(){
		return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR.create();
	}

	/**
	 * MultiExec_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR createMultiExec_Upd02_RsltR(){
		return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MultiExec_Upd01オペレーション.<p>
	 *
	 * BI Linkバッチ制御(MAT_BLNK_BAT_CNTL)テーブルの「バッチ実行中フラグ」をtrueに更新する。<br>
	 */
	abstract public class MultiExec_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MultiExec_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected MultiExec_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR.create();
			down0 = mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR.create();

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
			invoke((MAUCL_IfCmnService)MAUCL_IfCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MultiExec_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR createMultiExec_Upd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR.create();
		}

		/**
		 * MultiExec_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR createMultiExec_Upd01_RsltR(){
			return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>exec_co_cd</td></tr>
		 * 	<tr><td><br></td><td>data_ref_ctl</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rslt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_IfCmnService)MAUCL_IfCmnService_MC_A.this).info;
		}


	}
	/**
	 * MultiExec_Upd02オペレーション.<p>
	 *
	 * BI Linkバッチ制御(MAT_BLNK_BAT_CNTL)テーブルの「バッチ実行中フラグ」をfalseに更新する。<br>
	 */
	abstract public class MultiExec_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MultiExec_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR down0;
		
		
		// コンストラクタ
		protected MultiExec_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR.create();
			down0 = mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR.create();

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
			invoke((MAUCL_IfCmnService)MAUCL_IfCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MultiExec_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR createMultiExec_Upd02_DtlR(){
			return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR.create();
		}

		/**
		 * MultiExec_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR createMultiExec_Upd02_RsltR(){
			return mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>exec_co_cd</td></tr>
		 * 	<tr><td><br></td><td>data_ref_ctl</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rslt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR
		 */
		public mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_IfCmnService)MAUCL_IfCmnService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}