package mcframe.commonMA.constant;

import java.math.RoundingMode;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCAppException;

abstract class MAC_RND_TYP_MC extends MAC_RND_TYP_MC_A {
	/**
	 * MAC_RND_TYPの値をMCNumberの数値丸めモードの該当する定数に変換した値を返します。
	 * 
	 * @return MAC_RND_TYPの値をMCNumberの該当する定数に変換した値
	 */
	public RoundingMode toMC() {
		// 四捨五入
		if (MAC_RND_TYP.isRNDOFF(this.value())) {
			return MCNumber.MODE_HALF_UP;
		}
		// 切り上げ
		if (MAC_RND_TYP.isRNDUP(this.value())) {
			return MCNumber.MODE_UP;
		}
		// 切捨て
		if (MAC_RND_TYP.isCUTOFF(this.value())) {
			return MCNumber.MODE_DOWN;
		}
		// その他
		throw invalidValue(this.value());
	}
	
	/**
	 * MAC_RND_TYPの値をMCNumberの数値丸めモードの該当する定数に変換した値を返します。
	 * @param value MAC_RND_TYPの値
	 * @return MAC_RND_TYPの値をMCNumberの該当する定数に変換した値
	 */
	public static RoundingMode toMC(String value) {
		MAC_RND_TYP.containsEx(value);
		MAC_RND_TYP t = MAC_RND_TYP.get(value);
		return t.toMC();
	}

}
