package mcframe.serverMGBG.MGBGL5080;

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
 * "MGBGL_GaActAlcRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_GaActAlcRecvIf_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGL5080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_GaActAlcRecvIf.GaActAlcIf_Conv01 aGaActAlcIf_Conv01;

	protected void initGaActAlcIf_Conv01() {
		this.info = PDef.MG_MGBGL5080_GaActAlcIf_Conv01_INFO;
		this.aGaActAlcIf_Conv01 = ((MGBGL_GaActAlcRecvIf)this).new GaActAlcIf_Conv01();
	}

	public static MGBGL_GaActAlcRecvIf.GaActAlcIf_Conv01 crtGaActAlcIf_Conv01() {
		MGBGL_GaActAlcRecvIf lgc = new MGBGL_GaActAlcRecvIf();
		lgc.initGaActAlcIf_Conv01();
		return lgc.aGaActAlcIf_Conv01;
	}

	protected void paramGaActAlcIf_Conv01(MCParam p) {
		if (this.aGaActAlcIf_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGaActAlcIf_Conv01.up0());
		p.addUpBlock(aGaActAlcIf_Conv01.up1());
		p.addDownBlock(aGaActAlcIf_Conv01.down0());
	}

	protected void doGaActAlcIf_Conv01() {
		aGaActAlcIf_Conv01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonMGBG.MGBGR5080.DtlR createDtlR(){
		return mcframe.commonMGBG.MGBGR5080.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonMGBG.MGBGR5080.DtlR> createDtlL(){
		return MCList.create(mcframe.commonMGBG.MGBGR5080.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * GaActAlcIf_Conv01オペレーション.<p>
	 *
	 */
	abstract public class GaActAlcIf_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase06 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GaActAlcIf_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonMGBG.MGBGR5080.DtlR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected GaActAlcIf_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonMGBG.MGBGR5080.DtlR.class);
			// down0 の初期化は、superOperationのコンストラクタで行います。

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
			invoke((MGBGL_GaActAlcRecvIf)MGBGL_GaActAlcRecvIf_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonMGBG.MGBGR5080.DtlR createDtlR(){
			return mcframe.commonMGBG.MGBGR5080.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonMGBG.MGBGR5080.DtlR> createDtlL(){
			return MCList.create(mcframe.commonMGBG.MGBGR5080.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>datalevel</td></tr>
		 * 	<tr><td><br></td><td>deptcode</td></tr>
		 * 	<tr><td><br></td><td>accode</td></tr>
		 * 	<tr><td><br></td><td>subcode</td></tr>
		 * 	<tr><td><br></td><td>currcode</td></tr>
		 * 	<tr><td><br></td><td>amountdrsc</td></tr>
		 * 	<tr><td><br></td><td>taxdrsc</td></tr>
		 * 	<tr><td><br></td><td>amountcrsc</td></tr>
		 * 	<tr><td><br></td><td>taxcrsc</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.commonMGBG.MGBGR5080.DtlR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_GaActAlcRecvIf)MGBGL_GaActAlcRecvIf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}