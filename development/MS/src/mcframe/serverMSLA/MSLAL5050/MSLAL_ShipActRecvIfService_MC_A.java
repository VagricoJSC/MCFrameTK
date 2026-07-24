package mcframe.serverMSLA.MSLAL5050;

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
 * "MSLAL_ShipActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_ShipActRecvIfService_MC_A extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService {
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
	public static final String LOGIC_ID = "MSLAL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Chk01 aShipActRecvIf_Chk01;

	protected void initShipActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5050_ShipActRecvIf_Chk01_INFO;
		this.aShipActRecvIf_Chk01 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Chk01();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Chk01 crtShipActRecvIf_Chk01() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Chk01();
		return lgc.aShipActRecvIf_Chk01;
	}

	protected void paramShipActRecvIf_Chk01(MCParam p) {
		if (this.aShipActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Chk01.up0());
		p.addDownBlock(aShipActRecvIf_Chk01.down0());
		p.addDownBlock(aShipActRecvIf_Chk01.down1());
	}

	protected void doShipActRecvIf_Chk01() {
		aShipActRecvIf_Chk01.call();
	};
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd01 aShipActRecvIf_Upd01;

	protected void initShipActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5050_ShipActRecvIf_Upd01_INFO;
		this.aShipActRecvIf_Upd01 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd01();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd01 crtShipActRecvIf_Upd01() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd01();
		return lgc.aShipActRecvIf_Upd01;
	}

	protected void paramShipActRecvIf_Upd01(MCParam p) {
		if (this.aShipActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd01.up0());
	}

	protected void doShipActRecvIf_Upd01() {
		aShipActRecvIf_Upd01.call();
	};
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd02 aShipActRecvIf_Upd02;

	protected void initShipActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5050_ShipActRecvIf_Upd02_INFO;
		this.aShipActRecvIf_Upd02 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd02();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd02 crtShipActRecvIf_Upd02() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd02();
		return lgc.aShipActRecvIf_Upd02;
	}

	protected void paramShipActRecvIf_Upd02(MCParam p) {
		if (this.aShipActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd02.up0());
		p.addUpBlock(aShipActRecvIf_Upd02.up1());
		p.addDownBlock(aShipActRecvIf_Upd02.down0());
	}

	protected void doShipActRecvIf_Upd02() {
		aShipActRecvIf_Upd02.call();
	};
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 aShipActRecvIf_Upd03;

	protected void initShipActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5050_ShipActRecvIf_Upd03_INFO;
		this.aShipActRecvIf_Upd03 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd03();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 crtShipActRecvIf_Upd03() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd03();
		return lgc.aShipActRecvIf_Upd03;
	}

	protected void paramShipActRecvIf_Upd03(MCParam p) {
		if (this.aShipActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd03.up0());
		p.addUpBlock(aShipActRecvIf_Upd03.up1());
		p.addDownBlock(aShipActRecvIf_Upd03.down0());
	}

	protected void doShipActRecvIf_Upd03() {
		aShipActRecvIf_Upd03.call();
	};
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd04 aShipActRecvIf_Upd04;

	protected void initShipActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5050_ShipActRecvIf_Upd04_INFO;
		this.aShipActRecvIf_Upd04 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd04();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd04 crtShipActRecvIf_Upd04() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd04();
		return lgc.aShipActRecvIf_Upd04;
	}

	protected void paramShipActRecvIf_Upd04(MCParam p) {
		if (this.aShipActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd04.up0());
		p.addUpBlock(aShipActRecvIf_Upd04.up1());
		p.addDownBlock(aShipActRecvIf_Upd04.down0());
	}

	protected void doShipActRecvIf_Upd04() {
		aShipActRecvIf_Upd04.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipActRecvIf_Chk01オペレーション.<p>
	 *
	 * ＥＤＩ出荷実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class ShipActRecvIf_Chk01 extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		// down1 は自動生成されません。
		//     down1 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。
			// down1 の初期化は、superOperationのコンストラクタで行います。

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//
		//
		// down1() は自動生成されません。
		//     down1 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd01オペレーション.<p>
	 *
	 * ＥＤＩ出荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class ShipActRecvIf_Upd01 extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。

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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd02オペレーション.<p>
	 *
	 * ＥＤＩ出荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、およびＥＤＩ出荷実績ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class ShipActRecvIf_Upd02 extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// up1 は自動生成されません。
		//     up1 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// up1 の初期化は、superOperationのコンストラクタで行います。
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		//
		// up1() は自動生成されません。
		//     up1 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd03オペレーション.<p>
	 *
	 * ＥＤＩ出荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class ShipActRecvIf_Upd03 extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// up1 は自動生成されません。
		//     up1 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// up1 の初期化は、superOperationのコンストラクタで行います。
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		//
		// up1() は自動生成されません。
		//     up1 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd04オペレーション.<p>
	 *
	 * ＥＤＩ出荷実績受信ＩＦ取込を行う。（入荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class ShipActRecvIf_Upd04 extends mcframe.serverMSLA.MSLAL6040.MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// up1 は自動生成されません。
		//     up1 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// up1 の初期化は、superOperationのコンストラクタで行います。
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		//
		// up1() は自動生成されません。
		//     up1 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}