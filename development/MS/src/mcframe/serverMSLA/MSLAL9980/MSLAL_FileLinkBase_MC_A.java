package mcframe.serverMSLA.MSLAL9980;

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
 * "MSLAL_FileLinkBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_FileLinkBase_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL9980";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_FileLinkBase.FileLinkBase_Chk01 aFileLinkBase_Chk01;

	protected void initFileLinkBase_Chk01() {
		this.info = PDef.MS_MSLAL9980_FileLinkBase_Chk01_INFO;
		this.aFileLinkBase_Chk01 = ((MSLAL_FileLinkBase)this).new FileLinkBase_Chk01();
	}

	public static MSLAL_FileLinkBase.FileLinkBase_Chk01 crtFileLinkBase_Chk01() {
		MSLAL_FileLinkBase lgc = new MSLAL_FileLinkBase();
		lgc.initFileLinkBase_Chk01();
		return lgc.aFileLinkBase_Chk01;
	}

	protected void paramFileLinkBase_Chk01(MCParam p) {
		if (this.aFileLinkBase_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aFileLinkBase_Chk01.up0());
		p.addDownBlock(aFileLinkBase_Chk01.down0());
	}

	protected void doFileLinkBase_Chk01() {
		aFileLinkBase_Chk01.call();
	};

	/**
	 * Link_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9980.Link_DtlR createLink_DtlR(){
		return mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();
	}
	protected MSLAL_FileLinkBase.FileLinkBase_Upd01 aFileLinkBase_Upd01;

	protected void initFileLinkBase_Upd01() {
		this.info = PDef.MS_MSLAL9980_FileLinkBase_Upd01_INFO;
		this.aFileLinkBase_Upd01 = ((MSLAL_FileLinkBase)this).new FileLinkBase_Upd01();
	}

	public static MSLAL_FileLinkBase.FileLinkBase_Upd01 crtFileLinkBase_Upd01() {
		MSLAL_FileLinkBase lgc = new MSLAL_FileLinkBase();
		lgc.initFileLinkBase_Upd01();
		return lgc.aFileLinkBase_Upd01;
	}

	protected void paramFileLinkBase_Upd01(MCParam p) {
		if (this.aFileLinkBase_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aFileLinkBase_Upd01.up0());
	}

	protected void doFileLinkBase_Upd01() {
		aFileLinkBase_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * FileLinkBase_Chk01オペレーション.<p>
	 *
	 * ファイル連携前チェック用の親クラス<br>
	 */
	abstract public class FileLinkBase_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "FileLinkBase_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9980.Link_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9980.Link_DtlR down0;
		
		
		// コンストラクタ
		protected FileLinkBase_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();
			down0 = mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();

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
			invoke((MSLAL_FileLinkBase)MSLAL_FileLinkBase_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Link_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9980.Link_DtlR createLink_DtlR(){
			return mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9980.Link_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9980.Link_DtlR up0() {
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
		 * @see mcframe.serverMSLA.MSLAL9980.Link_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9980.Link_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_FileLinkBase)MSLAL_FileLinkBase_MC_A.this).info;
		}


	}
	/**
	 * FileLinkBase_Upd01オペレーション.<p>
	 *
	 * ファイル連携更新用の親クラス<br>
	 */
	abstract public class FileLinkBase_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "FileLinkBase_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9980.Link_DtlR up0;
		
		
		// コンストラクタ
		protected FileLinkBase_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_FileLinkBase)MSLAL_FileLinkBase_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Link_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9980.Link_DtlR createLink_DtlR(){
			return mcframe.serverMSLA.MSLAL9980.Link_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9980.Link_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9980.Link_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_FileLinkBase)MSLAL_FileLinkBase_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}