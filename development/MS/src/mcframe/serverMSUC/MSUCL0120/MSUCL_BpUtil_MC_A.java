package mcframe.serverMSUC.MSUCL0120;

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
 * "MSUCL_BpUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUCL_BpUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSUCL0120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSUCL_BpUtil.BpUtil_Sprt01 aBpUtil_Sprt01;

	protected void initBpUtil_Sprt01() {
		this.info = PDef.MS_MSUCL0120_BpUtil_Sprt01_INFO;
		this.aBpUtil_Sprt01 = ((MSUCL_BpUtil)this).new BpUtil_Sprt01();
	}

	public static MSUCL_BpUtil.BpUtil_Sprt01 crtBpUtil_Sprt01() {
		MSUCL_BpUtil lgc = new MSUCL_BpUtil();
		lgc.initBpUtil_Sprt01();
		return lgc.aBpUtil_Sprt01;
	}

	protected void paramBpUtil_Sprt01(MCParam p) {
		if (this.aBpUtil_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpUtil_Sprt01.up0());
		p.addUpBlock(aBpUtil_Sprt01.up1());
		p.addDownBlock(aBpUtil_Sprt01.down0());
	}

	protected void doBpUtil_Sprt01() {
		aBpUtil_Sprt01.call();
	};

	/**
	 * BpUtil_Sprt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR createBpUtil_Sprt01_CndR(){
		return mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR.create();
	}

	/**
	 * BpUtil_Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR createBpUtil_Sprt01_DtlR(){
		return mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.create();
	}

	/**
	 * BpUtil_Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> createBpUtil_Sprt01_DtlL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BpUtil_Sprt01オペレーション.<p>
	 *
	 * 取引先から個別発行フラグを取得する<br>
	 */
	abstract public class BpUtil_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpUtil_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected BpUtil_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR.create();
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.class);

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
			invoke((MSUCL_BpUtil)MSUCL_BpUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BpUtil_Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR createBpUtil_Sprt01_CndR(){
			return mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR.create();
		}

		/**
		 * BpUtil_Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR createBpUtil_Sprt01_DtlR(){
			return mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.create();
		}

		/**
		 * BpUtil_Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> createBpUtil_Sprt01_DtlL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR
		 */
		public mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0120.BpUtil_Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_BpUtil)MSUCL_BpUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}